// Backtracking ek approach hai jisme "try all possibilities" karte hain, aur agar koi path galat ho jaye toh "wapis return" karke naye option try karte hain.

class Backtracking1 {

    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char CharArr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, perm + CharArr, idx + 1);

        }

    }

    public static void main(String[] args) {
        String s = "ABC";
        // String NewString = " ";
        printPermutation(s, " ",0 );

    }

}
