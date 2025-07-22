public class String11 {
    public static void main(String[] args) {
        // Reversal string - abc - cba
        // by StringBUILDER
        StringBuilder reverseString = new StringBuilder("mohitsinghrawat");
        reverseString.reverse().toString();
        System.out.println(reverseString);

        // by char array
        String name = "mohitsinghrawat";
        // String result = reverseStringhai(name);
        // System.out.println(result);

        // by loop

        String result1 = revStr(name);
        System.out.println(result1);

    }
    // public static String reverseStringhai(String name){
    // char[] chars = name.toCharArray();
    // int left = 0 , right = chars.length - 1;

    // while(left < right){
    // char temp = chars[left];
    // chars[left] = chars[right];
    // chars[right] = temp;
    // left++;
    // right--;
    // }
    // return new String(chars);

    // }

    public static String revStr(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);

        }
        return rev;

    }

}
