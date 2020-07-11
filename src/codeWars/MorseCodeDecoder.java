package codeWars;

/*
In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice
and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes".
For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
The Morse code is case-insensitive, traditionally capital letters are used.
When the message is written in Morse code, a single space is used to separate the character codes and
3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
NOTE: Extra spaces before or after the code have no meaning and should be ignored.
In addition to letters, digits and some punctuation, there are some special service codes,
the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
that is coded as ···−−−···. These special codes are treated as single special characters,
and usually are transmitted as separate words.
Your task is to implement a function that would take the morse code as input and return
a decoded human-readable string.
For example:
MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
The Morse code table is preloaded for you as a dictionary, feel free to use it:
Java: MorseCode.get(".--")
 */

public class MorseCodeDecoder {
    // not-working class - stub
    static class MorseCode {
        public static String get(String str) {
            return str;
        }
    }

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        morseCode = morseCode.trim();
        StringBuilder decoded = new StringBuilder();
        String[] specialWords = morseCode.split("   ");
        for (String item : specialWords) {
            if (!item.contains(" ")) {
                decoded.append(MorseCode.get(item) + " ");
            } else {
                String[] words = item.split(" ");
                StringBuilder temp = new StringBuilder();
                for (String letter : words) {
                    temp.append(MorseCode.get(letter));
                }
                decoded.append(temp + " ");
            }
        }
        return decoded.toString().trim();
    }
}
