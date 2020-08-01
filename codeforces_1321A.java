import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1321A {
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
		int n = ob.nextInt();
		int a1[] = new int[n];
		int a2 []= new int[n];
		for (int i = 0; i < a2.length; i++) {
			a1[i]=ob.nextInt();
		}
		int count1=0,count0=0;
		for (int i = 0; i < a2.length; i++) {
			a2[i]=ob.nextInt();
			if(a1[i]==0 && a2[i]==1) {
				count0++;
			}
			if(a1[i]==1 && a2[i]==0) {
				count1++;
			}
		}
		if(count1==0) {
			System.out.println(-1);
		}
		else {
			//System.out.println(count0+" "+count1);
			System.out.println((count0/count1)+1);
		}
		
				
	}

}
