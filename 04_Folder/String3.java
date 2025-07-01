public class String3 {
   public static void main(String[] args) {
      // Palindrome wo string hoti hai jo forward aur backward same hoti hai.
      String count = "madam";
      boolean result = Palindrome(count);
      System.out.println(result);

   }

   static boolean Palindrome(String count) {
      int left = 0, right = count.length() - 1;
      while (left < right) {
         if (count.charAt(left) != count.charAt(right)) {
            return false;

         }
         left++;
         right--;
      }
      return true;

   }
}

// Single letter string → ✅ Palindrome

// Empty string → ✅ Palindrome

// Case-sensitive? → "Madam" ≠ "madam" ❌