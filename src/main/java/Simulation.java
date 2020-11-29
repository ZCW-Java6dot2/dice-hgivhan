import java.sql.SQLOutput;

public class Simulation {
    int numberOfDiesToThrow;
    int numberOfTossesToRun;
    Dice dice;
    Bins bins;

    public Simulation(int numberOfDiesToThrow, int numberOfTossesToRun) {
        this.numberOfDiesToThrow = numberOfDiesToThrow;
        this.numberOfTossesToRun = numberOfTossesToRun;
        dice = new Dice(numberOfDiesToThrow);
        bins = new Bins(numberOfDiesToThrow, numberOfTossesToRun);

    }

        public void runSimulation () {
            for (int i = 1; i < numberOfTossesToRun; i++) {
                bins.incrementBinCount(dice.tossAndSum());
            }
        }

        public String stars(double percentage){
        StringBuilder stars = new StringBuilder();
        int percent = (int)(percentage * 100);
        for (int i = 0; i < percent; i++){
            stars.append("*");
        }
            return stars.toString();
        }

        public void printResults () {
            int p;
            double numTimesPercentage;
            for (int i = numberOfDiesToThrow; i < numberOfDiesToThrow*6; i++) {
                p = bins.getBin(i);
                numTimesPercentage = ((double)p/numberOfTossesToRun);

                String string = String.format("%3d : %8d: %-2.2f %-5s", i, p, numTimesPercentage, stars(numTimesPercentage));

                System.out.println(string);

            }
        }
    }


//Create a simulation where two dies are thrown one million times. Keep track of all results.
    //Constructor takes arguments: numberOfDies to throw numberOfTosses to run
    //Simulation sim = new Simulation(2, 10000);
    //sim.runSimulation();
    //sim.printResults();

    //You can use a main() to run the simulations.
    //In your pull requests, create a new file with your name as the filename. PaulResults.md
    //Paste a copy of your text results into that file and then submit your pull request.
    //the results of the sim.printResults() should be an output string that looks like this:

    /*
***
Simulation of 2 dice tossed for 1000000 times.
***

 2 :    27917: 0.03 **
 3 :    55422: 0.06 *****
 4 :    83457: 0.08 ********
 5 :   110961: 0.11 ***********
 6 :   139098: 0.14 *************
 7 :   166977: 0.17 ****************
 8 :   138386: 0.14 *************
 9 :   111102: 0.11 ***********
10 :    83367: 0.08 ********
11 :    55799: 0.06 *****
12 :    27514: 0.03 **
     */


