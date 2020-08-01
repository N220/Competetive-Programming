import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class project_euler_4 {
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
	static boolean is_palindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;		
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int i=100;
		int max=0;
		for(i=100;i<=999;i++) {
			for(int j=100;j<=999;j++) {
				if(is_palindrome(Integer.toString(i*j))) {
					max=Math.max(max, i*j);
				}
			}
		}
		System.out.println(max);
		
	} 
	

}
