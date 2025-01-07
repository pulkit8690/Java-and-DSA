//package Array2D;

public class Search_BinarySearch {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };
        int key = 9;

        boolean result = search(arr, key);
        if (result) {
            System.out.println("Key " + key + " found in the array.");
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

    public static boolean search(int arr[][], int key) {
        int row = arr.length;
        int col = arr[0].length;
        int s = 0;
        int e = row * col - 1;

        while (s <= e) { 
            int mid = s + (e - s) / 2;
            if (arr[mid / col][mid % col] == key) {
                return true;
            } else if (arr[mid / col][mid % col] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }
}
