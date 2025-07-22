public class Array9 {
    public static void main(String1[] args) {
        // 1 .Unsorted Matrix Search — Brute Force
        // 🔹 Problem: Matrix me kisi element ko dhoondhna hai. Sorting ka koi guarantee
        // nahi hai.
        int[][] arr1 = {
                { 1, 2, 4 },
                { 6, 8, 9 },
                { 23, 5, 67 }
        };
        int target = 23;
        boolean result = searchEle(arr1, target);
        if (result){
            System.out.println("found target");
        }else {
            System.out.println("Not found target ");
        }
    }

    static boolean searchEle(int[][] arr1, int target) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] == target)
                    return true;

            }
        }
        return false;

    }
}
