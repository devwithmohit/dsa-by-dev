public class Question3 {
    public static void main(String[] args) {
        // Find the first repeated word in string
        String str = "he had had he";
        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    System.out.println("First repeated charater " + ":" + word[i]);
                }
            }

        }

    }

}
