import java.util.*;
public class B04 {
       public static void main(String[] args){
          Scanner s = new Scanner(System.in);       
          System.out.print("===================");
          System.out.print("연봉을 입력하십시오");
          double money = s.nextInt();
         if(money >= 80000000){
           money = money*0.37; 
         }
         else if(money >= 40000000 && money < 80000000){
           money = money*0.28; 
         }
         else if(money >= 10000000 && money < 40000000){
           money = money*0.19; 
         }
         else if(money < 10000000){
           money = money*0.095; 
         }
         System.out.print("===================");  
         System.out.print("연봉 금액에 대한 소득세는" +money+ "입니다");
  } 
}  
