package ActionItem_Assignments;

import java.util.ArrayList;

public class ActionItem1_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("UK");
        countries.add("Canada");
        countries.add("China");
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(2);
        countryCode.add(3);
        countryCode.add(4);
        for (int i = 0; i < 4; i++) {
            System.out.print("My country is " + countries.get(i) + " and my country code is " + countryCode.get(i) + " ");
        }
    }
}
