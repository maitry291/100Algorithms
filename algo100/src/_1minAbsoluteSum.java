public class _1minAbsoluteSum {
    public static void main(String[] args) {
        int[] a={2,4,7,6};
        findMinAbsSum(a,0,new int[a.length]);
    }

    public static void findMinAbsSum(int[] a,int si,int[] sum){
        if(si==a.length){
            int min=0;
           for(int i=0;i<sum.length;i++) {
               if(sum[i]<sum[min])
                   min=i;
           }
            System.out.println(a[min]);
           return;
        }
       int k=a[si];
        for (int j : a) {
            sum[si] += Math.abs(j - k);
        }
       findMinAbsSum(a,si+1,sum);
    }
}
