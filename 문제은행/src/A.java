import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) {
			Random r = new Random();
			int num = r.nextInt(101);
			arr[i] = num;					// 30�������� �迭�� �������� ����
		}
		
		// ��������
		System.out.println(Arrays.toString(arr)); 	// ���� ��
		int temp;
		for(int i=0; i<arr.length-1; i++) {			// ���ʺ��� 2���� �� ���Ͽ� ũ�� ���������� �̵�
			for(int j=0; j<arr.length-1-i; j++) {	// ���� �����ʺ��� ���� ū ���� Ȯ���Ǿ� �ݺ��� -i����
				if (arr[j] > arr[j+1]) {			
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}											// �������� ���ĿϷ�. (<�� �������� ��)
		
		System.out.println(Arrays.toString(arr));	// ���� ��
	}
}


//// ��������(sort)
//System.out.println(Arrays.toString(arr));	// ���� ��
//Arrays.sort(arr);	// ������������ ������
//System.out.println(Arrays.toString(arr));	// ���� ��
//System.out.println();
//


//// ��������(Collection Ŭ���� ���)
//System.out.println(Arrays.toString(arr));	// ���� ��(�������� �Ǿ�����)
//Arrays.sort(arr, Collections.reverseOrder());
