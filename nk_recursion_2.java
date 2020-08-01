import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nk_recursion_2 {
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
	static boolean check_order(int arr[],int index) {
		if(arr.length==1 || index+1 == arr.length) {
			return true;
		}
		if(arr[index]<=arr[index+1]) {
			return check_order(arr, index+1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		FastReader ob =new FastReader();
		int n = ob.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ob.nextInt();
		}
		System.out.println(check_order(arr,0));;
	}

}
