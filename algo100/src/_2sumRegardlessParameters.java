public class _2sumRegardlessParameters {
    public static void main(String[] args) {
        System.out.println(sum(15,14,8,20,10,12));
    }
    public static int sum(int... s){
        int sum=0;
        for (int j : s) {
            sum += j;
        }
        return sum;
    }
}
