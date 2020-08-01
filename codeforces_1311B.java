import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class codeforces_1311B {
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
	static boolean is_sorted(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int t = ob.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			int n=ob.nextInt(),m=ob.nextInt();
			int arr[]=new int[n];
			int p[]= new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=ob.nextInt();
			}
			for (int i = 0; i < p.length; i++) {
				p[i]=ob.nextInt()-1;
			}
			if(is_sorted(arr)) {
				System.out.println("YES");
			}
			else {
				boolean flag=false;
				while(true && !flag) {
					flag=true;
					for (int i = 0; i < p.length; i++) {
						if(arr[p[i]]>arr[p[i]+1]) {
							int temp=arr[p[i]];
							arr[p[i]]=arr[p[i]+1];
							arr[p[i]+1]=temp;
							flag=false;
						}
					}
					
				}
				if(is_sorted(arr)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}

		}
		
				
	}

}
