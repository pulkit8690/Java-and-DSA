public class Grid_Ways2 {

    public static void findPaths(int i, int j, int n, int m, char[] path, int index) {
        // Base case
        if (i == n - 1 && j == m - 1) {
            // Print the current path
            for (int k = 0; k < index; k++) {
                System.out.print(path[k]);
            }
            System.out.println();
            return;
        }
        
        // Move down if within grid bounds
        if (i < n - 1) {
            path[index] = 'D';  // D for Down
            findPaths(i + 1, j, n, m, path, index + 1);
        }
        
        // Move right if within grid bounds
        if (j < m - 1) {
            path[index] = 'R';  // R for Right
            findPaths(i, j + 1, n, m, path, index + 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        char[] path = new char[n -1 + m -1];  // Total steps = (n-1) + (m-1)
        findPaths(0, 0, n, m, path, 0);
    }
}
