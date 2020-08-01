import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_1282A {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
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


	}
	boolean check_equal(int a[] , int b[]) {
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[a[i]]) {
				System.out.println("check "+i+" "+a[i]+" "+b[i]);
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		for (int i = 0; i < n; i++) {
			long a = ob.nextLong(),b = ob.nextLong(),c =ob.nextLong(),r = ob.nextLong();
			long temp1 = Math.min(a, b),temp2=Math.max(a, b);
		    a= temp1;
		    b=temp2;
			if(c-r>=b || c+r<=a) {
				System.out.println(b-a);
			}
			else if(a>=c-r && b<=c+r) {
				System.out.println(0);
			}
			else if(c-r>a && c+r<b) {
				System.out.println(b-a-2*r);
			}
			else if(c+r<b){
				System.out.println(b-c-r);
			}
			else {
				System.out.println(c-r-a);
			}
		}
		
	}

}
