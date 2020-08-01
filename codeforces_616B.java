import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class codeforces_616B {
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
			int n = ob.nextInt();
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			boolean flag = true;
			for(int i=0;i<n;i++) {
				int k = ob.nextInt();
				if(map.containsKey(k)) {
					map.put(k, map.get(k)+1);
				}
				else {
					map.put(k, 1);
				}
			}
			for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
				int k = entry.getKey();
				int v = entry.getValue();
				if()
			}

		}
		
	
	}

}
