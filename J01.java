import java.util.*;
public class J01 {
	public static void main(String[] args){

	 Scanner s = new Scanner(System.in);
	      System.out.println("첫번째 숫자를 입력사헤요");
	           int num1 = s.nextInt();
		        
              System.out.println("두번째 숫자를 입력사헤요");
	           int num2 = s.nextInt();
	      System.out.println("세번째 숫자를 입력사헤요");
		   int num3 = s.nextInt();
	           int max_num,min_num;
		if(num1 >= num2 && num1 >= num3){
	 	max_num = num1;									     }
  									                else if (num2 >= num1 && num2 >=num3){
  	        max_num = num2;
		}
		else {
		max_num = num3;
		}
		if(num1 <= num2 && num1 <= num3){
                min_num = num1;
		}
                else if(num2 <= num1 && num2 <= num3){
                min_num = num2;
		}
		else{
		min_num = num3;
		}
		System.out.print("가장 큰 수는" +max_num+"이고 가장 작은 수는" +min_num+"입니다");
		}
	}
