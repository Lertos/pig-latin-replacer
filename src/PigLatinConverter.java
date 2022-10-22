public class PigLatinConverter {

    static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public String convertPhrase(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            //Figure out if the word starts with a vowel or consonant
            if (isVowel(word.charAt(0))) {
                sb.append(applyVowelRule(text));
            } else {
                sb.append(applyConsonantRule(text));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    private boolean isVowel(char character) {
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

    //Words that start with single/multiple constants; add a dash before them then move
    //them to the end and add 'ay' at the end of the word
    private String applyConsonantRule(String word) {
        String newWord = "";

        for (int i=0; i<word.length(); i++) {

        }

        return newWord;
    }

    //Words that start with a vowel; add '-yay' at the end of the word
    private String applyVowelRule(String word) {
        return word + "-yay";
    }


    //I've chosen to ignore the compound rule as you would need a list of all
    //compound rules, or a lookup to see if the word contains two other words
    //from a dictionary API; which are all out of scope for this exercise
}
