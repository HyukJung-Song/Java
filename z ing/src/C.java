import java.util.Arrays;
import javax.swing.JOptionPane;


public class C {
	
	public static void main(String[] args) {
		
		int[] arr = {'1','2'};
		int[] arr2 = {'3', '4'};
		char[] arr3 = {'a', 'b'};
		char[] arr4 = {'c', 'd'};
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print(arr3);
		System.out.print(" ");
		System.out.println(arr4);
		System.out.println(arr3 + " ggss");
		
		JOptionPane.showMessageDialog(null, "기본 알림창입니다.");
		
		String str = "a";
		str += "1" + "2";
		System.out.println(str);

	}
	
}