
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class codeforces_133A {
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
		String s1 = ob.next();
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='H' || s1.charAt(i)=='Q' || s1.charAt(i)=='9') {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}
}
