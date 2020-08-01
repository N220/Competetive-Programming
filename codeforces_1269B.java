import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class codeforces_1269B{
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
	int[] modify(int a[],int x,int m) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (a[i]+x)%m;
			//System.out.println("modify "+a[i]);
		}
		return a;
	}
	void print_arr(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt(),m = ob.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ob.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = ob.nextInt();
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		codeforces_1269B ob2 = new codeforces_1269B();
		int x=0;
		while(true) {
			if(x==3) {
				break;
			}
			a = ob2.modify(a,x,m);
			if(ob2.check_equal(a, b)) {
				System.out.println(x);
				return;
			}
			x++;
			if(x==Integer.MAX_VALUE) {
				break;
			}
			
		}
	}
}
