package ua.hillel.task_1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.dehtiar.task_1_1.Application;

/**
 * @author Yaroslav Dehtiar on 09.02.2023
 */
public class ApplicationTest {

  Application application = new Application();

  @Test
  void reverseString_ThrowIllegalArgumentException_IfNull() {
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
      application.reverseAllInputtedWords(null);
    });

    String expectedMessage = "You cannot pass null to this function";
    String actualMessage = exception.getMessage();
    Assertions.assertEquals(actualMessage, expectedMessage);
  }

  @Test
  void reverseString_returnsEmptyString_ifInputStringContainsEmptyString() {
    String exceptedEmpty = "";
    String current = application.reverseAllInputtedWords("");
    Assertions.assertEquals(exceptedEmpty, current);
  }

  @Test
  void reverseString_returnsSingleSpace_ifInputStringContainsSingleSpace() {
    String exceptedSingleSpace = " ";
    String current = application.reverseAllInputtedWords(" ");
    Assertions.assertEquals(exceptedSingleSpace, current);
  }

  @Test
  void reverseString_returnsSeveralOfSpaces_ifInputStringContainsOnlySpaces() {
    String exceptedSeveralSpaces = "     ";
    String current = application.reverseAllInputtedWords("     ");
    Assertions.assertEquals(exceptedSeveralSpaces, current);
  }

  @Test
  void reverseString_returnsCharacter_ifInputStringContainsSingleCharacter() {
    String exceptedSingleCharacter = "K";
    String current = application.reverseAllInputtedWords("K");
    Assertions.assertEquals(exceptedSingleCharacter, current);
  }

  @Test
  void reverseString_returnsStringWithoutAnyChanges_ifInputStringContainsMultipleSameLetter() {
    String exceptedMultiplyLetter = "bbbbb";
    String current = application.reverseAllInputtedWords("bbbbb");
    Assertions.assertEquals(exceptedMultiplyLetter, current);
  }
  //@Test
  // void reverseString_returnsStringWithoutAnyChanges_ifInputStringContainsLowerAndUpperCases(){

  //}

  @Test
  void reverseString_WorksCorrect_ifInputStringEndsWithSymbol() {
    String expectedEndsWithSymbol = "hey#";
    String current = application.reverseAllInputtedWords("hey#");
    Assertions.assertEquals(expectedEndsWithSymbol, current);
  }

  @Test
  void reversePhrase_ReturnsStringWithoutChanges_ifInputStringContainsOnlySymbols() {
    String expectedOnlySymbols = "3636676!!!!!8*****";
    String current = application.reverseAllInputtedWords("3636676!!!!!8*****");
    Assertions.assertEquals(expectedOnlySymbols, current);
  }

  @Test
  void reversePhrase_ReturnsStringWithoutChanges_ifInputStringHasSeveralWords() {
    String expectedSeveralWords = "How are you";
    String current = application.reverseAllInputtedWords("How are you");
    Assertions.assertEquals(expectedSeveralWords, current);
  }

}
