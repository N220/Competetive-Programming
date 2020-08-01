import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_231A {
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
		int n = ob.nextInt();
		int count=0;
		for (int i = 0; i < n; i++) {
			int sum=0;
			for (int j = 0; j < 3; j++) {
				sum+=ob.nextInt();
			}
			if(sum>=2) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
