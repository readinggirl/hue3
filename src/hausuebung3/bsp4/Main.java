/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3.bsp4;

import java.util.stream.IntStream;

/**
 *
 * @author Teresa
 */
public class Main {

    public static void main(String[] args) {
        final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 != 0)
                .map(i -> i * i)
                //.sum();
                .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
