import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforces_141A {
	public static class FastReader{
		StringTokenizer st;
		BufferedReader br;
		public FastReader() {
			br =  new BufferedReader(new InputStreamReader(System.in));
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
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public String sortString(String s) {
			char arr[] =new char[s.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.charAt(i);
			}
			Arrays.parallelSort(arr);
			return new String(arr);
		}
		
	}	
		

	public static void main(String[] args) {
		FastReader s = new FastReader();
		String s1 =  s.next();
		String s2 =  s.next();
		String s3 =  s.next();
		s1=s1+s2;
		s1=s.sortString(s1);
		s3=s.sortString(s3);
		if(s1.contentEquals(s3)) {
			System.out.println("Yes");
			return;
		}
		System.out.println("NO");
	}

}

