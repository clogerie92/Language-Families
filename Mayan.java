class Mayan extends Language {
    Mayan(String langName, int speakers) {
        super(langName, speakers, "Central America", "verb-subject-object");
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " mainly in" + this.regionsSpoken + ".");
        System.out.println("The language follows the word oder: " + this.wordOrder + ".");
        System.out.println("Fun fact: " + this.name + "is an ergative language.");
    }
}