import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class codeforces_165A {
	int a,b;
	int[] arr;
	static class FastReader{
		BufferedReader br;
		StringTokenizer  st;
		
		public FastReader(){
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
	int[] pair(int a,int b) {
		this.arr =new int[2];
		this.arr[0]=a;
		this.arr[1]=b;
		return arr;
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0]=ob.nextInt();
			arr[i][1]=ob.nextInt();
		}
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			int k1=arr[i][0],k2=arr[i][1];
			//System.out.println("points "+k1+" "+k2);
			boolean b1=false,b2=false,b3=false,b4=false;
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[j][0]<k1 && arr[j][1]==k2) {
					b1=true;
					//System.out.println(k1-1+" "+k2+" i:"+i);
				}
				if(arr[j][0]>k1 && arr[j][1]==k2) {
					b2=true;
					//System.out.println(k1+1+" "+k2+" i:"+i);
				}
				if(arr[j][0]==k1 && arr[j][1]<k2) {
					b3=true;
					//System.out.println(k1+" "+ (k2-1)+" i:"+i);
				}
				if(arr[j][0]==k1 && arr[j][1]>k2) {
					b4=true;
					//System.out.println(k1+" "+(k2+1)+" i:"+i);
				}
				
			}
			//System.out.println();
			if(b1&b2&b3&b4) {
				count++;
			}
		}
		System.out.println(count);
	}

}
