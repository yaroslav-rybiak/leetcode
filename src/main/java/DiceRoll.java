import java.util.Random;

public class DiceRoll {

    public static void main(String[] args) {
        DiceRoll dr = new DiceRoll();
        System.out.println(dr.howManyPairs());
    }

    public int howManyPairs() {
        Dice d6 = new Dice(6);
        return d6.rollTwo(10);
    }


    public static class Dice {
        private final int numberOfSides;

        public Dice(int numberOfSides) {
            this.numberOfSides = numberOfSides;
        }

        public int rollTwo(int numberOfRolls) {
            int pairs = 0;
            for (int i = 1; i <= numberOfRolls; i++) {
                Random r = new Random();
                int firstDice = r.nextInt(this.numberOfSides) + 1;
                int secondDice = r.nextInt(this.numberOfSides) + 1;
                System.out.println("Roll number " + i);
                System.out.println("first dice: " + firstDice);
                System.out.println("second dice: " + secondDice);
                if (firstDice == secondDice) {
                    pairs++;
                    System.out.println("WE HAVE A PAIR (" + pairs + ")");

                } else {
                    System.out.println("Not a pair");
                }
                System.out.println();
            }
            return pairs;
        }
    }
}