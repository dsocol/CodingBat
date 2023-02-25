package WarmUp1;

public class StringSubstring {

    /*
        Given a string, return a new string where the last 3 chars are now in upper case.
        If the string has less than 3 chars, uppercase whatever is there.
        Note that str.toUpperCase() returns the uppercase version of a string.
            endUp("Hello") → "HeLLO"
            endUp("hi there") → "hi thERE"
            endUp("hi") → "HI"
     */
    public void endUp(String str) {
        if(str.length() <= 3){return;}
        String sufix = str.substring(str.length()-3).toUpperCase();
        String prefix = str.substring(0, str.length()-3);
        System.out.println(prefix+sufix);
    }

}
