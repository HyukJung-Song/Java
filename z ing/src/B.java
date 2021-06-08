import java.util.Arrays;
import java.util.Scanner;

public class B {
	
	// BJ 10974
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] array = new int[num];
		int[] branch = new int[num];
		boolean visited[] = new boolean[num];
		for(int i=0; i<num; i++) {
			array[i] = i+1;
			visited[i] = false;
		}
		generatePermutations(array, num, branch, -1, visited);
	}
	
	static void generatePermutations(int[] arr, int size, int[] branch, int level, boolean[] visited)
    {
        if (level >= size-1)
        {
        	String str = "";
        	for (int i : branch) {
        		str += i + " ";
        	}
            System.out.println(str);
            return;
        }
        
        for (int i = 0; i < size; i++)
        {
            if (!visited[i])
            {
                branch[++level] = arr[i];
                visited[i] = true;
                generatePermutations(arr, size, branch, level, visited);
                visited[i] = false;
                level--;
            }
        }
    }
	

}
