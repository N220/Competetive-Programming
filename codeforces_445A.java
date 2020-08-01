import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_445A {
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
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt(),m=ob.nextInt();
		char arr[][] = new char[n+1][m+2];
		for (int i = 0; i < m+2; i++) {
			arr[0][i] = '-';
		}
		for (int i = 1; i < n+1; i++) {
			String s =ob.next();
			for (int j = 1; j <= s.length(); j++) {
				arr[i][j] = s.charAt(j-1);
			}
			arr[i][0]='-';
			arr[i][m+1] = '-';
			}
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < m+1; j++) {
				if(arr[i][j]!='-' && arr[i-1][j]=='-' && arr[i][j-1]=='-' && arr[i][j+1]=='-' ) {
					arr[i][j]='B';
					
				}
				else if(arr[i][j]!='-' && (arr[i-1][j]=='B' || arr[i][j-1]=='B' || arr[i][j+1]=='B'))
				else if(arr[i][j]!='-' && (arr[i-1][j]=='B' || arr[i][j-1]=='B' || arr[i][j+1]=='B')) {
					arr[i][j] = 'W';
				}
				else if(arr[i][j]!='-') {
					arr[i][j] = 'B';
				}
			}
		}
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < m+1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
