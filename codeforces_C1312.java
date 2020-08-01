import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_C1312 {
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
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		 int t = ob.nextInt();
		 for (int i1 = 0; i1 < t; i1++) {
			 int n=ob.nextInt(),k=ob.nextInt();
			 long arr[]=new long[n];
			 boolean flag=true;
			 for (int i = 0; i < arr.length; i++) {
				arr[i]=ob.nextInt();
				if(arr[i]!=0) {
					flag=false;
				}
			}
			 if(flag) {
				 System.out.println("YES");
			 }
			 for (int i = 0; i < arr.length; i++) {
				long temp=arr[i];
				if(temp!=0) {
					for(int j=1;temp>0;) {
						int count=0;
						while(count<j*i) {
							if(temp%k!=0) {
								System.out.println("NO");
								return;
							}
							temp=temp/k;
							count++;
						}
					}
				}
				
			}
			 

		}
				
	}

}
