public class Tokens {
    public static void main(String [] args){
        String s = "He is a very very good boy, isn't he?";
         String[] result = s.split("[ ,?']+");

         for(int i = 0; i < result.length; i++){
             System.out.println(result[i]);
         }
         System.out.println(result.length);
    }
}
