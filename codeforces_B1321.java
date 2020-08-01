import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.StringTokenizer;

public class codeforces_B1321 {
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
	static boolean check_order(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int val=i-arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(j-arr[j]==val) {
					return false;
				}
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			int n = ob.nextInt();
			int arr[] =new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=ob.nextInt();		
				}
			Arrays.sort(arr);
			for(int i=arr.length-1;i>-1;i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
		}
		} 
	

}
