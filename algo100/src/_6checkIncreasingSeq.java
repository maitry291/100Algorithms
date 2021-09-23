public class _6checkIncreasingSeq {
    public static void main(String[] args) {
       int[] a={1,3,2,2};
        System.out.println(isItIncreasingSequence(a));
    }
    public static boolean isItIncreasingSequence(int[] a){
        for(int i=0;i<a.length-2;i++){
           if(a[i]>a[i+1]){
               if(a[i+1]>a[i+2])
                   return false;
           }
        }
        return true;
    }
}
