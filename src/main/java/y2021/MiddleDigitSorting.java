package y2021;

import java.util.TreeSet;

public class MiddleDigitSorting {

    public static int middle(int n) {

        int digits = (int) Math.log10(n) + 1;
        return (int) (n / Math.pow(10, digits / 2)) % 10;
    }

    public static void main(String[] args) {
        TreeSet<Integer>[] set = new TreeSet[10];
        int[] a = {11011, 15245, 16356, 10265, 13305};
        for (int i : a) {
            if (set[middle(i)] == null)
                set[middle(i)] = new TreeSet<>();
            set[middle(i)].add(i);
        }
        for (TreeSet<Integer> j : set) {
            if (j != null)
                j.forEach(System.out::println);
        }
    }

}
