import java.util.HashMap;
import java.util.Scanner;

public class codeforces_boy_or_girl {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String st = in.next();
		int count=0;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < st.length(); i++) {
			String s1="";
			s1+=st.charAt(i);
			if(!map.containsKey(s1)) {
				count++;
				map.put(s1,0);
			}
		}
		if(count%2==0) {
			System.out.println("CHAT WITH HER!\n");
			return;
			
		}
		System.out.println("IGNORE HIM!");
		
		
	}

}
