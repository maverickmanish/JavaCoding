package instagram;

public class ConvertDigitsToWord {


    public static String[] digitWords = {"zero", "one", "two",
        "three", "four", "five", "six", "seven","eight","nine"};
    public static String convertDigitsToWord(int digits) {
        if (digits == 0) {
            return digitWords[0];
        }
        StringBuilder result = new StringBuilder();
        String digitString = Integer.toString(digits);

        for(char ch : digitString.toCharArray()) {
            int wordIndex = ch - '0';
            result.append(digitWords[wordIndex]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertDigitsToWord(56743456));
    }
}
