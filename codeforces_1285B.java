import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1285B {
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i = 0; i < t; i++) {
			int n =ob.nextInt();
			long arr[] = new long[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = ob.nextLong();
			}
			long sum=0;
			boolean flag=true;
			for (int j = 0; j < arr.length; j++) {
				sum+=arr[j];
				if(sum<=0) {
					//System.out.println(sum);
					flag=false;
					break;
				}
			}
			sum=0;
			for (int j = n-1; j >-1; j--) {
				sum+=arr[j];
				if(sum<=0) {
					//System.out.println(sum);
					flag=false;
					break;
					
				}
			}
			if(flag) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
