/**
The MP3 class, inheriting from the Gadget class, possesses a single attribute denoting the available memory.
This attribute is initialized in the constructor using one of the constructor's five parameters,
with a corresponding accessor method provided. The other constructor parameters specify the model, price, weight,
and size of the MP player, and these values are transmitted to the Gadget class constructor.
Additionally, the MP3 class includes a method for downloading music, which accepts a parameter representing the memory
consumption of the music. If sufficient memory is available on the MP3 player, the method decreases the available memory accordingly;
otherwise, an appropriate error message is displayed. Furthermore, a method for deleting music is included,
taking a parameter indicating the memory consumption of the deleted music and increasing the available memory of the MP3 player
accordingly.

 * @author Hasan H
 * @version (01/05/2024)
 */
public class MP3 extends Gadget
{
    private int myGadgetMemory;
    
    public MP3(String newModel, double newPrice, int newWeight,
    String newSize, int newMemory)
    {
        super (newModel, newPrice, newWeight, newSize);
        myGadgetMemory = newMemory;
    }
    

    public int getmyGadgetMemory()
    {
        return myGadgetMemory;
    }
    
    

    public void downloadMusic(int memory)
    {
        if (memory > 0)
        {
            if (memory <= myGadgetMemory)

            {
                myGadgetMemory -= memory;
                System.out.println("Downloading - " + "You have " + myGadgetMemory + "Mbs Left");
            
            }
        else
        {
            System.out.println("You have insufficient Memory");
        }
        }
        
    }
    
    
    
    public void deleteMusic(int Memory)
    {
        myGadgetMemory += Memory;
    }
    
    public void display ()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        super.display(); System.out.println("Available Memory: " + myGadgetMemory);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");    
        
    }
}