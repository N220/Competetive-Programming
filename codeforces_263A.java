import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_263A {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}
		 String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st= new StringTokenizer(br.readLine());
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
		FastReader s  = new FastReader();
		int c1=0,c2=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int k = s.nextInt();
				if(k==1) {
					c1=i;
					c2=j;
				}
			}
		}
		System.out.println(Math.abs(c1-2)+Math.abs(c2-2));
		
	}
}


