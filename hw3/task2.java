package hw3;
import java.util.ArrayList;
// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> new_list = new ArrayList<Integer>();
        new_list.add(6);
        new_list.add(5);
        new_list.add(4);
        new_list.add(3);
        new_list.add(2);
        new_list.add(1);
        new_list.add(0);
        for (int i = 0; i < new_list.size(); i++) {
            if (new_list.get(i) % 2 == 0) {
                new_list.remove(i);
                i --;
            }
        }
        System.out.println(new_list);
    }
}