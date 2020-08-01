import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class project_euler_3 {
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
		long n = (long)600851475143L;
		long max=0;
		int arr[] = new int[100000];
		int n1 = 100000;
		for(int i=2;i<100000;i++) {
			for(int j=i*2;j<n1;) {
				arr[j]=-1;
				j+=i;
			}
		}
		int prime[] = new int[10000];
		int k=0;
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]==0 && n%i==0) {
				while(n%i==0) {
					n=n/i;
				}
				prime[k]=i;
				System.out.println(i);
				k++;
			}
		}
		max=0;
		System.out.println(n);
		for(int i=0;i<prime.length;i++) {
			max=Math.max(max,prime[i]);
			//System.out.println(max);
		}
		//System.out.println(max);
		System.out.println(n);
	}
	

}
