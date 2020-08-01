import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class project_euler_10 {
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
		int arr[] = new int[2000000];
		int n = 2000000;
		long sum=0;
		for(int i=2;i<n;i++) {
			for(int j=2*i;j<n;) {
				arr[j]=-1;
				j+=i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=-1) {
				sum+=i;
				if(i<1000) {
					System.out.println(i);
				}
			}
		}
		System.out.println(sum-1);
	}

}
