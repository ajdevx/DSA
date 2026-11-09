class pemutation{
    static void permut(String str, String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0,i)+ str.substring(i+1);
            permut(remaining, res+ch);
        }
    }
    public static void main(String[] args) {
        String str  = "abc";

        permut(str,"");
    }
}