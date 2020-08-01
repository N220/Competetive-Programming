import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codeforces_1282B1 {
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
		int t = ob.nextInt();
		for (int i = 0; i < t; i++) {
			int n =ob.nextInt(),p = ob.nextInt(),k=ob.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = ob.nextInt();
			}
			Arrays.parallelSort(arr);
			if(p<arr[0]) {
				System.out.println(0);
			}
			else {
				int count1=0,count2=0;
				int p1=p,p2=p;
				for (int j = 1; j < arr.length;) {
					if(p1>=arr[j]) {
						p1=p1-arr[j];
						j+=2;
						count1+=2;
						//System.out.println(j);
					}
					else {
						break;
					}
				}
				if(n%2!=0 && p1>=arr[n-1]) {
					count1+=1;
				}
				count2=1;
				p2-=arr[0];
				for (int j = 2; j < arr.length; ) {
					if(p2>=arr[j]) {
						p2-=arr[j];
						j+=2;
						count2+=2;
					}
					else {
						break;
					}
				}
				if(n%2==0 && p2>=arr[n-1]) {
					count2++;
				}
				System.out.println(Math.max(count1, count2));
			}
				
	}

	}
}
