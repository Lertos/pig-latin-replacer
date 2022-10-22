public class PigLatinConverter {

    static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public String convertPhrase(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            //Figure out if the word starts with a vowel or consonant
            if (isVowel(word.charAt(0))) {
                sb.append(applyVowelRule(word));
            } else {
                sb.append(applyConsonantRule(word));
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
        StringBuilder sb = new StringBuilder();
        String convertedWord = "";

        for (int i=0; i<word.length(); i++) {
            char currChar = word.charAt(i);

            if (isVowel(currChar)) {
                convertedWord = word.substring(i) + "-" + sb.toString().toLowerCase() + "ay";
                break;
            } else {
                sb.append(currChar);
            }
        }
        return convertedWord;
    }

    //Words that start with a vowel; add '-yay' at the end of the word
    private String applyVowelRule(String word) {
        return word + "-yay";
    }

    //I've chosen to ignore the compound rule as you would need a list of all
    //compound rules, or a lookup to see if the word contains two other words
    //from a dictionary API; which are all out of scope for this exercise
}
