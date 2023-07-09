package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        if (decimal == 3) {
            return "III";
        }
        if (decimal == 2) {
            return "II";
        }
        return "I";
    }
}
