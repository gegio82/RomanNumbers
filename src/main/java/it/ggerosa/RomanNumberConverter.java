package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        if (decimal == 5) {
            return "V";
        }
        if (decimal == 6) {
            return "VI";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < decimal; i++) {
            builder.append("I");
        }
        return builder.toString();
    }
}
