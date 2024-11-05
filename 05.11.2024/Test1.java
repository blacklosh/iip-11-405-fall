import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a % 2 == 0 & a > 10) {
			System.out.println("ДА");
		} else {
			System.out.println("НЕТ");
		}
	}

}
