import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_330A {
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
		int arr[][] = new int[n][m];
		int count[] = new int[n];
		int column[] = new int[m];
		int ans=0;
		for (int i = 0; i < n; i++) {
			String s =ob.next();
			for (int j = 0; j < m; j++) {
				if(s.charAt(j)=='S') {
					arr[i][j]=-1;
					count[i]=1;
					column[j]=1;
				}
				else {
					arr[i][j]=1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if(count[i]!=1) {
				for (int j = 0; j < m; j++) {
					arr[i][j]=0;
					ans++;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			if(column[i]!=1) {
				for (int j = 0; j < n; j++) {
					ans+=arr[j][i];
				}
			}
		}
		System.out.println(ans);
		
	}

}
