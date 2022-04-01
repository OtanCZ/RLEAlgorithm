package com.company;

public class RLEAlgorithm {
    public static String encode(String input) {
        StringBuilder encodedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            while (i < input.length() && currentChar == input.charAt(i)) {
                count++;
                i++;
            }
            encodedString.append(count);
            encodedString.append(currentChar);
            i--;
        }
        return encodedString.toString();
    }

    public static String decode(String input) {
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;

            if(Character.isDigit(currentChar)) {
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    count = count * 10 + Character.getNumericValue(input.charAt(i));
                    i++;
                }

                currentChar = input.charAt(i);
            }

            for (int j = 0; j < count; j++) {
                decodedString.append(currentChar);
            }
        }
        return decodedString.toString();
    }
}
