import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class codeforces_1321B {
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
	public static void sortbyColumn(long arr[][],int col) {
		Arrays.parallelSort(arr,new Comparator<long[]>() {
			public int compare(final long[] entry1,final long[] entry2) {
				if(entry1[col]>entry2[col]) {
					return 1;
				}
				else {
					return -1;
				}
			}
		});
	}
	
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		long b[] = new long[n];
		for (int i = 0; i < b.length; i++) {
			b[i]=ob.nextLong();
		}
		long max=0;
		long ans[][] = new long[n][2];
		for(int i=0;i<n;i++) {
			ans[i][0]=i-b[i];
			ans[i][1]=b[i];
		}
		long sum=0;
		sortbyColumn(ans, 0);
		int i=0;
		for ( i = 0; i < n-1;i++) {
			sum+=ans[i][1];
			if(ans[i][0]!=ans[i+1][0]) {
				max=Math.max(sum, max);
				sum=0;
			}
		}
		max=Math.max(sum+ans[i][1],max);
		System.out.println(max);
		
	}

}
