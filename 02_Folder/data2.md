✅ 1️⃣ Linear Time — O(n)

void print(int[] arr) {
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]);
}
}

2️⃣ Logarithmic Time — O(log n)

int binarySearch(int[] arr, int target) {
int low = 0, high = arr.length - 1;
while (low <= high) {
int mid = (low + high) / 2;
if (arr[mid] == target) return mid;
if (arr[mid] < target) low = mid + 1;
else high = mid - 1;
}
return -1;
}

3️⃣ Quadratic Time — O(n²)
void printPairs(int[] arr) {
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr.length; j++) {
System.out.println(arr[i] + ", " + arr[j]);
}
}
}

4.  Space-tradeOff

"Kya hum extra memory use karke speed badha sakte hain?"

Matlab:

Zyada memory use karo → algorithm fast ho jata hai

Kam memory lo → but slow performance tolerate karo



| Concept             | Description                           |
| ------------------- | ------------------------------------- |
| O(log n)            | Divide & conquer, fast for large data |
| O(n)                | Linear scan, one full pass            |
| O(n²)               | Double loop, very slow for big inputs |
| Space-Time Tradeoff | Zyada memory leke time save karna     |
