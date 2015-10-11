public class Q3 {
  public static void main(String args[]) {
    System.out.println(isPermutation(args[0], args[1]));
  }

  public static boolean isPermutation(String str1, String str2) {
    if (str1.length() != str2.length()) return false;
    int charLenght = str1.length();
    for (int i = 0; i < charLenght; i++) {
      if (str1.charAt(i) != str2.charAt(charLenght-i-1)) return false;
    }
    return true;
  }
}
