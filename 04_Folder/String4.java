import java.util.Arrays;

public class String4 {
    public static void main(String[] args) {
        // Anagram means 2 strings ke paas same characters hon, same frequency ke saath,
        // but order can be different.
        // matlab order aage peeche ho sakta hai but two words me smae character hone
        // chiaye

        // 🧠 Logic:
        // Method 1: Sorting
        // Dono strings ko sort karo

        // Agar sorted strings same → anagram

        String word_1 = "madam";
        String word_2 = "mdaam";
        System.out.println(isAnagram(word_1, word_2));

    }

    static boolean isAnagram(String word_1, String word_2) {
        if (word_1.length() != word_2.length())
            return false;
        char[] arr1 = word_1.toCharArray();
        System.out.println(arr1);
        char[] arr2 = word_2.toCharArray();
        System.out.println(arr2);
        Arrays.sort(arr1);
        // sorting on the basis of alphabet
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);



    }

}

// String name = "mohitsinghrawat";
// int[] freq = new int[256];
// for (int i = 0; i < name.length(); i++) {
//     freq[name.charAt(i)]++;
// }

// // Suppose you want to know the count of 'a'
// System.out.println("Count of 'a': " + freq['a']); // Output: 2

// // Count of 't'
// System.out.println("Count of 't': " + freq['t']); // Output: 2

// String str = "Hello";
// char[] arr = str.toCharArray();

// for (char c : arr) {
//     System.out.print(c + " ");  // Output: H e l l o
// }

