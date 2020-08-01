import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_div3_B_627 {
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
		int t =ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			long s = ob.nextLong();
			long sum=0;
			long k = 0;
			while(s>0) {
                k+=s%10;
                s=s-(s%10);
                sum+=s;
                s=s/10;
                if(s<10) {
                	s+=k;
                	k=0;
                }
			}
			System.out.println(sum);

		}
		
	}

}
