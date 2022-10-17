/*
Write a code which determines the gender using Polish name.
If name ends with “a” then is a female name. Female names: Marta, Anna, Iga, Agnieszka.
Male names: Pawel, Tomasz, Lukasz and so on. The names to be checked
{“Michal”, “Monika”, “Anna”, “Maria”, “Mariusz”}. The program should write the gender male/female to names.
 */

public class PolishName {

    public static String determineGender(String name) {
        if(name.charAt(name.length()-1) == 'a')
            return"female";
        return "male";
    }
}
