public class _4findMaxProduct {
    public static void main(String[] args) {
      int[] a={3,6,4,-5,7,3};
      getMaxProduct(a);
    }
    public static void getMaxProduct(int[] a){
        int max=a[0]*a[1];
        for(int i=1;i<a.length-1;i++){
            int k=a[i]*a[i+1];
            if(max<k)
                max=k;
        }
        System.out.println(max);
    }
}
