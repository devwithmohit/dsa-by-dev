public class Sorting5 {

    
    public static void main(String[] args) {
    // Quick Sort - Quick Sort ek efficient, divide-and-conquer sorting algorithm hai. Ye ek pivot element choose karta hai, array ko partition karta hai (pivot se chhote left, bade right), phir recursively sort karta hai.
    int[] arr = {5, 1, 4, 2, 8};
    quickSort(arr, 0 , arr.length - 1);
    }
    static void quickSort(int[]arr , int low , int high){
        if(low < high){
            int pi = partition(arr,low , high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static int partition(int[]arr , int low , int high){
// Pivot element Quick Sort me array ke kisi bhi index par ho sakta hai, lekin commonly code me last element ko pivot choose kiya jata hai:
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low ; j < high ; j ++){
              if (arr[j] < pivot) {
            i ++;
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;

}
        }
 // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}