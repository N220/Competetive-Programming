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
public class codechef_1 {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
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
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	int[] multiply(int arr[],int count,int m[]) {
		for(int i=0;i<count;i++) {
			
		}
		return arr;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int arr[] = new int[200];
		for(int i=0;i<n;i++) {
			int k = s.nextInt();
			arr[199]=k%10;
			arr[198]=(k/10)%10;
			arr[197]=k/100;
			k=k-1;
			while(k>1) {
				int temp=0;
				int j=0;
				for ( j = 0; j < arr.length; j++) {
					if(arr[j]==0) {
						break;
					}
					int sum=arr[j]*k;
					arr[j]=sum%10;
					temp=sum/10;
					System.out.println(temp);
				}
				System.out.println(temp);
				while(temp>0) {
					arr[j]=temp%10;
					temp=temp/10;
					j++;
				}
				k=k-1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
