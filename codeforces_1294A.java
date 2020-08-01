import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1294A {
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
			
			int a = ob.nextInt(),b=ob.nextInt(),c=ob.nextInt(),n=ob.nextInt();
			
			if((a+b+c+n)%3==0 && (a+b+c+n)/3>=a && (a+b+c+n)/3>=b && (a+b+c+n)/3>=c) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		
	}

}
