public class Dice {
    private int numOfDice;
    private int tossedSum;

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum(){
            for (int i=0; i <= numOfDice; i++){
                tossedSum += (int) Math.random()*6 +1;
            }
            return tossedSum;
        }

    public Integer getNumOfDice (){return numOfDice;}

//Create a Dice class that acts like a set of N random-tossed dies.
    // Dice dice = new Dice(2); for craps
   // Dice dice = new Dice(5); for yahtzee
   // Integer toss = dice.tossAndSum();
    //create dice tests

}
