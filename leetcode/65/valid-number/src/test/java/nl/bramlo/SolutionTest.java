package nl.bramlo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @DisplayName("Valid Digits")
    @ParameterizedTest
    @ValueSource(strings = {"2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"})
    void isNumber_ValidDigits_ShouldReturnTrue(String digit) {
        var output = solution.isNumber(digit);

        assertThat(output).isTrue();
    }

    @DisplayName("Invalid Digits")
    @ParameterizedTest
    @ValueSource(strings = {"abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53", "4..", ".", "4..6"})
    void isNumber_InvalidDigits_ShouldReturnFalse(String invalidDigit) {
        var output = solution.isNumber(invalidDigit);

        assertThat(output).isFalse();
    }
}