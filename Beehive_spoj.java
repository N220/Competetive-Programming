import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
class Beehive_spoj {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null ||!st.hasMoreElements()) {
				try {
					st= new StringTokenizer(br.readLine());
					
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		while(true) {
			long k = s.nextLong();
			if(k==-1) {
				return;
			}
			long l=1;
			Long sum = new Long(l);
			if(k==1) {
				System.out.println("Y");
			}
			int count=1;
			while(sum<k) {
				sum=sum+(6*count);
				count++;
				if(sum==k) {
					System.out.println("Y");
					break;
			}
			if(sum>k) {
			System.out.println("N");
			}
		}
	}
}
}			