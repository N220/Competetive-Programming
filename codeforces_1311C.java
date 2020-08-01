import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1311C {
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
			int n = ob.nextInt(),m=ob.nextInt();
			int arr[] = new int[26];
			String s = ob.next();
			int p[] = new int[m];
			for (int i = 0; i < p.length; i++) {
				p[i]=ob.nextInt()-1;
			}
			int cnt[]=new int[n];
			for (int i = 0; i < p.length; i++) {
				cnt[p[i]]++;
			}
			for(int i=n-1;i>0;i--) {
				cnt[i-1]+=cnt[i];
			}
			for(int i=0;i<s.length();i++) {
				arr[s.charAt(i)-'a']+=cnt[i]+1;
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		

		}
		
	}

}
