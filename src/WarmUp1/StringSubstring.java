package WarmUp1;

public class StringSubstring {

    /**
     * Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2 chars.
     * The string length will be at least 2.
         * twoChar("java", 0) → "ja"
         * twoChar("java", 2) → "va"
         * twoChar("java", 3) → "ja"
     * **/
    public String twoChar(String str, int index) {
        int len = str.length();
        if(index<=0 || index>=len-1){
            return str.substring(0,2);
        } else return str.substring(index,index+2);
    }

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
         * nTwice("Hello", 2) → "Helo"
         * * nTwice("Chocolate", 3) → "Choate"
         * nTwice("Chocolate", 1) → "Ce"
     **/
    public String nTwice(String str, int n) {
        int l = str.length();
        String prefix = str.substring(0, n);
        String suffix = str.substring(l-n);
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(prefix).append(suffix).toString();
    }

    /**
     * Given a string, return the count of the number of times that a substring length 2 appears in the string and also
     * as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
         * last2("hixxhi") → 1
         * last2("xaxxaxaxx") → 1
         * last2("axxxaaxx") → 2
     * **/
    public int last2(String str) {
        int n = str.length();
        if(n<=2) return 0;
        String sub = "";
        String suf = str.substring(n-2,n);
        System.out.println("Sufixul lui " + '"' + str + '"' +  " este: " + suf);
        int contor = 0;
        for (int i = 0; i < n-2; i++) {
            sub = str.substring(i,i+2);
            String var = "Subșir de lungime 2 extras  de la index: " + i + " până la index: " + (i+2) + ": " + sub;
            if (!suf.equals(sub)){
                System.out.println(var);
            }else {
                ++contor;
                System.out.println(var + " --> Aici au fost egale! Incrementăm contorul: " + contor);
            }

        }
        System.out.println("Returnăm conturul: " + contor);
        return contor;
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
         * stringSplosion("Code") → "CCoCodCode"
         * stringSplosion("abc") → "aababc"
         * stringSplosion("ab") → "aab"
     * **/
    public String stringSplosion(String str) {
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            result = result + str.substring(0, i+1);
            System.out.println("Index from " + 0 + " to : " + (i+1) + " -> " + str.substring(0,i+1));
        }
        return result;
    }


    /**
     *
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
         * stringBits("Hello") → "Hlo"
         * stringBits("Hi") → "H"
         * stringBits("Heeololeo") → "Hello"
     * **/
    public String stringBits(String str) {
        String result = "";
        int n = str.length();
        System.out.printf("Value of n is: %d ",n);
        for (int i = 0; i < n; i+=2) {
            result = result + str.charAt(i);
        }
        return result;
    }


    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     **/
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }


    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     **/
    public boolean nearHundred(int n) {
        System.out.println((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     **/
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }


    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     **/
    public boolean parrotTrouble(boolean talking, int hour) {
        System.out.println((talking && (hour < 7 || hour > 20)));
        return (talking && (hour < 7 || hour > 20));
    }


    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     **/
    public int diff21(int n) {
        if (n <= 21) {
            System.out.println(21 - n);
            return 21 - n;
        }
        System.out.println((n - 21) * 2);
        return (n - 21) * 2;
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     **/
    public int sumDouble(int a, int b) {
        if (a != b) {
            System.out.println(a + b);
            return a + b;
        }
        System.out.println((a + b) * 2);
        return (a + b) * 2;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     **/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        System.out.println((aSmile == bSmile));
        return (aSmile == bSmile);
    }


    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     **/
    public boolean sleepIn(boolean weekday, boolean vacation) {
        System.out.println((!weekday || vacation));
        return (!weekday || vacation);
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
        for (int i = 0; i < str.length(); i += n) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
        return result;
    }

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
        String suffix = str.substring(str.length() - 3).toUpperCase();
        String prefix = str.substring(0, str.length() - 3);
        System.out.println(prefix + suffix);
        return (prefix + suffix);
    }
}
