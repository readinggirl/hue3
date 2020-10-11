/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3.bsp3;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author Teresa
 */
public class Main {

    public static void main(String[] args) {
        final Predicate<Integer> isEven = i -> i % 2 == 0;
        final Predicate<Integer> isPositive = i -> i > 0;
        final Predicate<Integer> isZero = i -> i == 0;
        final Predicate<Integer> isNull = i -> (i == null);

        System.out.println("--------------------");
        System.out.println("10 is even: " + isEven.test(10));
        System.out.println("9 is even: " + isEven.test(9));
        System.out.println("-8 is even: " + isEven.test(-8));
        System.out.println("-7 is even: " + isEven.test(-7));
        System.out.println("0 is even: " + isEven.test(0));
        System.out.println("--------------------");
        System.out.println("350 is positive: " + isPositive.test(350));
        System.out.println("-163 is positive: " + isPositive.test(-163));
        System.out.println("0 is positive: " + isPositive.test(0));
        System.out.println("--------------------");
        System.out.println("9 is zero: " + isZero.test(9));
        System.out.println("0 is zero: " + isZero.test(0));
        System.out.println("-60 is zero: " + isZero.test(-60));
        System.out.println("--------------------");
        System.out.println("42 is null: " + isNull.test(42));
        System.out.println("null is null: " + isNull.test(null));
        System.out.println("0 is null: " + isNull.test(0));
        System.out.println("-3 is null: " + isNull.test(-3));

        System.out.println("\n--------------------");
        final Predicate<String> isShortWord = s -> s.length() < 4;
        System.out.println("you is a short word: " + isShortWord.test("you"));
        System.out.println("\"\" is a short word: " + isShortWord.test(""));
        System.out.println("Austria is a short word: " + isShortWord.test("Austria"));

        System.out.println("\n--------------------");
        System.out.println("10 is positive and even: " + isPositive.and(isEven).test(10));
        System.out.println("-6 is positive and even: " + isPositive.and(isEven).test(-6));
        System.out.println("-1 is positive and even: " + isPositive.and(isEven).test(-1));
        System.out.println("5  is positive and even: " + isPositive.and(isEven).test(5));
        System.out.println("--------------------");
        System.out.println("-42 is positive and odd: " + isPositive.and(isEven.negate()).test(-42));
        System.out.println("-13 is positive and odd: " + isPositive.and(isEven.negate()).test(-13));
        System.out.println("42  is positive and odd: " + isPositive.and(isEven.negate()).test(42));
        System.out.println("987 is positive and odd: " + isPositive.and(isEven.negate()).test(987));

    }
}
