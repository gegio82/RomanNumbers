package it.ggerosa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumberConverterTest {

    private final RomanNumberConverter converter = new RomanNumberConverter();

    @Test
    void canConvertNumber1() {
        assertThat(converter.toRoman(1)).isEqualTo("I");
    }

    @Test
    void canConvertNumber2() {
        assertThat(converter.toRoman(2)).isEqualTo("II");
    }
}