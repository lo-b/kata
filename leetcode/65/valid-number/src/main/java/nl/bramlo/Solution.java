package nl.bramlo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isNumber(String s) {
        Pattern p = Pattern.compile("[+-]?(\\.\\d+|\\d+(\\.\\d*)?)([eE][+-]?\\d+)?");
        Matcher m = p.matcher(s);

        return m.matches();
    }
}
