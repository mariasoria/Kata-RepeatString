public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        String finalString = "";
        for (int i = 0; i < repeat; i++) {
            finalString += string;
        }
        return finalString;
    }
}
