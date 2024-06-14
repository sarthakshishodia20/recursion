import java.util.*;
public class PallindromePartition {
    public static void helper(String s,ArrayList<ArrayList<String>> result,ArrayList<String> temp){
        if(s.length()==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0, i+1);
            if(isPallindrome(left)){
                temp.add(left);
                helper(s.substring(i+1),result,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPallindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aaabb";
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        helper(s,result,temp);
        System.out.println(result);
    }
    
}
