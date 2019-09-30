package snackbar;

public class Main {
    public static void main(String[] args){
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine foodMachine = new VendingMachine("Food");
        VendingMachine drinkMachine = new VendingMachine("Drink");
        VendingMachine officeMachine = new VendingMachine("Office");

        String name, int quantity, double cost, int vendingId
        Snack chips = new Snack("Chips", 36, 1.75, foodMachine.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, foodMachine.getId());
        Snack pretzel = new Snack("Pretzels", 30, 2.00 , foodMachine.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drinkMachine.getId());
        Snack water = new Snack("Water", 20, 2.75, drinkMachine.getId());

        System.out.println("***Transaction 1: Jane buys 3 sodas at $2.50 each***")
        System.out.print("Before:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(soda.getName() + " quantity: " + soda.getQuantity());
        jane.pay(soda.getCost() * 3);
        soda.buySnack(3);
        System.out.print("After:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(soda.getName() + " quantity: " + soda.getQuantity());
        System.out.println();

        System.out.println("***Transaction 2: Jane buys 1 pretzel at $2.00 each***")
        System.out.print("Before:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        jane.pay(pretzel.getCost() * 1);
        pretzel.buySnack(1);
        System.out.print("After:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        System.out.println();

        System.out.println("***Transaction 3: Bob buys 2 sodas at $2.50 each***")
        System.out.print("Before:");
        System.out.println(bob.getName() + "'s cash: " + bob.getCash());
        System.out.println(soda.getName() + " quantity: " + soda.getQuantity());
        bob.pay(soda.getCost() * 2);
        soda.buySnack(2);
        System.out.print("After:");
        System.out.println(bob.getName() + "'s cash: " + bob.getCash());
        System.out.println(soda.getName() + " quantity: " + soda.getQuantity());
        System.out.println();

        System.out.println("***Payday 4: Jane find $10***");
        System.out.print("Before:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        jane.addMoney(10);
        System.out.print("After:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println();

        System.out.println("***Transaction 5: Jane buys 1 chocolate bar at $1.00 each***")
        System.out.print("Before:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(chocolate.getName() + " quantity: " + chocolate.getQuantity());
        jane.pay(chocolate.getCost() * 1);
        chocolate.buySnack(1);
        System.out.print("After:");
        System.out.println(jane.getName() + "'s cash: " + jane.getCash());
        System.out.println(chocolate.getName() + " quantity: " + chocolate.getQuantity());
        System.out.println();

        System.out.println("***Inventory Update 6: Add 12 more pretzels***")
        System.out.print("Before:");
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        pretzel.addQuantity(12);
        System.out.print("After:");
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        System.out.println();

        System.out.println("***Transaction 7: Bob buys 3 pretzels at $2.00 each***")
        System.out.print("Before:");
        System.out.println(bob.getName() + "'s cash: " + bob.getCash());
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        bob.pay(pretzel.getCost() * 3);
        pretzel.buySnack(3);
        System.out.print("After:");
        System.out.println(bob.getName() + "'s cash: " + bob.getCash());
        System.out.println(pretzel.getName() + " quantity: " + pretzel.getQuantity());
        System.out.println();

    }
}