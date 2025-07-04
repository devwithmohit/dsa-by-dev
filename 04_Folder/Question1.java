//  Find Duplicate characters in a string
public class Question1 {
    public static void main(String[] args) {
        String s = "mohitsinghrawat";
        isduplicate(s);

        
    }
    static void isduplicate(String s){
        int [] freq = new int[256];
        for(int i = 0 ; i < s.length() ; i ++){
            freq[s.charAt(i)]++;

        }
        System.out.println("duplicate error");
        for(int i = 0 ; i < freq.length ; i ++){
            if(freq[i] > 0){
              System.out.println("Index: " + i + " | Char: '" + (char)i + "' | Count: " + freq[i]);
            }
    
        }
    }
    
    
    
}
