import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class codeforces_227B {
	static class FastReader{
		BufferedReader br;
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
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n=ob.nextInt();
		HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			map.put(ob.nextInt(),i);
		}
		int m=ob.nextInt();
		long start=0,end=0;
		for (int i = 0; i < m; i++) {
			int k =ob.nextInt();
			start+=map.get(k)+1;
			end+=n-map.get(k);
			
		}
		System.out.println(start+" "+end);
	}

}
