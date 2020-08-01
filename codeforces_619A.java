import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_619A {
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
			StringBuilder a = new StringBuilder(ob.next());
			StringBuilder b = new StringBuilder(ob.next());
			StringBuilder c = new StringBuilder(ob.next());
			
			for(int i=0;i<a.length();i++) {
				if(c.charAt(i)==a.charAt(i)) {
					b.setCharAt(i, c.charAt(i));
				}
				else {
					a.setCharAt(i, c.charAt(i));
				}
			}
			if(a.toString().compareTo(b.toString())==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

		}
		
		
	}
	}


