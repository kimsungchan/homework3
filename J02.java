import java.text.DecimalFormat;
import java.util.*;
public class J02 {
        public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. :");
	        double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		String pattern = "##.#";
		DecimalFormat dformat = new DecimalFormat(pattern);

		System.out.println("아파트의 평형은" +dformat.format(pyung_area)+"입니다");
		 
		 String pyung = null;
	         if(pyung_area >=50)
		 pyung = "대형";
		 else if(pyung_area >=30 && pyung_area <50)
		 pyung = "중형";
		 else if(pyung_area >=15 && pyung_area <30)
		 pyung = "중소형";
		 else if(pyung_area <15)
	         pyung = "소형";

                 System.out.print(pyung+ "아파트 입니다");

	}
}

