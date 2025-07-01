public class Question7 {
     public static void main(String1[] args) {
          // Find duplicate in array 
          int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 2, 3 };
          duplicateArray(arr1);

     }

     static void duplicateArray(int [] arr1){
          for(int i = 0 ; i < arr1.length; i ++){
          for(int j = i + 1 ; j < arr1.length; j ++){
               
               if (arr1[j] == arr1[i]){
                    System.out.println("this is duplicate : " +  arr1[i]);

                    break;
               } 
               
          }

     
     }
     }
     
}
