package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        Die die1 = new Die(6);
        Die die2 = new Die(6);


         die1.Roll();
        die2.Roll();
        ///System.out.println(die1.getValue());
       // System.out.println(die2.getValue());

        for (int i =0 ; i <10 ; i++) {
            die1.Roll();
            System.out.println("Die roll: " + die1.getValue());
        }

        System.out.println(die1.getHistogram());
        //die1.resetHistory();
      //  System.out.println(die1.getHistogram());

        System.out.println("==================");
        System.out.println("We rolled 6 for " + die1.getHistoryValue(6) + " times");

    }
}
