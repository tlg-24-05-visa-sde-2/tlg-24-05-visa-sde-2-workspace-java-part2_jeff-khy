package com.jewelry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class JewelSortTest {
    public static void main(String[] args) {
        List<String> jewels = new ArrayList<String>();
        jewels.add("opal");
        jewels.add("emerald");
        jewels.add("onyx");
        jewels.add("sapphire");
        jewels.add("diamond");
        jewels.add("malachite");

        jewels.sort(null); //null means natural order
        dump(jewels);
        System.out.println();

        jewels.sort(new Comparator<String>() {
            @Override
            public int compare(String jewel1, String jewel2) {
                return Integer.compare(jewel1.length(), jewel2.length());
            }
        });
        dump(jewels);
        System.out.println();
    }

    private static void dump(List<String> jewelsList){
        for (String jewel : jewelsList){
            System.out.println(jewel);
        }
    }
}