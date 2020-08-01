import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_Petr_and_new {
	static class FastReader{
		BufferedReader br;
		StringTokeni zer st;
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
		int sum=0,count=0;
		boolean flag
		
		=false;
		int arr[] = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i]=ob.nextInt();
			sum+=arr[i];
			if(sum>=n && !flag) {
				count=i;
				flag=true;
			}
		}
		if(sum>=n) {
			System.out.println(count+1);
			return;
		}
		count=0;
		sum=0;
		int i=0;
		while(sum<n) {
			sum+=arr[i];
			count++;
			i++;
			if(i==7 && sum<n) {
				i=0;
				count=0;
			}
		}
		System.out.println(count);
	}
}
