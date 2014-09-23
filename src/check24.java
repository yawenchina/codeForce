import java.util.*;
public class check24 {
	public static void main(String args[]){
		//System.out.print(check(1));
		check(3);
		//System.out.print(check(8));
	}
	public static void check(int m ){
		int res = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 1;i <= m;i++){
			res*=i;
			result.add(i);
		}
		if( res < 24){
			return ;
		}
		 checkCom(result);
		
	}
	public static void checkCom(ArrayList<Integer> result){
		if(result.size() ==1){
			if( result.get(0) ==24){
				System.out.print("get it");
			};
		}
		int temp = 0;
		int temp1 = 0;
		for(int i = 0; i < result.size();i++){
			for(int j = 1; j < result.size();i++){
			     temp = result.get(i);
				 temp1 = result.get(j);
				result.remove(i);
				result.remove(j);
				print(result);
				
			}
		}
		result.add(temp1*temp);
		checkCom(result);
	}
	public static void print(ArrayList<Integer> result){
		int i = 0;
		while(i < result.size()){
			System.out.print(result.get(i));
		}
		System.out.println("");
	}
	
}
