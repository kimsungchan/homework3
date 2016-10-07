import java.util.*;
public class B04 {
       public static void main(Sgirng[] args){
          Scanner s = new Scanner(System.in);       
          System.out.print("===================");
          System.out.print("연봉을 입력하십시오");
          money = s.nextInt();
         if(money >= 80000000){
           money = money/37 
         }
         if(money >= 40000000 && money < 80000000){
           money = money/28 
         }
         if(money >= 10000000 && money < 40000000){
           money = money/19 
         }
         if(money < 10000000){
           money = money/9.5 
         }
         System.out.print("===================");  
         System.out.print("연봉 금액에 대한 소득세는" +money+ "입니다");
  } 
}  
