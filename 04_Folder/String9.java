public class String9 {
    public static void main(String[] args) {
        // Char Frequency Map in Java
        String name = "mohitsinghrawat";
      isfrequency(name);


    }
    static void isfrequency(String name){
        int[] freq = new int[256];
        for(int i = 0 ; i < name.length() ; i ++){
            freq[name.charAt(i)]++;

        }
        for (int i = 0; i < freq.length; i++) {
            // System.out.println(freq);
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

    }
    
}
