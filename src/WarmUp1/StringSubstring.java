package WarmUp1;

public class StringSubstring {

    /**
     * Given a string, return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there.
     * Note that str.toUpperCase() returns the uppercase version of a string.
     * endUp("Hello") → "HeLLO"
     * endUp("hi there") → "hi thERE"
     * endUp("hi") → "HI"
     **/
    public String endUp(String str) {
        if (str.length() <= 3) {
            System.out.println(str.toUpperCase());
            return str.toUpperCase();
        }
        String sufix = str.substring(str.length() - 3).toUpperCase();
        String prefix = str.substring(0, str.length() - 3);
        System.out.println(prefix + sufix);
        return (prefix + sufix);
    }

    /**
     * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
     * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
         * everyNth("Miracle", 2) → "Mrce"
         * everyNth("abcdefg", 2) → "aceg"
         * everyNth("abcdefg", 3) → "adg"
     **/
    public String everyNth(String str, int n) {
        String result = "";
        if (str.length() == 0) {
            return null;
        }
        for (int i = 0; i < str.length(); i+=n) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
        return result;
    }
}
