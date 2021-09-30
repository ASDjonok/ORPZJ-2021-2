import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*List<String> list2 = Arrays.asList("adf", "bcd", "abc", "hgr", "jyt", "edr", "biu");

        String collect = list2.parallelStream().collect(StringBuilder::new, (res, elem) -> {
            res.append(" ").append(elem);
        }, (res1, res2) -> {
            res1.append(res2.toString());
            System.out.printf("res1=%s, res2=%s\n", res1, res2);
        }).toString();
        System.out.println("collect=" + collect);*/

        /*Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        ArrayList<String> filteredPhones = phones.filter(s->s.length()<12)
        .collect(
                        ()->new ArrayList<String>(), // создаем ArrayList
                        (list, item)->list.add(item), // добавляем в список элемент
                        (list1, list2)-> list1.addAll(list2)); // добавляем в список другой список

        filteredPhones.forEach(s->System.out.println(s));*/

        /*System.out.println(
                Arrays.toString(
                    Arrays.stream(new int[]{1, 2, 3, 4})
//                    Arrays.parallelStream(new int[]{1, 2, 3, 4})
                            .filter(value -> value > 2)
                            .map(operand -> operand*2)
                            .toArray()
                )
        );*/


        Integer[] array1 = {1, 3};
        Integer[] array2 = {2, 4};

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        System.out.println(
//                Arrays.toString(
                    list2.stream()
//                    Arrays.parallelStream(new int[]{1, 2, 3, 4})
                                /*.filter(value -> value > 2)
                                .map(operand -> operand*2)
                                .toArray()*/
                            .collect(
                                    ()-> list1, // создаем ArrayList
                                    (list, item)-> {
                                        int pos = 0;
                                        while (pos < list.size() && list.get(pos) < item) {
                                            pos++;
                                        }
                                        list.add(pos, item);
//                                        list.add(item);
                                    }, // добавляем в список элемент
                                    (list11, list21)-> list11.addAll(list21)) // добавляем в список другой список)
//                )
        );

        System.out.println("Done!");
    }
}
