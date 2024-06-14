public class AllIndices {
    public static void printAll(int[] array, int num, int index) {
        if (index >= array.length) {
            return;
        }
        if (array[index] == num) {
            System.out.println(index + " ");
        }
        printAll(array, num, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1};
        int num = 1;
        printAll(array, num, 0);
    }
}
