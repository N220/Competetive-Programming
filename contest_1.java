// Working program with FastReader
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap; 
import java.util.Map; 
import java.io.BufferedReader; 

import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.lang.*;
public class contest_1
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
		Long n = s.nextLong();
		int days=0;
		for(int i=0;i<n;i++) {
			int arr[] = new int[3];
			arr[0]=s.nextInt();
			arr[1]=s.nextInt();
			arr[2]=s.nextInt();
            Arrays.parallelSort(arr);
            if(arr[0]==0) {
                
            	if(arr[1]!=0) {
            		System.out.println(Math.min(arr[2], arr[1]));
            	}
            	else {
            		System.out.println("0");
            	}
            	
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            else {
            	days+=arr[0];
            	days+=Math.min(arr[2]-arr[0],arr[1]);
            	System.out.println(days);
            	days=0;
            }
		}
	}
} 
