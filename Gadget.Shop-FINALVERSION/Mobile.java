/**
 * The Mobile class, derived from the Gadget class, possesses a singular attribute representing the remaining calling
credit in whole minutes. This attribute is initialized within the constructor using one of the constructor's five parameters,
and a corresponding accessor method is provided. The constructor's other parameters delineate the model, price,
weight, and size of the mobile phone, with these values passed to the Gadget class constructor.
Within the Mobile class, a method allows users to augment their calling credit by a specified amount.
If the provided credit is positive, it is appended to the existing credit; otherwise, a prompt instructs the user to enter a positive amount.
Additionally, a method facilitates making phone calls, requiring the user to input the phone number and call duration. If sufficient credit exists, a message displaying the phone number and duration is shown, and the remaining credit is reduced by the call duration. Conversely, if there is insufficient credit, a message informs the user accordingly. Furthermore, a method is included to exhibit the mobile's details, adhering to the same signature as the Gadget class's display method. It invokes the Gadget class's method to exhibit the model, price, weight, and size, followed by an annotation indicating the remaining calling credit in minutes.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile extends Gadget
{
    private int myGadgetCredit;

    public Mobile (String newModel, double newPrice, int newWeight,
    String newSize, int newCredit)
    {
        super (newModel, newPrice, newWeight, newSize);
        myGadgetCredit = newCredit;
    }


    public int getCredit()
    {
        return myGadgetCredit;
    }


    public void addCredit(int addOnCredits)
    {
        if (addOnCredits > 0)
        {
            myGadgetCredit += addOnCredits;
        }
        else
        {
            System.out.println("-INVALID INPUT-");          
            System.out.println("Please re-enter positive amount");
        }
    }
    
    public void makeACall(String phoneNumber, int durationOfCall)
    {
        if (myGadgetCredit >= durationOfCall)
        {
            myGadgetCredit -= durationOfCall;
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Duration: " + durationOfCall + " minutes");
            System.out.println("You have " + (myGadgetCredit -= durationOfCall) + " minutes left on credit");

        }
            
        else
        {
            System.out.println("You have do not have enough myGadgetCredit. Please add more myGadgetCredit to proceed with a call");
        }
    } 
    
    public void display ()
    {
        super.display(); System.out.println("Credit remaining: " + myGadgetCredit);
    }
    
}
