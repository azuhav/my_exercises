package codeWars;

public class RemoveVowels {
    public static void disemvowel(String str) {
        // Code away...
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o'};
        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                String temp = Character.valueOf(str.charAt(i)).toString();
                if (temp.equalsIgnoreCase(Character.valueOf(vowel).toString())) str = str.replace(temp, "");
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        disemvowel("This website is for losers LOL!");
        disemvowel("No offense but,\nYour writing is among the worst I've ever read");
        disemvowel("What are you, a communist?");
    }
}
