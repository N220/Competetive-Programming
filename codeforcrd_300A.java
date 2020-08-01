import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforcrd_300A {
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
		int arr[] = new int[n];
		int i1=0,i2=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
			if(arr[i]<0) {
				i1++;
			}
			if(arr[i]>0) {
				i2++;
			}
		}
		Arrays.parallelSort(arr);
		System.out.println(1+" "+arr[0]);
		if(i2==0) {
			System.out.println(2+" "+arr[1]+" "+arr[2]);
			System.out.print(arr.length-3+" ");
			for (int i = 3; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
		else {
			System.out.print(i2+" ");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>0) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			System.out.print(arr.length-i2-1+" ");
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]<=0) {
					System.out.print(arr[i]);
				}
			}
		}
		
		
	}

}
