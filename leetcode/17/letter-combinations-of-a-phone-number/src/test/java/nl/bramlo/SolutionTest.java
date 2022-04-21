package nl.bramlo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void letterCombinations_TwoDigits_NineCombinations() {
        var expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        var output = solution.letterCombinations("23");
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void letterCombinations_NoDigits_EmptyCombinations() {
        var expected = List.of();
        var output = solution.letterCombinations("");
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void letterCombination_SingleDigit_TwoCombinations() {
        var expected = List.of("a", "b", "c");
        var output = solution.letterCombinations("2");
        assertThat(output).isEqualTo(expected);
    }
}