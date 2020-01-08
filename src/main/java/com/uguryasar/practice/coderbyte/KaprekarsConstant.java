package com.uguryasar.practice.coderbyte;

import java.util.*;

/**
 * <b>Kaprekars Constant</b>
 * Have the function KaprekarsConstant(num) take the num parameter being passed
 * which will be a 4-digit number with at least two distinct digits. Your program
 * should perform the following routine on the number: Arrange the digits in
 * descending order and in ascending order (adding zeroes to fit it to a 4-digit number),
 * and subtract the smaller number from the bigger number. Then repeat the previous step.
 * Performing this routine will always cause you to reach a fixed number: 6174.
 * Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174).
 * Your program should return the number of times this routine must be performed until
 * 6174 is reached.
 * <p>
 * For example: if num is 3524 your program should return 3 because of the following steps:
 * (1) 5432 - 2345 = 3087,
 * (2) 8730 - 0378 = 8352,
 * (3) 8532 - 2358 = 6174.
 *
 * <b>Examples</b>
 * Input: 2111
 * Output: 5
 * <p>
 * Input: 9831
 * Output: 7
 */
public class KaprekarsConstant {

    private static final int KAPREKARS_CONSTANT = 6174;

    public static int kaprekarsConstantRepeatCount(int number) {
        if (!isValid(number)) {
            throw new IllegalArgumentException("Number should have at least two distinct digits");
        }

        int kaprekarsResult = 0;
        int repeatCount = 0;

        do {
            int ascended = ascend(number);
            int descended = descend(ascended);

            kaprekarsResult = descended - ascended;
            number = kaprekarsResult;
            repeatCount++;
        } while (kaprekarsResult != KAPREKARS_CONSTANT);

        return repeatCount;
    }

    private static int ascend(int number) {
        List<String> numberList = new ArrayList<>();
        String numberInString = String.valueOf(number);

        for (String digit : numberInString.split("")) {
            numberList.add(digit);
        }

        Collections.sort(numberList);

        StringBuilder builder = new StringBuilder();

        for (String digit : numberList) {
            builder.append(digit);
        }

        String ascendedNumber = builder.toString();
        return Integer.parseInt(ascendedNumber);
    }

    private static int descend(int ascendedNumber) {
        String numberInString = String.valueOf(ascendedNumber);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 4 - numberInString.length(); i++) {
            builder.append("0");
        }

        builder.append(numberInString);
        builder.reverse();

        String descendedNumber = builder.toString();

        return Integer.parseInt(descendedNumber);
    }

    private static boolean isValid(int number) {
        Set<String> letterSet = new HashSet<>();

        String numberInString = String.valueOf(number);
        if (numberInString.length() != 4) {
            return false;
        }

        String[] letters = numberInString.split("");

        for (String letter : letters) {
            letterSet.add(letter);
        }

        return letterSet.size() >= 2;
    }

}
