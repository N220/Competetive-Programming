
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class codeforces_337A {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br =  new BufferedReader(new InputStreamReader(System.in));
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
		FastReader s  =new FastReader();
		int n=s.nextInt(),m=s.nextInt();
		int arr[] = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		Arrays.parallelSort(arr);
		System.out.println(arr[m-1]-arr[Math.max(0,m-1-n)]);
	}
}