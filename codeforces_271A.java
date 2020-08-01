import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class codeforces_271A {
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
	boolean check_digits_different(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		while(n>0) {
			if(map.containsKey(n%10)) {
				return  false;
			}
			else {
				map.put(n%10, n%10);
				n=n/10;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		n++;
		codeforces_271A ob = new codeforces_271A();
		while(true) {
			if(ob.check_digits_different(n)) {
				System.out.println(n);
				return;
			}
			else {
				n++;
			}
		}
		
	}

}
