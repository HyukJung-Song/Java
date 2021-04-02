package class_1;
import java.util.Scanner; //이아림class

public class Circle {

   double userNumber = 0;
   double circleArea = 0;

   public void inputData() {
      System.out.println("반지름을 입력해주세요.(값은 소수 둘째자리까지)(원주율:3.14로가정)");
      Scanner scanner = new Scanner(System.in);
      String userinputNum = scanner.nextLine();
      userNumber = Double.parseDouble(userinputNum);
   }

   public void calcArea() {
      circleArea = Math.round(userNumber * userNumber * (3.14) * 100) / (double) 100; //소수점둘째자리까지나타내기.
      System.out.println("원넓이 : " + circleArea );
   }
}
