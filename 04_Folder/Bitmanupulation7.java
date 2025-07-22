public class Bitmanupulation7 {
    public static void main(String[] args) {
  

        // What is XOR?
        // XOR (^) is a bitwise operator that returns 1 if the bits are different and 0
        // if the bits are same.

        // XOR Properties:
        // a ^ 0 = a
        // a ^ a = 0
        // a ^ b ^ a = b (XOR is associative)
        int[] arr1 = {2,3,4,2,3,4,5,5,6};
        System.out.println("Unique Elements" + findUnique(arr1));
        
    }
    static int findUnique(int[] arr1){
        int unique = 0;
        for(int num : arr1){
            unique ^= num ;
            System.out.println(unique);

        }
        return unique;
        // All numbers that appear twice cancel out (because a ^ a = 0). Only the unique number (6) remains at the end.



    }

    
}
