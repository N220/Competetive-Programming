import java.util.Scanner;
public class spoj_last_digit {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		for (int i = 0; i < n; i++) {
			int a = ob.nextInt(),b = ob.nextInt();
			if(a%10==0 || a%10==1 || a%10==5 || a%10==6) {
				System.out.println(a%10);
			}
			else if(a%10==9) {
				System.out.println((int)Math.pow(9, b%2));
			}
			else if(a%10==3) {
				System.out.println((int)Math.pow(3, b%4)%10);
			}
			else if(a%10==2) {
				if(b%4==0) {
					System.out.println(6);
				}
				else {
					System.out.println((int)Math.pow(2, b%4));
				}
			}
			else if(a%10==4) {
				if(b%2==0) {
					System.out.println(6);
				}
				else {
					System.out.println(4);
				}
			}
			else if(a%10==7) {
				System.out.println((int)Math.pow(7, b%4)%10);
			}
			else if(a%10==8) {
				if(b%4==0) {
					System.out.println(6);
				}
				else {
					System.out.println((int)Math.pow(8, b%4));
				}
			}
		}
	}
}
