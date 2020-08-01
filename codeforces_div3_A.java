import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_div3_A {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
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
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i1 = 0; i1 < 2*t; i1++) {
			int n = ob.nextInt();
			boolean flag=false;
			boolean odd=false;
			long sum=0;
			for(int i=0;i<n;i++) {
				int k = ob.nextInt();
				if(k%2!=0) {
					flag=true;
				}
				else {
					odd=true;
				}
				sum+=k;
			}
			if(!flag || (!odd && n%2==0)) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}

		}
		
	}
	
	

}
