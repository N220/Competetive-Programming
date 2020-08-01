
// Working program with FastReader
import java.util.HashMap; 
import java.util.Map; 
import java.io.BufferedReader; 

import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.lang.*;
public class java_hashing
{ 
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

	public static void main(String[] args) 
	{ 
		
		FastReader s=new FastReader();
		HashMap<String,Integer> m1 = new HashMap<String,Integer>();
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			String k=s.next();
			if(m1.containsKey(k)) {
				System.out.println(k+m1.get(k));
				m1.put(k,m1.get(k)+1);
			}
			else {
				m1.put(k, 1);
				System.out.println("OK");
			}
		}
	}
} 
