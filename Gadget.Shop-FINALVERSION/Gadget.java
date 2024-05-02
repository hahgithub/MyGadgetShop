/**
 *  There are four attributes in the Gadget class: model, price (in pounds), weight (in grams), 
     and size (e.g., "71mm x 137mm x 9mm"), in that order. The model and size are text strings, 
     the price is a decimal, and the weight is an integer. Every attribute has a corresponding accessor method,
     and they are all initialized in the constructor by assigning one of the constructor's four parameters.
     A display method will output the model, price, weight, and size (appropriately annotated). 
 *
 * @author (Hasan H)
 * @version (01/05/24)
 */
public class Gadget
{
    private String myGadgetModel;
    private double myGadgetPrice;
    private int myGadgetWeight;
    private String myGadgetSize;
    /**
     * The attributes are initialised within the constructor (no return type) 
     * There are four parameters. 
     * Within the brackets are the user inputs which are then assigned as the
    updated values for the class attributes 
     */

    
    public Gadget (String newModel, double newPrice, int newWeight, 
    String newSize)
    {
        myGadgetModel = newModel;
        myGadgetPrice = newPrice;
        myGadgetWeight = newWeight;
        myGadgetSize = newSize;
    }
  
    public String getModel()
    {
        return myGadgetModel;
    }

    public double getPrice()
    {
        return myGadgetPrice;
    }

    public int getWeight()
    {
        return myGadgetWeight;
    }

    public String getSize()
    {
        return myGadgetSize;
    }

    public void display()
    {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Gadget Model is "+ myGadgetModel);
        System.out.println("The Price is £"+ myGadgetPrice);
        System.out.println("The Weight is "+ myGadgetWeight + " grams");
        System.out.println("The Size is "+ myGadgetSize + "mm");

    }
    
}