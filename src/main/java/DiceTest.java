import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDice(){
        //Given
        int expectedNumOfDice = 3;

        //When
        Dice dice = new Dice(expectedNumOfDice);
        int actualDiceCount = dice.getNumOfDice();

        //Then
        Assert.assertEquals(expectedNumOfDice, actualDiceCount);
    }

    @Test
    public void testTossedSum(){
        Dice dice = new Dice(2);

        Integer actualSum = dice.tossAndSum();

        Assert.assertTrue(actualSum >= 2 && actualSum <=12);
        //How to test random number generator
    }


}


//    public Integer tossAndSum(){
//        public Integer tossAndSum(){
//            for (int i=0; i <= numOfDice; i++){
//                tossedSum += 1+ (int) Math.random()*6;
//            }
//            return tossedSum;
//        }
//    }
//
//    public Integer getNumOfDice (){return numOfDice;}

