import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_contest {
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
		int n = ob.nextInt();
		for (int i = 0; i < n; i++) {
			String s1 = ob.next(),s2 = ob.next();
			int k1 = s1.length(),k2 = s2.length();
			//if(k1<k2 && s2.substring(0,k1).equals(s1) && !s1.equals(s2)) {
				//System.out.println(s1);
				//return;
			//}
			int j=0,len=Math.min(k1, k2);
			for (j= 0; j < Math.min(k1, k2);) {
				if(s1.charAt(j)==s2.charAt(j)) {
					j++;
				}
				else {
					break;
				}
			}
			if(j!=len && s1.charAt(j)<s2.charAt(j)) {
				System.out.println(s1);
			}
			else if(j==len) {
				if(len==k2) {
					System.out.println("---");
				}
				else if(len==k1) {
					System.out.println(s1);
				}
			}
			else if(j!=len && s1.charAt(j)>s2.charAt(j)) {
				int k;
				boolean flag=false;
				for( k=j;k<k1;k++) {
					if(s1.charAt(k)<s2.charAt(j)) {
						break;
					}
				}
				int k3=0;
				for( k3=j+1;k3<k1;k3++) {
					if(s1.charAt(k3)==s2.charAt(j)) {
						flag=true;
						break;
					}
				}
				if(k==k1 && k3!=k1) {
					String ans = s1.substring(0,j)+s1.charAt(k3)+s1.substring(j+1,k3)+s1.charAt(j)+s1.substring(k3+1,k1);
					System.out.println(ans);
				}
				else if(k==k1 ) {
					System.out.println("---");
				}
				else {
					String ans = s1.substring(0,j)+s1.charAt(k)+s1.substring(j+1,k)+s1.charAt(j)+s1.substring(k+1,k1);
					System.out.println(ans);
				}
			}
		}
	}

}
