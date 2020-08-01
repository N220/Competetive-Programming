import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1288B {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
			
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
			int A = ob.nextInt(),B=ob.nextInt();
			long count=0;
			int b=9;
			String s="9";
			while(b<=B) {
				int a=1;
				while(a<=A) {
					count++;
					a++;
				}
				s=s+"9";
				b=Integer.parseInt(s);
			}
			System.out.println(count);

		}
		
	}

}
