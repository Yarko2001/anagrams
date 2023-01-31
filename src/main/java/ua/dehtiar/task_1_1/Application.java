package ua.dehtiar.task_1_1;

/**
 * @author Yaroslav Dehtiar on 30.01.2023
 */
public class Application {

  public Application() {
  }

  public String reverseOnlyOneWord(String word) {
    char[] chars = word.toCharArray();

    int j = word.length() - 1;
    for (int i = 0; i < word.length(); i++) {
      if (Character.isLetterOrDigit(word.charAt(i))) {
        while (!Character.isLetterOrDigit(word.charAt(j))) {
          j--;
        }
        chars[j] = word.charAt(i);
        j--;
      }

    }
    return new String(chars);
  }

  public String reverseAndSplitTheText(String s) {
    StringBuilder result = new StringBuilder();
    for (String word : s.split(" ")) {

      StringBuilder temp = new StringBuilder(word.replaceAll("[\\W\\d+]", "")).reverse();

      for (int i = 0; i < word.length(); i++) {
        if (!Character.isLetter(word.charAt(i))) {
          temp.insert(i, word.charAt(i));
        }
      }
      result.append(temp).append(" ");
    }
    return result.toString();
  }
}