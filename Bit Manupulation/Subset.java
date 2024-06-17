import java.util.ArrayList;

public class Subset {
    public static ArrayList<ArrayList<Integer>> totalSubsets(int arr[]) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int numberOfSubsets = 1 << n;
        for (int num = 0; num < numberOfSubsets; num++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    sublist.add(arr[i]);
                }
            }
            ans.add(sublist);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2 };
        System.out.println(totalSubsets(arr));
    }
}
