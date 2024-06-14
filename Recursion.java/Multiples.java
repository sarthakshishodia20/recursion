public class Multiples {
    public static void Multiplies(int n,int k){
        if(k==0){
            return;
        }
        // recursive work
        Multiplies(n, k-1);
        // self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Multiplies(5,4);
    }
    
}
