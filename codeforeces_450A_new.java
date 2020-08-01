import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList; 
import java.util.Queue;

public class codeforeces_450A_new {
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
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		int n= ob.nextInt();
		int m= ob.nextInt();
		for (int i = 0; i < n; i++) {
			int k=ob.nextInt();
			if(k>m && k%m!=0) {
				k=(k/m +1)*m;
			}
			q1.add(k);
			q2.add(i+1);
		}
		int count=0;
		while(!q1.isEmpty()) {
			if(q1.peek()<=m) {
				q1.remove();
				int head2 = q2.peek();
				q2.remove();
				
				if(q2.isEmpty()) {
					count=head2;
				}
			}
			else {
				int head1=q1.peek()-m;
				int head2=q2.peek();
				//System.out.println("head "+head1);
				//System.out.println("postion "+head2);
				q1.remove();
				q2.remove();
				q1.add(head1);
				q2.add(head2);
				if(q2.isEmpty()) {
					count=head2;
				}
			}
		}
		System.out.println(count);
	}

}
