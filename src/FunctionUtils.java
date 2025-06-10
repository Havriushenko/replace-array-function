public class FunctionUtils {

  public char[] replaceArrays(char[] root, char[] pattern, char[] replacement) {
    if (root.length == 0 || pattern.length == 0 || (root.length < pattern.length)) {
      return root;
    }

    if(replacement.length == 0){
      return replacement;
    }

    int[] matchIndexes = new int[root.length / pattern.length];
    int count = 0;

    for (int i = 0; i < root.length; i++) {
      if(i + pattern.length > root.length){
        break;
      }

      if (root[i] == pattern[0]) {
        if (pattern.length > 1) {
          boolean match = true;

          for (int k = 1; k < pattern.length; k++) {
            if (pattern[k] == root[i + k]) {
              continue;
            }
            match = false;
            break;
          }

          if (match) {
            matchIndexes[count] = i;
            count++;
          }

        } else {
          matchIndexes[count] = i;
          count++;
        }
      }
    }

    if (count == 0) {
      return root;
    }

    return this.buildResultArray(count, pattern, root, replacement, matchIndexes);
  }

  private char[] buildResultArray(
      int count,
      char[] pattern,
      char[] root,
      char[] replacement,
      int[] matchIndexes
  ) {
    char[] result = new char[root.length + count * (replacement.length - pattern.length)];

    int rootIndex = 0;
    int resultIndex = 0;

    for (int i = 0; i < count; i++) {
      int matchIndex = matchIndexes[i];
      int length = matchIndex - rootIndex;

      System.arraycopy(root, rootIndex, result, resultIndex, length);
      resultIndex += length;

      System.arraycopy(replacement, 0, result, resultIndex, replacement.length);
      resultIndex += replacement.length;
      rootIndex = matchIndex + pattern.length;
    }

    if (rootIndex < root.length) {
      System.arraycopy(root, rootIndex, result, resultIndex, root.length - rootIndex);
    }
    return result;
  }
}
