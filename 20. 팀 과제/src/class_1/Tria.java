package class_1;
import java.util.Scanner; //배영현class

public class Tria {
   double lowerLine;
   double height;
   double area;
   
   public void inputData() {
      Scanner s = new Scanner(System.in);
      System.out.println("밑변을 입력해주세요");
      lowerLine = s.nextDouble();
      
      System.out.println("높이를 입력해주세요");
      height = s.nextDouble();
      
      System.out.println("연산중...");
   }
   
   public void calcArea() {
      area = (lowerLine * height) / 2;
      System.out.println("삼각형의 넓이 : " + Math.round(area*100)/(double)100);
   }
}
