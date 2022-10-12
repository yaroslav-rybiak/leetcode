import java.util.HashMap;

public class RomansToInteger {

    public static int romanToInt(String s) {

        int result = 0;

        HashMap<String, Integer> doublesMap = new HashMap<>();
        doublesMap.put("IV", 4);
        doublesMap.put("IX", 9);
        doublesMap.put("XL", 40);
        doublesMap.put("XC", 90);
        doublesMap.put("CD", 400);
        doublesMap.put("CM", 900);

        HashMap<String, Integer> singlesMap = new HashMap<>();
        singlesMap.put("I", 1);
        singlesMap.put("V", 5);
        singlesMap.put("X", 10);
        singlesMap.put("L", 50);
        singlesMap.put("C", 100);
        singlesMap.put("D", 500);
        singlesMap.put("M", 1000);

        for(String key: doublesMap.keySet()) {
            if(s.contains(key)) {
                result+=doublesMap.get(key);
                s = s.replace(key, "");
            }
        }

        for(String key: singlesMap.keySet()) {
            while(s.contains(key)) {
                result+=singlesMap.get(key);
                s = s.replaceFirst(key, "");
            }
        }

        return result;
    }
}
