public class handler {
      public static void main(String1[] args) {
        try {
            int a = 10 /100;  
            System.out.println(a);
            System.out.println("This will not print.");
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs." );
        }
    }
}

// try: Block where you write risky code

// catch: Block to handle the error

// finally: Always runs (optional)