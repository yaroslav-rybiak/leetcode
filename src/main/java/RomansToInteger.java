public class RomansToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        while(s.contains("IV")) {
            result+=4;
            s = s.replaceFirst("IV", "");
        }
        while(s.contains("IX")) {
            result+=9;
            s = s.replaceFirst("IX", "");
        }
        while(s.contains("XL")) {
            result+=40;
            s = s.replaceFirst("XL", "");
        }
        while(s.contains("XC")) {
            result+=90;
            s = s.replaceFirst("XC", "");
        }
        while(s.contains("CD")) {
            result+=400;
            s = s.replaceFirst("CD", "");
        }
        while(s.contains("CM")) {
            result+=900;
            s = s.replaceFirst("CM", "");
        }
        while(s.contains("I")) {
            result+=1;
            s = s.replaceFirst("I", "");
        }
        while(s.contains("V")) {
            result+=5;
            s = s.replaceFirst("V", "");
        }
        while(s.contains("X")) {
            result+=10;
            s = s.replaceFirst("X", "");
        }
        while(s.contains("L")) {
            result+=50;
            s = s.replaceFirst("L", "");
        }
        while(s.contains("C")) {
            result+=100;
            s = s.replaceFirst("C", "");
        }
        while(s.contains("D")) {
            result+=500;
            s = s.replaceFirst("D", "");
        }
        while(s.contains("M")) {
            result+=1000;
            s = s.replaceFirst("M", "");
        }
        return result;
    }
}
