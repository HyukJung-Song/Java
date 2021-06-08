public class A {

	public static void main(String[] args) {
		
		String str = "ABC";
		int n = str.length();
		char[] arr = str.toCharArray();
		boolean visited[] = new boolean[n];
		for(int i=0; i<n; i++) {
			visited[i] = false;
		}
		char[] branch = new char[n];
		generatePermutations(arr, n, branch, -1, visited);
	}
	
	static void generatePermutations(char[] arr, int size, char[] branch, int level, boolean[] visited)
    {
        if (level >= size-1)
        {
            System.out.println(branch);
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
