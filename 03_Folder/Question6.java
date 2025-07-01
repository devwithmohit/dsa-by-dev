// Union aur Intersection of two sorted arrays ka matlab
public class Question6 {
    public static void main(String1[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };

        System.out.println("Union");
        printUnion(arr1, arr2);
        System.out.println("Intersection");
        Intersection(arr1, arr2);


    }

    static void printUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i++] + "");
            } else if (arr1[i] > arr2[j]) {
                System.out.println(arr1[j++] + "");

            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;

            }

        }
        // Print remaining elements
        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");

    }

    static void Intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }
}
