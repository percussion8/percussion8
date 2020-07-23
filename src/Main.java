import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		long abc=a*b*c;
		String num=String.valueOf(abc);
		char[] each=num.toCharArray();
		
		for (int i = 0; i < each.length; i++) {
			System.out.println(each[i]);
		}
		
//		char[] count = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		
//		
//		for (int i = 0; i < count.length; i++) {
//			int stack=0;
//			for (int j = 0; j < count.length; j++) {
//				if(count[i]==each[j]) {
//					stack++;
//				}
//			}
//			System.out.println(stack);
//		}
		
		
	}

}
