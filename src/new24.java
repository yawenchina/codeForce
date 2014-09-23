import java.util.*;
public class new24 {
	public static void main(String args[]){
		System.out.print(check(1));
		System.out.print(check(3));
	     System.out.print(check(9));
	}
	public static boolean check(int n){
		if(n<= 3){
			return false;
		}
		if(n==4){
			System.out.println("1*2 = 2");
			System.out.println("3*2 = 6");
			System.out.println("6*4 = 24");
			
		}
		if(n == 5){
			System.out.println("3-1 = 2");
			System.out.println("5-2 = 3");
			System.out.println("3*2 = 6");
			System.out.println("4*6 = 24");
		}
		if(n >4 && n%2 == 0){
			check(4);
			for(int i = 5; i <= n-1 ;i+=2){
				System.out.println(i+1+"-"+i);
				
			}
		}
		if(n >5 && n%2==1){
			check(5);
			for(int i = 6; i <= n-1 ;i+=2){
				System.out.println(i+1+"-"+i +"== 1 ");
				System.out.println("24*1 == 24");
				
			}
		}
		return true;
	}
}
