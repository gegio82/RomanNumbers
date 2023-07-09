package it.ggerosa;

public class RomanNumberConverter {

    public String toRoman(int decimal) {
        StringBuilder builder = new StringBuilder();
        for (RomanSymbol romanSymbol: RomanSymbol.values()) {
            while (decimal >= romanSymbol.value) {
                builder.append(romanSymbol.symbol);
                decimal -= romanSymbol.value;
            }
        }
        return builder.toString();
    }

    enum RomanSymbol {
        X('X', 10),
        V('V', 5),
        I('I', 1);
        char symbol;
        int value;
        RomanSymbol(char symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }
    }
}
