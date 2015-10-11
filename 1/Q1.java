import java.util.LinkedList;
import java.util.BitSet;

public class Q1 {
  public static void main(String args[]) {
    System.out.println(isUniqueChar(args[0]));
  }

  public static boolean isUniqueChar(String str) {
    if (str.length() > 128) return false;

    boolean[] char_set = new boolean[256];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (char_set[val]) return false;
      char_set[val] = true;
    }
    return true;
  }
}
