//Line 52
//The mistake here was I did not increment j++ properly 
//and while debugging I did not carefully do dry run.Lesson: Do ruthless dry run.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;


public class codeforces_266B {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	
	}
	public static void main(String[] args) {
		FastReader  s = new FastReader();
		int n = s.nextInt(),t=s.nextInt();
		int arr[] = new int[n];
		String s1 = s.next();
		for (int i = 0; i < arr.length; i++) {
			if(s1.charAt(i)=='B') {
				arr[i]=0;
			}
			else {
				arr[i]=-1;
			}
		}
		for(int i=0;i<t;i++) {
			int j=0;
			for (j = 0; j < arr.length-1;) { //The mistake here was I did not increment j++ properly and while debugging I did not carefully do dry run.Lesson: Do ruthless dry run.
				if(arr[j]==0 & arr[j+1]==-1) {
					arr[j]=-1;
					arr[j+1]=0;
					j=j+2;
				}
				else {
					j++;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				System.out.print('B');
			}
			else {
				System.out.print('G');
			}
		}
		
		
		                                                                                                   

}
}
