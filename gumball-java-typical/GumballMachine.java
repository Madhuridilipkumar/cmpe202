import java.util.*;

public abstract class GumballMachine {

    protected int numGumballs;
    protected ArrayList<Integer> acceptedCoins;
    protected int valueOfCoins = 0 ;
    protected int minCost;

    public GumballMachine( int size, int minCost, ArrayList<Integer> acceptedCoins) {
        // initialise instance variables
        this.numGumballs = size;
        this.acceptedCoins = new ArrayList<Integer>(acceptedCoins);
        this.minCost = minCost;
    }

    public void insertCoin(int coinValue) {
        if (this.numGumballs > 0) {
            if (acceptedCoins.contains(coinValue)) {
                this.valueOfCoins += coinValue;
            }
            else {
                System.out.println("Please insert the valid coins...Ejecting the coin\n");
            }
        }
        else {
            System.out.println("Sorry there are no GumBalls\n");
        }
    }

    public void turnCrank(){

        if (this.valueOfCoins >= this.minCost) {
            System.out.println("Ejecting GumBall...Balance amount is " + (this.minCost - this.valueOfCoins) +" cents\n");
            this.numGumballs --;
        }
        else if(this.valueOfCoins > 0) {
            System.out.println("Inserted coins not sufficient please insert " + (this.minCost - this.valueOfCoins) +" cents..Ejecting the coin\n");
        }
        this.valueOfCoins = 0;
    }
}