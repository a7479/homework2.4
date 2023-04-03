import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        List<Integer> nums = generate(20);
        System.out.println("Сгенерированные числа" + nums);
        task1(nums);
        task2(nums);
        task3(List.of("Иван", "Марья", "Сергей", "Роман", "Илья", "Иван"));
        task4(List.of("Иван", "Марья", "Сергей", "Иван", "Роман", "Илья", "Иван"));


    }

    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(10));
        }
        return list;
    }


    public static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + "  ");

            }
        }
        System.out.println();
        System.out.println("---------------------------------------  ");
    }


    public static void task2(List<Integer> nums) {
        System.out.println("Задача2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {

                System.out.print(num + "  ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------  ");


    }


    public static void task3(List<String> words) {
        System.out.println("Задача3");
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {

                System.out.print(word + "  ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------  ");


    }

    public static void task4(List<String> words) {
        System.out.println("Задача4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);

            }


        }
        System.out.print(map);
    }

}


