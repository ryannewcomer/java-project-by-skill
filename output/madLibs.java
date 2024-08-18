import java.util.Scanner;

public class madLibs {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String BasedStory = "It was warm summer day, and SOmeone desicide to met their firend. But instand of playing in the park, he was a strage place 
    that he has never been before. curiously, he begain his every own adventager"";

    String changedStroy = "It was __ __ day, and __ desicide to met their __. But instand of playing in ___, he was in a ____
    that he has never been before. ___, he begain his every own ___"

    int NumOfNoun
    int NumOfAdj
    int NumOfVerb
    int NumOfAdverb
    int NumOfInterjection
    
    NumOfNound = 6;
    NumOfAdj = 2;
    NumOfVerb = 0;
    NumofAdverb = 0;
    NumOfInterjection = 0;
   system.out.println(changedStroy);

    System.out.println("There are: " + NumOfNoun + " noun," + NumofAdj + " Adjective, " + NumOfVerb + " Verb," + NumOfAdverb + " Adverb, and " + NumOfInterjection );


  }
}
