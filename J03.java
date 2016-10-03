import java.util.*;
public class J03 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("월을 입력하시오. :");
	int month = s.nextInt();						System.out.print("일을 입력하시오. :");					int day = s.nextInt();
	int day_count = 0;


	switch(month){
	case 12 : day_count = 334+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
        case 11 : day_count = 304+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 10 : day_count = 273+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
        case 9 : day_count = 243+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 8 : day_count = 212+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 7 : day_count = 181+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 6 : day_count = 151+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 5 : day_count = 120+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;					  case 4 : day_count = 90+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 3 : day_count = 59+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
	case 2 : day_count = 31+day; System.out.print("이 날짜는 1년 중" +day_count+ "번째 날에 해당됩니다. "); break;
        default : System.out.print("잘못된 날짜를 입력하셨습니다"); break;
	}
     }
  }

