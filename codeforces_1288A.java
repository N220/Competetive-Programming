import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1288A {
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
		int t= ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			int n = ob.nextInt();
			int d = ob.nextInt();
			if(d<=n) {
				System.out.println("YES");
			}
			else {
				boolean flag=false;
				for(int i=1;i<=n;) {
					double d1 =d;
					double i2=i;
					double k2 = d1/(i2+1);
					double k = Math.ceil(k2);
					if(i+(int)k<=n) {
						//System.out.println(i+" "+k2+" "+k);
						System.out.println("YES");
						flag=true;
						break;
					}
					i++;
				}
				if(!flag) {
					System.out.println("NO");
				}
			}
		}
	}
}
