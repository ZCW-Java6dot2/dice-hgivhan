import javax.management.ObjectInstance;
import java.util.Arrays;

public class Bins {
    int minRoll;
    int maxRoll;
    private int[] binArray;
    //bins  roll results(2 die)
//    0         2
//    1         3
//    2         4
//    3         5
//    4         6
//    5         7
//    6         8
//    7         9
//    8         10
//    9         11
//    10        12


    public Bins(int min, int max) {
        this.minRoll = min;
        this.maxRoll = max;
        binArray = new int[max + 1];
        for (int i = min; i <= max; i++) {
            binArray[i] = 0;
        }
    }

    public void incrementBinCount(int rollResult) {
        binArray[rollResult+2]++;
        //-2 to match actual number based on index
    }

    public Integer getBin(int binNumber) {
        return binArray[binNumber];
    }

    public Integer getMin() {
        return minRoll;
    }

    public Integer getMax() {
        return maxRoll;
    }
}

//        public int[] displayBin() {
//            System.out.println(Arrays.toString(binArray));
//            return binArray;







//Create a tracking class Bins that can be used to track these results.
    //Bins results = new Bins(2, 12); // for bins from 2..12
   // Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
    //results.incrementBin(10); // should increment bin # 10
    // create bins tests


