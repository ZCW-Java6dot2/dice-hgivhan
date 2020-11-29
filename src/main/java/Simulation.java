import java.sql.SQLOutput;

public class Simulation {
    private Integer numberOfDiesToThrow;
    private Integer numberOfTossesToRun;
    private Dice dice;
    private Bins bins;

    public Simulation(int numberOfDiesToThrow, int numberOfTossesToRun) {
        this.numberOfDiesToThrow = numberOfDiesToThrow;
        this.numberOfTossesToRun = numberOfTossesToRun;
        dice = new Dice(numberOfDiesToThrow);
        bins = new Bins(numberOfDiesToThrow, numberOfTossesToRun);

    }

        public void runSimulation () {
        Integer result;
            for (int i = 1; i < numberOfTossesToRun; i++) {
                result = dice.tossAndSum();
                bins.incrementBinCount(result);
            }
        }

        public float calcPercent(int binNumber){
        float rolledVal = bins.getBin(binNumber+2);
        float total = rolledVal/numberOfTossesToRun;
        return total;

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
            System.out.printf("***\n"+"Simulation of '%d' dice tossed for '%d' times\n"+"***\n\n", numberOfDiesToThrow, numberOfTossesToRun);
            for (int i = numberOfDiesToThrow; i < numberOfDiesToThrow*6; i++) {
                System.out.printf("%2d :% 9d: % 4.2f %s\n",i,bins.getBin(i-2),calcPercent(i),stars(i));


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


