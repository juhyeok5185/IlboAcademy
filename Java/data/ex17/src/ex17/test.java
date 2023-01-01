package ex17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(0, 2);
        list.remove(0);
        list.contains(3);
        Collections.sort(list); // 오름차순
        Collections.sort(list, Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}