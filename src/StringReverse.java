public class StringReverse {
    public static void main(String [] args){
        String A = "madam", B = "";
        char ch;
        for(int i = 0; i < A.length(); i++){
            ch = A.charAt(i);
            B = ch + B;
        }
        System.out.println(A.equals(B));
    }
}
