package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        StringBuilder builder = new StringBuilder();
        if (decimal >= 5) {
            builder.append("V");
            decimal -= 5;
        }
        for (int i = 0; i < decimal; i++) {
            builder.append("I");
        }
        return builder.toString();
    }
}
