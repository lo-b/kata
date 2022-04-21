package nl.bramlo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        var phonePad = getPhonePad();

        for (int i = 0; i < digits.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            var charsOfDigit = phonePad.get(digit);
            output = expandCombinations(output, charsOfDigit);
        }

        return output;
    }

    private List<String> expandCombinations(List<String> currentCombinations, List<String> charsOfDigit) {
        var output = new ArrayList<String>();

        if (currentCombinations.isEmpty() && !charsOfDigit.isEmpty()) {
            output.addAll(charsOfDigit);
        }

        for (var combination :
                currentCombinations) {
            for (var charOfDigit :
                    charsOfDigit) {
                StringBuilder combinationBuilder = new StringBuilder(combination);
                output.add(combinationBuilder.append(charOfDigit).toString());
            }
        }

        return output;
    }

    private HashMap<Integer, List<String>> getPhonePad() {
        var phonePad = new HashMap<Integer, List<String>>();
        phonePad.put(2, List.of("a", "b", "c"));
        phonePad.put(3, List.of("d", "e", "f"));
        phonePad.put(4, List.of("g", "h", "i"));
        phonePad.put(5, List.of("j", "k", "l"));
        phonePad.put(6, List.of("m", "n", "o"));
        phonePad.put(7, List.of("p", "q", "r", "s"));
        phonePad.put(8, List.of("t", "u", "v"));
        phonePad.put(9, List.of("w", "x", "y", "z"));

        return phonePad;
    }

}
