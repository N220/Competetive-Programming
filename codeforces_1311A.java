import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1311A {
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
		for (int i1 = 0; i1 < t; i1++) {
			int a=ob.nextInt(),b=ob.nextInt();
			int sum=(a%2)+(b%2);
			if(b==a) {
				System.out.println(0);
				}
			
			else if(b>a) {
				
				if(sum%2==0) {
					System.out.println(2);
				}
				else {
					System.out.println(1);
				}
			}
			else {
				if(sum%2==0) {
					System.out.println(1);
				}
				else {
					System.out.println(2);
				}
			}

		}
		
	}

}
