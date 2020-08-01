import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class project_euler_7 {
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
		int arr[] = new int[10000000];
		int n = 10000000;
		for(int i=2;i<n;i++) {
			for(int j=2*i;j<n;) {
				arr[j]=-1;
				j+=i;
			}
		}
		int k=0;
		for(int i=2;i<n;i++) {
			if(arr[i]==0) {
				k++;
			}
			if(k==10001) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(k);
	}

}
