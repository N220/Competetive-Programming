import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class codeforces_131A {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br =  new BufferedReader(new InputStreamReader(System.in));
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
	String upper_case(String s) {
		String k="";
		for (int i = 0; i < s.length(); i++) {
			k+=Character.toLowerCase(s.charAt(i));
			
		}
		return k;
	}
	boolean check_upper(String s) {
		boolean flag1=false,flag2=false;
		String s1 = s.substring(1);
		for (int i = 0; i < s1.length(); i++) {
			if(Character.isUpperCase(s1.charAt(i))) {
				flag1=true;
			}
			if(Character.isLowerCase(s1.charAt(i))) {
				flag2=true;
			}
			
		}
		if(flag1 && flag2) {
			return true;
		}
		return false;
	}
	boolean all_upper(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader s =  new FastReader();
		String s1 = s.next();
		codeforces_131A ob = new codeforces_131A();
		if(ob.check_upper(s1)) {
			System.out.println(s1);
			return;
		}
		if(ob.all_upper(s1)) {
			String ans="";
			for (int i = 0; i < s1.length(); i++) {
				ans+=Character.toLowerCase(s1.charAt(i));
				
			}
			System.out.println(ans);
			return;
			

		}
		s1=Character.toUpperCase(s1.charAt(0))+ob.upper_case(s1.substring(1));
		System.out.println(s1);
		}

}
