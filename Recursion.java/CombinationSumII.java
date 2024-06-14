import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
    ArrayList<ArrayList<Integer>> listMain;
    ArrayList<Integer> list;

    public void print(int index, int[] array, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            listMain.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < array.length; i++) {
            if (i > index && array[i] == array[i - 1]) {
                continue;
            } else {
                list.add(array[i]);
                print(i + 1, array, target - array[i]);
                list.remove(list.size() - 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> printCombo(int[] array, int target) {
        listMain = new ArrayList<>();
        list = new ArrayList<>();
        Arrays.sort(array);
        print(0, array, target);
        return listMain;
    }

    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        int[] array = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        ArrayList<ArrayList<Integer>> result = combinationSumII.printCombo(array, target);
        System.out.println(result);
    }
}
