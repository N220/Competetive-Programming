import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_Parallelepiped {
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
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int x1=ob.nextInt(),x2=ob.nextInt(),x3=ob.nextInt();
		int a,b,c;
		for (int i = 1; i <=Math.min(x1, x3); i++) {
			if((x1/i)*i==x1 && (x1/i)*(x3/i)==x2 && (x3/i)*i==x3) {
				System.out.println(4*((i)+(x1/i)+(x3/i)));
				return;
			}
		}
		
	}

}
