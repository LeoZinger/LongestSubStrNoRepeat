import java.util.HashSet;
import java.util.Set;

/**
 * Created by leo.zinger on 4/6/17.
 */
public class LongestSubStrNoRepeat {

    int FindLongestSubStrNoRepeat (String testStr){
        HashSet<Character> subStrCharSet = new HashSet<>();

        for (int i = 0; i < testStr.length(); i++){
            if (testStr.charAt(i) == ' '){
                continue;
            }
            if (!subStrCharSet.contains(testStr.charAt(i))){
                System.out.println("i="+ i + "adding char:" + testStr.charAt(i));
                subStrCharSet.add(testStr.charAt(i));
            }
            else{
                System.out.println("Found Duplicate char:" + testStr.charAt(i) + " at position "+ i + " Returning...");
                return i;
            }
        }
        return -1;
    }

    public static void main (String [] args) {
        int n;
        //String testStr = "The quick brown fox jumps over a lazy dog";
        String testStr = "The quick brown f";
        LongestSubStrNoRepeat longestSubStrNoRepeat = new LongestSubStrNoRepeat();
        n = longestSubStrNoRepeat.FindLongestSubStrNoRepeat(testStr);
        if (n >= 0 & n<testStr.length()) {
            System.out.println("Found longest SubString in " + testStr + ", SubString= " + testStr.substring(0, n));
        } else {
            System.out.println("Longest SubString NOT FOUND in string:" + testStr);
        }
    }
}
