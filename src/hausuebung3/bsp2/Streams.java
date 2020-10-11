package hausuebung3.bsp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public double average(int[] numbers) {
        return IntStream.of(numbers).average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {
        return Arrays.asList(strings)
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return weapons.stream()
                .min((Weapon o1, Weapon o2) -> o1.getDamage() - o2.getDamage())
                .get();

    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream()
                .max((Weapon o1, Weapon o2) -> o1.getMinStrength() - o2.getMinStrength())
                .get();
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream()
                .filter(w -> w.getDamageType().ordinal() == DamageType.MISSILE.ordinal())
                .collect(Collectors.toList());
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream()
                .max((Weapon o1, Weapon o2) -> o1.getName().length() - o2.getName().length())
                .get();
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream()
                .map(Weapon::getName)
                .collect(Collectors.toList());
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream()
                .mapToInt(Weapon::getSpeed)
                .toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream()
                .map(w -> w.getValue())
                .reduce(0, (a, b) -> a + b);
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream()
                .map(w -> w.hashCode())
                .reduce(0, (a, b) -> a + b);
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream()
                .forEach(w -> w.setValue((int) (w.getValue() * 1.1)));
    }
}
