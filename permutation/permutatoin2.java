import java.util.*;
class pemutation2{
    static ArrayList<String> permut(String str, String res){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

         ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0,i)+ str.substring(i+1);
            ArrayList<String> temp = permut(remaining, res+ch);
            result.addAll(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        String str  = "abc";

        System.out.println(permut(str,""));
    }
}