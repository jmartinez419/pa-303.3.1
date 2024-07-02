public class substringComparisons {
    public static void main(String [] args){
        String longest = "", shortest = "", s = "welcometojava";
        int k = 3;

        for(int i = 0; i <= s.length() - k; i++){
            String sections = s.substring(i,k + i);

            if(sections.compareTo(longest) > 0){
                longest = sections;
            } else if(sections.compareTo(shortest) < 0 || shortest.isEmpty()){
                shortest = sections;
            }
        }System.out.println(longest);
        System.out.println(shortest);

    }
}
