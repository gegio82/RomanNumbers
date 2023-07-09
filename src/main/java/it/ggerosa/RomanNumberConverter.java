package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        StringBuilder builder = new StringBuilder();
        for (RomanSymbol romanSymbol: RomanSymbol.values()) {
            if (decimal >= romanSymbol.value) {
                builder.append(romanSymbol.symbol);
                decimal -= romanSymbol.value;
            }
        }
        for (int i = 0; i < decimal; i++) {
            builder.append("I");
        }
        return builder.toString();
    }

    enum RomanSymbol {
        X('X', 10), V('V', 5);
        char symbol;
        int value;
        RomanSymbol(char symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }
    }
}
