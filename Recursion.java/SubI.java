import java.util.ArrayList;

public class SubI {
    public static void UniqueSubset(int[] array,int index,ArrayList<Integer> list){
        System.out.println(list);
        for(int i=index;i<array.length;i++){
            if(i>index && array[i]==array[i-1]){
                continue;
            }
            list.add(array[index]);
            UniqueSubset(array, i+1, list);
            list.remove(list.size()-1);
        }
    }
    // import java.util.ArrayList;{
    public static void printSubset(int[] array, int i, ArrayList<Integer> list) {
        if (i == array.length) {
            System.out.println(list);
            return;
        }
        list.add(array[i]);
        printSubset(array, i + 1, list);

        list.remove(list.size() - 1);
        printSubset(array, i + 1, list);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        ArrayList<Integer> list = new ArrayList<>();
        printSubset(array, 0, list);
        System.out.println();
        UniqueSubset(array, 0, list);
    }
}


