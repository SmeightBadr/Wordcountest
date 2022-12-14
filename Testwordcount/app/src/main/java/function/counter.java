package function;

public class counter {
    public static int countChars(String inputText) {
        return inputText.length();
    }

    public static int countWords(String inputText1) {
        return inputText1.trim().split("\\W+").length;
    }
}

