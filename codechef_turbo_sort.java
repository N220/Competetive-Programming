import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codechef_turbo_sort {
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		int max  =Integer.MIN_VALUE;
		int lead=1;
		for(int i=1;i<=n;i++) {
			int s1=ob.nextInt(),s2=ob.nextInt();
			int diff=Math.abs(s1-s2);
			if(diff>max) {
				max=diff;
				if(diff>0) {
					lead=1;
				}
				else {
					lead=2;
				}
			}

		}
		System.out.println(lead+" "+max);
		
	}

}
