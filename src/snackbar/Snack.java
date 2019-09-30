package snackbar;

public class Snack {
    //Class Fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    //Class Constructor
    public Snack(String name, int quantity, double cost, int vendingId){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    //Class Getters
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingId() {
        return vendingId;
    }

    //Class Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCost (double cost){
        this.cost = cost;
    }

    public void setVendingId(int vendingId){
        this.vendingId = vendingId;
    }

    //Class Methods
    public void addQuantity(int amount){
        quantity += amount;
    }

    public void buySnack(int amount){
        quantity -= amount;
        
    }

    public double getTotalCost(int amount){
        return cost * amount;
    }
}