public class Main {

    public static void main(String[] args) {
        OneQuarterGumballMachine gumballMachine_1 = new OneQuarterGumballMachine(1);

        System.out.println("\n-----Testing OneQuarterGumballMachine-----");
        System.out.println("Adding 30 cents in first machine");
        gumballMachine_1.insertCoin( 30 );
        gumballMachine_1.turnCrank();

        System.out.println("Adding 25 cents in first machine");
        gumballMachine_1.insertCoin( 25 );
        gumballMachine_1.turnCrank();

        System.out.println("Adding 25 cents in first machine(testing no gumball case)");
        gumballMachine_1.insertCoin( 25 );
        gumballMachine_1.turnCrank();


        System.out.println("\n-----Testing TwoQuarterGumballMachine-----");
        TwoQuarterGumballMachine gumballMachine_2 = new TwoQuarterGumballMachine(50);
        System.out.println("Adding 25 cents in second machine");
        gumballMachine_2.insertCoin( 25 );
        gumballMachine_2.turnCrank();
        gumballMachine_2.insertCoin( 25 );
        gumballMachine_2.turnCrank();

        System.out.println("Adding 50 cents in second machine");
        gumballMachine_2.insertCoin( 25 );
        gumballMachine_2.insertCoin( 25 );
        gumballMachine_2.turnCrank();

        System.out.println("Adding 10 cents in second machine");
        gumballMachine_2.insertCoin( 10 );
        gumballMachine_2.turnCrank();


        System.out.println("\n-----Testing AnyCoinGumballMachine-----");
        AnyCoinGumballMachine gumballMachine_3 = new AnyCoinGumballMachine(50);

        System.out.println("Adding 5 cents in third machine");
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.turnCrank();

        System.out.println("Adding 50 cents in third machine----case1");
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 25 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.turnCrank();

        System.out.println("Adding 50 cents in third machine----case2");
        gumballMachine_3.insertCoin( 25 );
        gumballMachine_3.insertCoin( 25 );
        gumballMachine_3.turnCrank();

        System.out.println("Adding 50 cents in third machine----case3");
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.insertCoin( 10 );
        gumballMachine_3.turnCrank();

        System.out.println("Adding 50 cents in third machine----case4");
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.insertCoin( 5 );
        gumballMachine_3.turnCrank();

        System.out.println("Adding 15 cents in third machine");
        gumballMachine_3.insertCoin( 15 );


    }
}
