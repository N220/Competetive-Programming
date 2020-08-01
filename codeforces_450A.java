import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_450A {
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
		int n=ob.nextInt(),m=ob.nextInt();
		int max=0,index=0;
		for (int i = 0; i < n; i++) {
			int k = ob.nextInt();
			if(k>m && k%m!=0) {
				
				k=(k/m + 1)*m;
				//System.out.println("k: "+k);
			}
			if(max<=k) {
				index=i;
				max=k;
			}
		}
		System.out.println(index+1);
	}

}
