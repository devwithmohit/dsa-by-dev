har problem ko solve karne ke liye , different-different multiple logics hote hai , aur har logics ko hum Algorithm ke through implement karte hai ya phir express karte hai , vo Algorithm kitne Efficient hai kuch Metric shote hai jinme sab important _time_ hota hai


then whole code me jaise mere input ka size badh raah koi extra space include nahi ho rahi hai 

1. What is Time and Space Complexity?
   ✅ Time Complexity:
   Kitna time lagta hai program ya algorithm ko complete hone me, based on input size n

But exact time nahi, operations ka count hota hai (comparisons, loops etc.)

✅ Space Complexity:
Kitni memory consume hoti hai algorithm me while running, including input, variables, recursion stack, etc.

2. What is Big-O Notation?

Big-O notation worst-case scenario represent karta hai.
Yeh batata hai ki algorithm ka performance kaise scale karega jaise input size n badhta hai.

| Complexity | Example                | Java Code Example                |
| ---------- | ---------------------- | -------------------------------- |
| O(1)       | Constant time          | `arr[0]`, `System.out.println()` |
| O(log n)   | Binary Search          | `Arrays.binarySearch()`          |
| O(n)       | Linear search, loop    | `for (int i = 0; i < n; i++)`    |
| O(n log n) | MergeSort, QuickSort   | Java `Arrays.sort()` (TimSort)   |
| O(n²)      | Nested loops           | Matrix multiplication            |
| O(2ⁿ)      | Recursion (Fibonacci)  | `fib(n) = fib(n-1) + fib(n-2)`   |
| O(n!)      | Factorial permutations | Backtracking problems            |

how to find problem Complexity ?
Example 1 : Single loop
✅ Step 1: Count Dominant Operations (Time Complexity)
Goal: Dekhna hai ki function me kaun sa block kitni baar repeat ho raha hai.

void printNumbers(int n) {
for (int i = 0; i < n; i++) {
System.out.println(i);
}
}
📊 Time Complexity:
Loop runs n times → O(n)

Har iteration me ek constant-time operation → System.out.println()
✅ So total: O(n)

📦 Space Complexity:
No array/list/object used → No extra space
✅ So total: O(1)

Example 2: Nested Loops

void printPairs(int[] arr) {
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr.length; j++) {
System.out.println(arr[i] + ", " + arr[j]);
}
}
}
📊 Time Complexity:
Outer loop → n times

Inner loop → n times
✅ Total: n × n = O(n²)

📦 Space Complexity:
No additional data structure used
✅ So: O(1)

✅ Step 3: Count Extra Memory Allocations (Space Complexity)

int[] buildArray(int n) {
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = i;
}
return arr;
}

📊 Time Complexity: O(n) (1 loop)
📦 Space Complexity: O(n) (new array of size n created)

| Code Structure                  | Time Complexity      |
| ------------------------------- | -------------------- |
| Simple loop from 1 to n         | `O(n)   `            |
| Nested loop (n × n)             | `O(n²)   `           |
| Loop with constant steps        | `O(1)      `         |
| Binary search                   | `O(log n)    `       |
| Divide-and-conquer (Merge Sort) | `O(n log n) `        |
| Recursion with two calls        | `O(2ⁿ) (Fibonacci) ` |

Stack me sirf references or local variables store hote hain

Heap me sari objects jaate hain — chahe mutable ho ya immutable

| Type                                                 | Memory Location                          | Explanation                        |
| ---------------------------------------------------- | ---------------------------------------- | ---------------------------------- |
| **Primitive types** (`int`, `char`, `boolean`, etc.) | ✅ **Stack** (inside method/local scope) | Value stored directly              |
| **Immutable Objects** (`String`, `Integer`, etc.)    | ✅ **Heap**                              | Object in heap, reference in stack |
| **Mutable Objects** (`ArrayList`, custom class obj)  | ✅ **Heap**                              | Always stored in heap              |

| Criteria         | Immutable (e.g., String)     | Mutable (e.g., StringBuilder) |
| ---------------- | ---------------------------- | ----------------------------- |
| **Memory Use**   | High (new object per change) | Low (same object modifies)    |
| **Speed**        | Slow in modifications        | Fast for changes              |
| **Thread-safe?** | Mostly yes                   | No (unless synchronized)      |
