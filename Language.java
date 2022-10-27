import java.util.ArrayList;

class Language {
  // protected fields
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  // Language constructor that sets each field to the value that was passed in  
  Language(String langName, int speakers, String regions, String order) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = order;
  }
  // getInfo() to print language info to console
  public void getInfo() {
    System.out.println(this.name + "is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder);
  }
  //main method
    public static void main(String[] args) {
        // instanciate new Language object with spanish and call getInfo on it
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        // spanish.getInfo();
        // instanciate new Langauge object with chontal and call getInfo on it
        Mayan chontal = new Mayan("Chontal", 6000000);
        // chontal.getInfo();
        // instanciate new Langauge object with Manderin Chinese and Burmese and call getInfo on it
        SinoTibetan manderinChinese = new SinoTibetan("Manderin Chinese", 1000000);
        manderinChinese.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        // burmese.getInfo();

        ArrayList<Language> languages = new ArrayList<Language>();

        languages.add(spanish);
        languages.add(chontal);
        languages.add(manderinChinese);
        languages.add(burmese);

        for(Language language : languages)  {
          language.getInfo();
        }
    }
}