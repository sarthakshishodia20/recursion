public class Backtracking {
    // find substring
    public static void printSubstring(String str,int i){
        // base case
        if(i==str.length()){
            return;
        }
        StringBuilder sb=new StringBuilder("");
        for(int j=i;j<str.length();j++){
           sb.append(str.charAt(j));
           System.out.print(sb+" ");
           System.out.println();
           
           
        }
        printSubstring(str, i+1);
    }
    // find Permutations
    public static void Permutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            Permutations(newStr,ans+currChar);
        }
    }
    // find subsets
    public static void findsubset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("___");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findsubset(str, i+1, ans+str.charAt(i));
        // no choice
        findsubset(str, i+1, ans);
    }
    // change array
    public static void changeArray(int[] array,int index,int value){
        // base case
        if(index==array.length){
            printArray(array);
            return;
        }
        array[index]=value;
        changeArray(array, index+1, value+1); // function abhi array bna rha hai with the help of recursion
        array[index]=array[index]-2;

    }
    public static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" | ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array=new int[5];
        changeArray(array,0,1);
        printArray(array);
        findsubset("hello", 0, "");
        Permutations("abc","");
        printSubstring("hello", 0);
    }
    
}
