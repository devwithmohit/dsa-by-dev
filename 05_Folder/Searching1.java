
public class Searching1 {
    public static void main(String[] args) {
        // Linear Search - Checks or Search each element one by one.Work on both sorted
        // nand Unsorted Array.

        int[] arr1 = { 1, 2, 3, 4, 56, 7, 8 };
        boolean found = false;
        int key = 56;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == key) {
                System.out.println("key Found on the index " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Key not found in Given Array");
        }
    }

}
