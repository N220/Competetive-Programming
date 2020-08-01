import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class nk_backT_p3 {
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
	static void binary_print(int n,int arr[] ) {
		if(n==arr.length) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		arr[n]=0;
		binary_print(n+1, arr);
		arr[n]=1;
		binary_print(n+1, arr);
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int m = ob.nextInt();
		int arr[]= new int[m];
		binary_print(0,arr);
	}

}
