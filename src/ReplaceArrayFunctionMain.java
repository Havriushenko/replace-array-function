public class ReplaceArrayFunctionMain {

  public static void main(String[] args) {
    FunctionUtils utils = new FunctionUtils();
    char[] root = new char[]{'1', '2', '3', '4', '5'};
    char[] pattern = new char[]{'1', '2', '3', '4', '5'};
    char[] replacement = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root, pattern, replacement));

    char[] root1 = new char[]{'1', '2', '3', '4', '5'};
    char[] pattern1 = new char[]{'1', '2'};
    char[] replacement1 = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root1, pattern1, replacement1));

    char[] root2 = new char[]{'1', '2', '3', '4', '5'};
    char[] pattern2 = new char[]{};
    char[] replacement2 = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root2, pattern2, replacement2));

    char[] root3 = new char[]{'1', '2', '3', '4', '5'};
    char[] pattern3 = new char[]{'1', '2'};
    char[] replacement3 = new char[]{};

    print(utils.replaceArrays(root3, pattern3, replacement3));

    char[] root4 = new char[]{};
    char[] pattern4 = new char[]{'1', '2'};
    char[] replacement4 = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root4, pattern4, replacement4));

    char[] root5 = new char[]{'1', '2', '3', '4', '5', '6', '1', '2', '8', '9', '1', '2', '3'};
    char[] pattern5 = new char[]{'1', '2','3'};
    char[] replacement5 = new char[]{'a', 'c'};

    print(utils.replaceArrays(root5, pattern5, replacement5));

    char[] root6 = new char[]{'1', '2'};
    char[] pattern6 = new char[]{'1', '2', '3', '4', '5'};
    char[] replacement6 = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root6, pattern6, replacement6));

    char[] root7 = new char[]{'1', '2', '3', '1', '5'};
    char[] pattern7 = new char[]{'1'};
    char[] replacement7 = new char[]{'a', 'b', 'c'};

    print(utils.replaceArrays(root7, pattern7, replacement7));

    char[] root8 = new char[]{'1','2','3','1','2','3','4'};
    char[] pattern8 = new char[]{'1','2','3'};
    char[] replacement8 = new char[]{'x','x'};

    print(utils.replaceArrays(root8, pattern8, replacement8));
  }

  private static void print(char[] result) {
    System.out.print("[");
    for (char c : result) {
      System.out.print(c);
    }
    System.out.println("]");
  }
}