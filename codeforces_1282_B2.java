import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforces_1282_B2 {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
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


	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i = 0; i < t; i++) {
			int n = ob.nextInt(),p = ob.nextInt(),k=ob.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = ob.nextInt();
			}
			Arrays.parallelSort(arr);
			int pref=0,ans=0;
			for (int i1 = 0; i1 < k; i1++) {
				int sum = pref;
				if(sum>p) {
					break;
				}
				int count=i1;
				for (int j = i1+k-1; j < arr.length; j+=k) {
					if(sum+arr[j]<=p) {
						count+=k;
						sum+=arr[j];
						//System.out.println(count);
					}
					else {
						break;
					}
				}
				pref+=arr[i1];
				ans = Math.max(ans, count);
			}
			System.out.println(ans);
		}
	}

}
