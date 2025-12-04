import java.util.*;
public class RemoveDupli {
    public static void removeDupli(int idx,String str,StringBuilder newStr,boolean map[]){
        // Base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            // duplicate
            removeDupli(idx+1, str, newStr, map);
        }else{
            map[currchar-'a']=true;
            removeDupli(idx+1, str, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        removeDupli(0,str, new StringBuilder(""),new boolean[26]);
    }
}
