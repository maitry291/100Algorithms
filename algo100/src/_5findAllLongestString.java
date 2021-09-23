public class _5findAllLongestString {
    public static void main(String[] args) {
        String[] s={"aba","ad","ae","vcd","aba"};
        getAllLongestString(s);
    }
    public static void getAllLongestString(String[] s){
        int k=s[0].length();
        for (String value : s) {
            if (k < value.length())
                k = value.length();
        }
        for (String value : s){
            if(k==value.length())
                System.out.println(value);
        }
    }
}
