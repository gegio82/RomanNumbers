package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < decimal; i++) {
            builder.append("I");
        }
        return builder.toString();
    }
}
