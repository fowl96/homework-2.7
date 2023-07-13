import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num%2==1){
                System.out.println(num);
            }
        }

        List<Integer> numss = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : numss) {
            if(num%2==0){
                set.add(num);
            }
        }
        System.out.println(set);

        List<String> words = new ArrayList<>(List.of("qwe", "ert", "asd", "asd"));
        Set<String> sett = new HashSet<>(words);
        System.out.println(sett);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)){
                map.put(string, 1);
            } else {
                map.put(string, map.get(string)+1);
            }
        }
        System.out.println(map.values());
    }
}