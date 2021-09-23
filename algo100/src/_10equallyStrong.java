public class _10equallyStrong {
    public static void main(String[] args) {
        System.out.println(isItStrong(10,15,15,10));
        System.out.println(isItStrong(15,10,15,10));
        System.out.println(isItStrong(15,10,15,9));
    }
    public static boolean isItStrong(int ura,int ula,int fra,int fla){
       if(ura==fra&&ula==fla)
           return true;
       if(ura == fla && ula == fra)
           return true;

       return false;
    }
}
