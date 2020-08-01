import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_xenia_ring_road {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
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

}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		String s1 = "po",s2="desu",s3="mnida";
		for (int i = 0; i < n; i++) {
			String input = ob.next();
			int k = input.length();
			if(input.substring(k-2, k).equals(s1)) {
				System.out.println("FILIPINO");
			}
			else if(input.substring(k-4, k).equals(s2) || input.substring(k-4, k).equals("masu")) {
				System.out.println("JAPANESE");
			}
			else if(input.substring(k-5, k).equals(s3)) {
				System.out.println("KOREAN");
			} 
		}
		
	}
}
