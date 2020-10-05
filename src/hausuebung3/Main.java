/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author Teresa
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        List<Weapon> list = new LinkedList<>();
        Main main = new Main();

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                s[0],
                CombatType.valueOf(s[1]),
                DamageType.valueOf(s[2]),
                Integer.parseInt(s[3]),
                Integer.parseInt(s[4]),
                Integer.parseInt(s[5]),
                Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());

        Printable p = w -> System.out.println("name=" + w.getName() + ", combatType=" + w.getCombatType() + ", damageType=" + w.getDamageType() + ", damage=" + w.getDamage() + ", speed=" + w.getSpeed() + ", minStrength=" + w.getMinStrength() + ", value=" + w.getValue());

        main.sort(list);

        for (int i = 0; i < list.size(); i++) {
            p.print(list.get(i));
        }

        main.sort2(list);
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            p.print(list.get(i));
        }

        Printable pi = w -> System.out.printf("'%50'" + "name=" + w.getName() + ", combatType=" + w.getCombatType() + ", damageType=" + w.getDamageType() + ", damage=" + w.getDamage() + ", speed=" + w.getSpeed() + ", minStrength=" + w.getMinStrength() + ", value=" + w.getValue());
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            pi.print(list.get(i));
        }
    }

    public void sort(List<Weapon> liste) {
        liste.sort((w1, w2) -> Integer.compare(w1.getDamage(), w2.getDamage()));
    }

    public void sort2(List<Weapon> liste) {
        liste.sort((w1, w2) -> {
            int erg = w1.getCombatType().compareTo(w2.getCombatType());

            if (erg == 0) {
                erg = w1.getDamageType().compareTo(w2.getDamageType());
            }
            if (erg == 0) {
                erg = w1.getName().compareTo(w2.getName());
            }
            return erg;
        });
    }
}
