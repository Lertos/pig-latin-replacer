public class PigLatinConverter {

    static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public String convertPhrase(String text) {
        String newString = "";
        String[] words = text.split(" ");

        for (String word : words) {
            //Figure out if the word starts with a vowel or consonant
        }

        return newString;
    }


    //I've chosen to ignore the compound rule as you would need a list of all
    //compound rules, or a lookup to see if the word contains two other words
    //from a dictionary API; which are all out of scope for this exercise
}
