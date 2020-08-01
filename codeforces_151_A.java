import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforces_151_A {
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
		int n=ob.nextInt(),k=ob.nextInt(),l=ob.nextInt(),c=ob.nextInt(),d=ob.nextInt(),p=ob.nextInt(),nl=ob.nextInt(),np=ob.nextInt();
		int arr[] = new int[3];
		arr[0]=(k*l)/(n*nl);
		arr[1]=p/(n*np);
		arr[2]=(c*d)/n;
		Arrays.parallelSort(arr);
		System.out.println(arr[0]);
		
	}

}
