import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*; 

public class codeforces_1294B {
	static class FastReader{
		BufferedReader br ;
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
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	public static void sortByColumn(int arr[][],int col) {
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(final int[] entry1,final int[] entry2) {
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
		int t =ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			int n = ob.nextInt();
			int arr[][] = new int[n+1][2];
			for (int i = 1; i < arr.length; i++) {
				arr[i][0]=ob.nextInt();
				arr[i][1]=ob.nextInt();
			}
			arr[0][0]=-1;
			sortByColumn(arr, 0);
			arr[0][0]=0;
			String ans="";
			boolean flag=true;
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i][0]<arr[i+1][0] && arr[i][1]-arr[i+1][1]>0) {
					flag=false;
					break;
				}
				
				int x1=arr[i][0],y1=arr[i][1];
				while(x1<arr[i+1][0]) {
					ans+="R";
					x1++;
				}
				while(y1<arr[i+1][1]) {
					ans+="U";
					y1++;
				}
			}
			if(flag) {
				System.out.println("YES");
				System.out.println(ans);
			}
			else {
				System.out.println("NO");
			}

		}
		
	}

}
