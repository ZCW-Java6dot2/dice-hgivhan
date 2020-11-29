import java.util.Arrays;

public class Bins {
        private int[] binArray;

        public Bins(int min, int max) {
            binArray = new int[max+1];
            for (int i = min; i <= max; i++) {
                binArray[i] = 0;
            }
        }

        public void incrementBinCount(int rollResult) {
            binArray[rollResult] += 1;
        }

        public Integer getBin(int binNumber) {
            return binArray[binNumber];
        }

        public int[] displayBin() {
            System.out.println(Arrays.toString(binArray));
            return binArray;
        }
    }






//Create a tracking class Bins that can be used to track these results.
    //Bins results = new Bins(2, 12); // for bins from 2..12
   // Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
    //results.incrementBin(10); // should increment bin # 10
    // create bins tests


