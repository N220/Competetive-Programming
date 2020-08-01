import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforces_189A {
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
		int n = ob.nextInt();
		int a = ob.nextInt(),b=ob.nextInt(),c=ob.nextInt();
		int max=0;
		for(int x=0;x<=n/a;x++) {
			
			for(int y=0;y<=n/b;y++) {
				if(a*x+b*y>n) {
					break;
				}
				int sum = a*x+b*y;
				if((n-sum)%c==0) {
					max=Math.max(max,x+y+(n-sum)/c);
				}
			}
		}
		System.out.println(max);
	}

}
