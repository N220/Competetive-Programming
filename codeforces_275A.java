import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class codeforces_275A {
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
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	
		}
	public boolean[][] make_zero(int i,int j, boolean arr[][]) {
		for (int k = 0; k < arr.length; k++) {
			arr[i][k]=!arr[i][k];
		}
		for (int k = 0; k < arr.length; k++) {
			arr[k][j] = !arr[k][j];
		}
		arr[i][j]=!arr[i][j];
		print_arr(arr);
		System.out.println();
		
		return arr;
		
		
	}
	public void print_arr(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
					
				}
				
				
			}
			System.out.println();
		}
	}
	
		
	public static void main(String[] args) {
		FastReader s = new FastReader();
		boolean arr[][] = new boolean[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=true;
			}
		}
		codeforces_275A ob = new codeforces_275A();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int k = s.nextInt();
				if(k%2!=0) {
					arr=ob.make_zero(i, j, arr);
				}
			}
			
		}
		ob.print_arr(arr);
		
	}
	}


