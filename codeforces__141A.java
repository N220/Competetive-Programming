// Working program with FastReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.StringTokenizer;



public class codeforces__141A 
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
		public String sortString(String s) {
			char arr[] =new char[s.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.charAt(i);
			}
			Arrays.parallelSort(arr);
			return new String(arr);
		}
	} 

	public static void main(String[] args) 
	{ 
		FastReader s = new FastReader();
		String s1 =  s.next();
		String s2 =  s.next();
		String s3 =  s.next();
		s1=s1+s2;
		s1=s.sortString(s1);
		s3=s.sortString(s3);
		if(s1.contentEquals(s3)) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

	} 
 
