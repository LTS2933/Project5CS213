package com.example.project5cs213.model;

/**
 * This class represents a donut order and contains methods such as getting
 * the price of the order and getting the type of the order
 * @author Christian Osma, Liam Smith
 */
public class Donut extends MenuItem {
    public static final double YEAST = 1.59;
    public static final double CAKE = 1.79;
    public static final double HOLE = 0.39;

    // CAKE, YEAST, or HOLE
    private String type;
    private String flavor;
    private int quantity;

    /**
     * Default constructor that sets the type of order to a YEAST donut
     */
    public Donut(){
        this.type = "YEAST";
        this.flavor = "CHOCOLATE";
        this.quantity = 1;
    }

    /**
     * Overloaded constructor that sets the type of donut to the type specified
     * @param type String representing the type of donut
     */
    public Donut(String type){
        this.type = type;
        this.flavor = "CHOCOLATE";
        this.quantity = 1;
    }

    /**
     * Overloaded constructor that sets the Donut object to the type and flavor specified
     * in the input
     * @param type String representing the type of donut
     * @param flavor String representing the flavor of the donut
     */
    public Donut(String type, String flavor){
        this.type = type;
        this.flavor = flavor;
        this.quantity = 1;
    }

    /**
     * Overloaded constructor that sets the Donut object to the type, flavor specified
     * , and quantity in the input
     * @param type String representing the type of donut
     * @param flavor String representing the flavor of the donut
     * @param quantity Quantity of the donut order
     */
    public Donut(String type, String flavor, int quantity){
        this.type = type;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    /**
     * Copy constructor to copy the contents of the inputted donut
     * to a new object
     * @param donut Donut to be copied
     */
    public Donut(Donut donut){
        this.type = donut.getType();
        this.flavor = donut.getFlavor();
        this.quantity = donut.getQuantity();
    }

    /**
     * Getter method for getting the quantity of the donut order
     * @return integer representing the quantity of the order
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Setter method for setting the new quantity of the donut order
     * @param quantity New quantity of the donut order
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * Setter method that changes the type of donut to the type specified in the parameter
     * @param type String representing the new type of donut
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Getter method for obtaining the type of donut order
     * @return String representing the type of donut order
     */
    public String getType(){
        return this.type;
    }

    /**
     * Setter method for setting the flavor of the donnut
     * @param flavor String representing the flavor of donut
     */
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    /**
     * Getter method for obtaining the flavor of the donut
     * @return String representing the flavor of donut
     */
    public String getFlavor(){
        return this.flavor;
    }

    /**
     * This method returns the price of the donut order depending
     * on the type of donut
     * @return double representing the price of the donut order
     */
    public double getPrice(){
        if (type.equals("YEAST")) return YEAST * this.quantity;
        else if (type.equals("CAKE")) return CAKE * this.quantity;
        return HOLE * this.quantity;
    }

    /**
     * This method compares two donut orders and checks if they are equal
     * @return true if the donut orders are equal
     */
    @Override
    public boolean equals(Object obj){
        Donut compare = null;
        if (obj instanceof Donut) compare = (Donut) obj;
        else return false;
        return (compare.getType().equals(this.type));
    }

    /**
     * This method returns the donut object as a string
     * @return String representing the donut
     */
    @Override
    public String toString(){
        return "Donut - " + type + " \nflavor: " + flavor + "\n" + "quantity: " + this.quantity + "\n";
    }
}
