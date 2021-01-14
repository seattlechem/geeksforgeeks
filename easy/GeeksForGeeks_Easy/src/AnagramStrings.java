import java.util.HashMap;

public class AnagramStrings {
    static int areAnagram(String s1, String s2) {
        boolean isAnagram = false;
        char[] s1List = s1.toCharArray();
        char[] s2List = s2.toCharArray();

        if (s1List.length != s2List.length) {
            isAnagram = false;
        } else {
            // answer = 1;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < s1List.length; i++) {
                Integer val = map.get(s1List[i]);
                if (val != null) {
                    map.put(s1List[i], Integer.valueOf(val + 1));
                } else {
                    map.put(s1List[i], 1);
                }
            }

            // iterate s2List and deduct if a key is found
            for (int i = 0; i < s2List.length; i ++) {
                Integer val = map.get(s2List[i]);
                if (val != null) {
                    map.put(s2List[i], Integer.valueOf(val - 1));
                }
            }

            for (int i = 0; i < s1List.length; i++) {
                if (map.get(s1List[1]) == 0) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }
            }
        }
        return (isAnagram ? 1 : 0);
    }

}
