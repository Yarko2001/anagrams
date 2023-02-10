package ua.dehtiar.task_1_1;

/**
 * @author Yaroslav Dehtiar on 30.01.2023
 */
public class Application {

//  private String inputString;
//
//  public Application(String inputString) {
//    this.inputString = inputString;
//  }

  public String reverseAllInputtedWords(String inputString) {
    String resultStringOfWords = "";
    String[] splittedWordsList = inputString.split(" ");

    for (int i = 0; i < splittedWordsList.length; i++) {
      resultStringOfWords += " " + (reverseInputWord(splittedWordsList[i]));
    }
    return resultStringOfWords;
  }

  private String reverseInputWord(String word) {
    char[] charArray = word.toCharArray();
    int forefrontPosition = 0;
    int backgroundPosition = charArray.length - 1;

    while (forefrontPosition < backgroundPosition) {
      if (Character.isLetter(charArray[forefrontPosition])) {
        if (Character.isLetter(charArray[backgroundPosition])) {
          replaceCharacters(charArray, forefrontPosition, backgroundPosition);
          backgroundPosition--;
          forefrontPosition++;
        } else {
          backgroundPosition--;
        }
      } else {
        forefrontPosition++;
      }
    }
    return new String(charArray);
  }

  private void replaceCharacters(char[] charArray, int frontPosition, int backPosition) {
    char chars = charArray[frontPosition];
    charArray[frontPosition] = charArray[backPosition];
    charArray[backPosition] = chars;
  }
}