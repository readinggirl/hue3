/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3.bsp2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Teresa
 */
public class Main {

    int[] random = new int[10000];
    String[] lines = new String[10];

    public void fillIntArray() {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 101);
        }
    }

    public void fillStringArray() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = upperCase.toLowerCase();
        String digits = "1234567890";
        String chars = upperCase + lowerCase + digits;

        for (int j = 0; j < lines.length; j++) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int length = 10;
            Random random = new Random();
            while (i < length) {
                sb.append(chars.charAt(random.nextInt(chars.length())));
                i++;
            }

            lines[i] = sb.toString();
        }

    }

    public void readFile() throws IOException {
        List<Weapon> weapon = Files.lines(new File("wweapons.csv").toPath())
                .skip(0)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(s[0], CombatType.valueOf(s[1]), DamageType.valueOf(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5]), Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());
    }

}
