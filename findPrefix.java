public class findPrefix {

    public static void main(String[] args) {
        String[] list = {"flower", "flow", "flight"};
        String[] list2 = {"dog", "racecar", "car"};

        System.out.println("\"" + longestCommonPrefix(list) + "\"");
    }

    public static String longestCommonPrefix(String[] wordList) {

        String answer = "";
        String[] list = {"flower", "flow", "flight"};

        int shortestWordLength = wordList[0].length();

        for (int i = 1; i < wordList.length; i++) {
            String newWord = wordList[i];
            if (shortestWordLength > newWord.length()) {
                shortestWordLength = newWord.length();
            }
        }

        for (int letter = 0; letter < shortestWordLength; letter++) {
            for (int word = 1; word < wordList.length; word ++) {
                char letter1 = wordList[0].charAt(letter);
                char letter2 = wordList[word].charAt(letter);
                if (letter1 != letter2) return answer;
            }
            answer = answer + wordList[0].charAt(letter);
        }
        return answer;
    }
    public static String longestCommonPrefix2(String[] wordList) {

        if (wordList.length == 0) return "";

        String answer = "";
        int shortestIndex = 0;

        for (int i = 0; i < wordList.length; i++) {
            //use below if case-sensitive
            //wordList[i] = wordList[i].toLowerCase();
            if (wordList[shortestIndex].length() > wordList[i].length()) shortestIndex = 1;
        }

        String[] shortestWord = wordList[shortestIndex].split("");

        for(int j=0; j < shortestWord.length; j++) {
            for (int i = 1; i < wordList.length; i++) {
                String[] otherWord = wordList[i].split("");
                if (!shortestWord[j].equals(otherWord[j])) return answer;
            }
            answer = answer + shortestWord[j];
        }
        return answer;
    }

}
