import java.util.Scanner;
public class codeforces_131A_new {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String x = ip.next();
		StringBuilder bd = new StringBuilder(x);
		if(bd.toString().equals(bd.toString().toUpperCase())) {
			System.out.println(bd.toString().toLowerCase());
		}
		else if(bd.substring(0, 1).equals(bd.substring(0, 1).toLowerCase())){
			if(bd.substring(1).equals(bd.substring(1).toUpperCase())) {
				System.out.println(bd.substring(0,1).toUpperCase()+bd.substring(1).toLowerCase());
				
			}
			else {
				System.out.println(x);
			}
			
		}
		else {
			System.out.println(x);
		}
	}

}
