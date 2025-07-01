 # Java Mutable and Immutable Data Types

## ✅ Immutable Data Types

**Immutable** ka matlab hai ki ek baar value set ho gayi, toh usko change nahi kiya ja sakta.  
Agar aap value change karte hain, toh naya object ban jata hai.

### 🔹 Primitive Data Types:
- `int`
- `float`
- `double`
- `char`
- `byte`
- `short`
- `long`
- `boolean`

> ⚠️ Note: Primitive data types technically value types hote hain, unme value copy hoti hai — change nahi hota original par.

### 🔹 Some Non-Primitive Immutable Types:
- `String`
- Wrapper Classes like:
  - `Integer`
  - `Float`
  - `Double`
  - `Character`
  - `Boolean`

### 📌 Example:

```java
String name = "Java";
name = name + " Language";
System.out.println(name); // Output: Java Language

🔁 Mutable Data Types
Mutable ka matlab hai ki object ki value ko bina naya object banaye change kiya ja sakta hai.

🔹 Arrays:
int[], String[], etc.

🔹 Java Collections Framework:
ArrayList

HashMap

HashSet

LinkedList

etc.


| Data Type | Description              | Size    | Range                  |
| --------- | ------------------------ | ------- | ---------------------- |
| `byte`    | Smallest integer         | 1 byte  | -128 to 127            |
| `short`   | Small int                | 2 bytes | -32k to 32k            |
| `int`     | Default integer          | 4 bytes | \~-2B to 2B            |
| `long`    | Large integer            | 8 bytes | Very large             |
| `float`   | Decimal (low precision)  | 4 bytes | ±3.4 x 10^38 approx    |
| `double`  | Decimal (high precision) | 8 bytes | ±1.7 x 10^308 approx   |
| `char`    | Unicode character        | 2 bytes | 0 to 65535             |
| `boolean` | True/False               | 1 bit\* | Only `true` or `false` |

byte < short < int < long
                    ^
         float < double 

