import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class codeforces_1293A {
	static class FastReader{
		BufferedReader br ;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			int n = ob.nextInt(),s=ob.nextInt(),k=ob.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=0;i<k;i++) {
				map.put(ob.nextInt(), 0);
			}
			int prev=s-1,next=s+1;
			boolean flag=true;
			if(!map.containsKey(s)) {
				System.out.println(0);
			}
			else {
				int i=s,i2=Integer.MAX_VALUE,i3=Integer.MIN_VALUE;
				for(;i<=n;i++) {
					if(!map.containsKey(i)) {
						i2=i;
						break;
					}
				}
				for(i=s;i>0;i--) {
					if(!map.containsKey(i)) {
						i3=i;
						break;
					}
				}
				i3=Math.min(i2-s, s-i3);
				System.out.println(i3);
			}
				
		}
		
	}

}
