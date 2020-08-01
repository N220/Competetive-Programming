import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_282A {
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
		int sum=0;
		for (int i = 0; i < n; i++) {
			String s1 = ob.next();
			if(s1.charAt(0)=='+' || s1.charAt(1)=='+' || s1.charAt(2)=='+')  {
				sum++;
			}
			else {
				sum--;
			}
		}
		System.out.println(sum);
		
	}

}
