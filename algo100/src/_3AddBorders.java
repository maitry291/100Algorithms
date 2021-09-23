public class _3AddBorders {
    public static void main(String[] args) {
        String[] s={"abc","ded"};
        addBorders(s);
    }
    public static void addBorders(String[] s){
        for(String str:s){
            int x=str.length()+2;
            str="*"+str+"*";
            System.out.println(str);
            str="";
            for(int i = 0; i< x; i++){
               str+='*';
            }
            System.out.println(str);
        }
    }
}
