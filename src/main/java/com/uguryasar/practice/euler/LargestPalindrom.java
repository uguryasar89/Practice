package com.uguryasar.practice.euler;

public class LargestPalindrom {

    public static int findLargestPalindrom(int digitNumber) {
        if (digitNumber < 1) {
            throw new IllegalArgumentException("Digit number should bigger than zero");
        }

        String maxNumberString = getMaxNumberInString(digitNumber);

        int largestPalindromNumber = 0;
        int maxNumber = Integer.parseInt(maxNumberString);

        for (int i = maxNumber; i > 1; i--) {
            for (int j = maxNumber; j > 1; j--) {
                int number = i * j;

                if (isPalindrom(number) && number > largestPalindromNumber) {
                    largestPalindromNumber = number;
                }
            }
        }

        return largestPalindromNumber;
    }

    private static String getMaxNumberInString(int digitNumber) {
        StringBuilder maxNumberString = new StringBuilder();
        for (int i = 0; i < digitNumber; i++) {
            maxNumberString.append("9");
        }
        return maxNumberString.toString();
    }

    private static boolean isPalindrom(int number) {
        String palindromNumber = String.valueOf(number);

        int loopSize;
        if (palindromNumber.length() % 2 == 0) {
            loopSize = palindromNumber.length() / 2;
        } else {
            loopSize = (palindromNumber.length() - 1) / 2;
        }

        for (int i = 0; i < loopSize; i++) {
            if (palindromNumber.charAt(i) != palindromNumber.charAt(palindromNumber.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrom(String number) {
        if (number == null || number.trim().equals("")) {
            throw new IllegalArgumentException("Number can not be empty!");
        }

        String reversedNumber = new StringBuilder().append(number).reverse().toString();

        return reversedNumber.equals(number);
    }

}
