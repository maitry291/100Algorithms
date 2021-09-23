public class _9alternatingSum {
    public static void main(String[] args) {
        int[] a={50,60,60,45,70};
        getAlternateSum(a);
    }
    public static void getAlternateSum(int[] a){
        int st1=0,st2=0;
        for(int i=0;i<a.length;i++){
          if(i%2==0){
             st1+=a[i];
          }
          else
              st2+=a[i];
        }
        System.out.println("sum of team1:-"+st1);
        System.out.println("sum of team2:-"+st2);
    }
}
