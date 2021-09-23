public class _7alphabeticShift {
    public static void main(String[] args) {
       getAlphabeticShift("crazy");
    }
    public static void getAlphabeticShift(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='z')
                c='a';
            else
                c++;
            ans+=c;
        }
        System.out.println(ans);
    }

}
