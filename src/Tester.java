
  /**
   * @author Bianca Pantilimon
   * This class is a tester for the class WordGames
   */
 public class Tester {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        WordGames test = new WordGames();
        System.out.println(test.addHelloWord("World"));
        System.out.println("Full name: " + test.getFullName("Bianca","Pantilimon"));
    }
}