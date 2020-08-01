import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class atcoder_148A{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
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
	}
	int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int a = ob.nextInt(),b= ob.nextInt();
		int gcd=0;
		gcd = 
		System.out.println(gcd);
	}

}
