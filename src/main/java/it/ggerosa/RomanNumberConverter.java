package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        if (decimal == 2) {
            return "II";
        }
        return "I";
    }
}
