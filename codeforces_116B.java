import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_116B {
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
		int n = ob.nextInt(),m=ob.nextInt();
		int arr[][] = new int[n+2][m+2];
		for (int i = 1; i <=arr.length-2; i++) {
			String s = ob.next();
			for (int j = 1; j <=arr[0].length-2; j++) {
				if(s.charAt(j-1)=='.') {
					arr[i][j] = -1;
				}
				else if(s.charAt(j-1)=='P') {
					arr[i][j] = 1;
					System.out.println(i+" "+j);
				}
				else {
					arr[i][j]=2;
				}
			}
			
		}
		int count=0;
		for (int i = 1; i <=arr.length-2; i++) {
			for (int j = 1; j <=arr[0].length-2; j++) {
				if(arr[i][j]==1) {
					System.out.println("qw");
					
				}
			}
		}
		System.out.println(count);
		                                                   
	}

}
