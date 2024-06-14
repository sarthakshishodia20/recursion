import java.util.ArrayList;

public class CombinationSumI {
    public static void Solve(int index, int[] array, ArrayList<Integer> list, int target) {
        if (target == 0) {
            System.out.println(list);
            return;
        }
        if (target < 0 || index >= array.length) {
            return;
        }
        // Exclude the current element
        Solve(index + 1, array, list, target);
        
        // Include the current element
        list.add(array[index]);
        Solve(index, array, list, target - array[index]);
        list.remove(list.size() - 1); // Remove the last added element
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {2, 3, 6, 7};
        int target = 7;
        Solve(0, array, list, target);
    }
}
