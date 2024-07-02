//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Strings {
    public static void main(String[] args) {
    String A = "hello";
    String B = "java";
    String putTogether = A + B;

    String Aupper = A.substring(0,1).toUpperCase() + A.substring(1);
    String Bupper = B.substring(0,1).toUpperCase() + B.substring(1);
    System.out.println(Aupper + " " + Bupper);

    if(A.compareTo(B) > 0){
        System.out.println("Yes");
    }else System.out.println("NO");

    System.out.println(putTogether.length());
    }
}