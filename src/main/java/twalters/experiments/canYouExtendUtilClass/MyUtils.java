package twalters.experiments.canYouExtendUtilClass;

import org.apache.commons.lang.StringUtils;

public class MyUtils extends StringUtils {
    public MyUtils() {}

    public static String someManipulation(String s) {
        return s;
    }

    /**
     * Turns out this method is not 'overriding' the StringUtils version. Instead it is 'hiding' the string utils
     * version. What differences does that make or side-effects does that cause when actually using the method?
     */
    public static boolean isNotBlank(String s) {
        System.out.println("MyUtils#isNotBlank");
        return true;
    }
}
