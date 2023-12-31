package it.ggerosa;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumberConverterTest {

    private final RomanNumberConverter converter = new RomanNumberConverter();

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X"})
    void canConvertNumber1(int decimal, String expectedRoman) {
        assertThat(converter.toRoman(decimal)).isEqualTo(expectedRoman);
    }

}