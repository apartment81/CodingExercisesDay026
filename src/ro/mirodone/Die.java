package ro.mirodone;

import java.util.Random;

public class Die {

    private int value = 1;
    private int sides = 6;
    private Random random = new Random();
    private int [] history;

    // constructor
     Die (int sides){
        if(sides >= 1){
            this.sides = sides;
        }
        history = new int[this.sides];
    }

    // implement a roll method to generate a number for the value

    public void Roll (){
        value = random.nextInt(sides) +1 ;
        history[value-1]++;
    }

    //get value of the Die
    public int getValue() {
        return value;
    }

    public int getSides() {
        return sides;
    }

    // reset the history of this die
    public void resetHistory () {
        history = new int[sides];
    }

    public int getHistoryValue ( int side) {
        if(side >= 1 && side <= this.sides){
            return history[side-1];
        }
        throw new IllegalArgumentException("Invalid side");
    }

    //print out the histogram results of the die's roll history
    public String getHistogram (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s\n%s\n\n", "Histogram of die", "----------"));
        for (int i = 0; i<sides; i++){
            stringBuilder.append(String.format("%-4d", i+1));
            for ( int j =0; j <history[i]; j++){
                stringBuilder.append("*");
            }stringBuilder.append("\n");
        }return  stringBuilder.toString();
    }

}
