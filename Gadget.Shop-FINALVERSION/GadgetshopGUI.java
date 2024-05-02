/**
 * The GadgetShop class is designed to maintain an ArrayList, not an array, of Gadget type objects to manage the gadgets in the shop.
 *
 * @author (Hasan H)
 * @version (01/05/2024)
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GadgetshopGUI
{
    public static void main(String[] args)
    {
        new gadgetShop().setVisible(true);
    }
}

class gadgetShop extends JFrame 
{
    private ArrayList<Gadget> gadgets;
    private JTextField priceBox, modelBox,sizeBox, weightBox, memoryBox, creditBox, phoneNumberBox,durationBox,downloadSizeBox, displayNumBox;    
    private JButton addMP3Button, addMobileButton ,deleteListButton,clearInputButton, displayButton, downloadMusicButton, makeACallButton;
    private JPanel displayPanel;
    private int displayNumber;

    public gadgetShop()
    {
        /**
         * Creating a frame and setting its format, size and colour.
         * used two layouts. Border and Grid
         */
        gadgets = new ArrayList<>();
        setTitle("MY GADGET SHOP");

        setSize(600, 400);
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        add(inputPanel, BorderLayout.CENTER);
        inputPanel.setLayout(new GridLayout(15, 10));
        inputPanel.setBackground(Color.GRAY);

        JLabel title = new JLabel("             MY GADGET SHOP               ");
        title.setForeground(Color.DARK_GRAY);
        title.setFont(new Font("Arial Red", Font.BOLD, 35));
        title.setOpaque(true);
        title.setBackground(Color.PINK);
        add(title, BorderLayout.NORTH);

        /**
         * Added text field for user to input. Text area was not used as we did not need to use multiple lines. 
         * User will only use up single line when input.
         */

        modelBox = new JTextField();
        priceBox = new JTextField();
        weightBox = new JTextField();
        sizeBox = new JTextField();
        creditBox = new JTextField();
        memoryBox = new JTextField();
        phoneNumberBox = new JTextField();
        durationBox = new JTextField();
        downloadSizeBox = new JTextField();

        modelBox.setForeground(Color.BLACK);
        modelBox.setBackground(Color.LIGHT_GRAY);
        modelBox.setFont(new Font("Arial", Font.BOLD, 20));

        priceBox.setForeground(Color.BLACK);
        priceBox.setBackground(Color.LIGHT_GRAY);
        priceBox.setFont(new Font("Arial", Font.BOLD, 20));

        weightBox.setForeground(Color.BLACK);
        weightBox.setBackground(Color.LIGHT_GRAY);
        weightBox.setFont(new Font("Arial", Font.BOLD, 20));

        sizeBox.setForeground(Color.BLACK);
        sizeBox.setBackground(Color.LIGHT_GRAY);
        sizeBox.setFont(new Font("Arial", Font.BOLD, 20));

        creditBox.setForeground(Color.BLACK);
        creditBox.setBackground(Color.LIGHT_GRAY);
        creditBox.setFont(new Font("Arial", Font.BOLD, 20));

        memoryBox.setForeground(Color.BLACK);
        memoryBox.setBackground(Color.LIGHT_GRAY);
        memoryBox.setFont(new Font("Arial", Font.BOLD, 20));

        phoneNumberBox.setForeground(Color.BLACK);
        phoneNumberBox.setBackground(Color.LIGHT_GRAY);
        phoneNumberBox.setFont(new Font("Arial", Font.BOLD, 20));

        durationBox.setForeground(Color.BLACK);
        durationBox.setBackground(Color.LIGHT_GRAY);
        durationBox.setFont(new Font("Arial", Font.BOLD, 20));        

        downloadSizeBox.setForeground(Color.BLACK);
        downloadSizeBox.setBackground(Color.LIGHT_GRAY);
        downloadSizeBox.setFont(new Font("Arial", Font.BOLD, 20));

        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        makeACallButton = new JButton("Make a Call");
        downloadMusicButton = new JButton("Download Music");
        displayButton = new JButton("Display All");
        deleteListButton = new JButton("Delete List");
        clearInputButton = new JButton ("Clear Input");

        /**
         * below are the the prompts which are already visible on the gui. Shows the user what to input.
         * It is not a button and cannot be edited whilst GUI is running.
         */
        inputPanel.add(new JLabel("Model:")); inputPanel.add(modelBox);
        inputPanel.add(new JLabel("Price (£):"));inputPanel.add(priceBox);
        inputPanel.add(new JLabel("Weight (grams):"));inputPanel.add(weightBox);
        inputPanel.add(new JLabel("Size:"));inputPanel.add(sizeBox);
        inputPanel.add(new JLabel("Phone Number:"));inputPanel.add(phoneNumberBox);
        inputPanel.add(new JLabel("Credit - ONLY MOBILES:"));inputPanel.add(creditBox);
        inputPanel.add(new JLabel("Duration - ONLY MOBILES:"));inputPanel.add(durationBox);
        inputPanel.add(new JLabel("Memory - ONLY MP3's:"));inputPanel.add(memoryBox);
        inputPanel.add(new JLabel("Download Size- ONLY MP3's:"));inputPanel.add(downloadSizeBox);

        /**
         * Adding Buttons and changing font/colour and size.
         */

        displayNumBox = new JTextField();
        displayNumBox.setFont(new Font("Arial", Font.BOLD, 20)); 
        inputPanel.add(new JLabel("Display No."));
        inputPanel.add(displayNumBox);

        inputPanel.add(addMobileButton);
        addMobileButton.setBackground(Color.DARK_GRAY);
        addMobileButton.setForeground(Color.WHITE);
        addMobileButton.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(addMP3Button);
        addMP3Button.setBackground(Color.DARK_GRAY);
        addMP3Button.setForeground(Color.WHITE);
        addMP3Button.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(makeACallButton);
        makeACallButton.setBackground(Color.DARK_GRAY);
        makeACallButton.setForeground(Color.WHITE);
        makeACallButton.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(downloadMusicButton);
        downloadMusicButton.setBackground(Color.DARK_GRAY);
        downloadMusicButton.setForeground(Color.WHITE);
        downloadMusicButton.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(displayButton);
        displayButton.setBackground(Color.DARK_GRAY);
        displayButton.setForeground(Color.WHITE);
        displayButton.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(deleteListButton);
        deleteListButton.setBackground(Color.DARK_GRAY);
        deleteListButton.setForeground(Color.WHITE);
        deleteListButton.setFont(new Font("Arial", Font.BOLD, 20));

        inputPanel.add(clearInputButton);
        clearInputButton.setBackground(Color.DARK_GRAY);
        clearInputButton.setForeground(Color.WHITE);
        clearInputButton.setFont(new Font("Arial", Font.BOLD, 20));


        ActionListener addMobileListener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent click) 
            {
                try 
                {
                    Mobile mobile = new Mobile(modelBox.getText(), Double.parseDouble(priceBox.getText()),
                    Integer.parseInt(weightBox.getText()),sizeBox.getText(), Integer.parseInt(creditBox.getText()));

                    gadgets.add(mobile);
                    JOptionPane.showMessageDialog(null, "Mobile added");
                } 
                catch (NumberFormatException exception) 
                {
                        JOptionPane.showMessageDialog(null, "INCOMPLETE INPUT");
                }
            }
        };addMobileButton.addActionListener(addMobileListener);

        ActionListener addMP3Listener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent click)
            {
                try
                {
                    MP3 mp3 = new MP3(modelBox.getText(), Double.parseDouble(priceBox.getText()),
                    Integer.parseInt(weightBox.getText()), sizeBox.getText(), Integer.parseInt(memoryBox.getText()));

                    gadgets.add(mp3);
                    JOptionPane.showMessageDialog(null,"MP3 Player added!");
                }
                catch (NumberFormatException exception)
                {
                    JOptionPane.showMessageDialog(null,"INCOMPLETE INPUT");
                }
            }
        };addMP3Button.addActionListener(addMP3Listener);

        
        ActionListener deleteListListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                gadgets.clear();
                JOptionPane.showMessageDialog(null, "All gadgets cleared");
            }
        };deleteListButton.addActionListener(deleteListListener);

        
        ActionListener clearInputListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                for (JTextField clearInput : new JTextField[]
                {
                    modelBox, priceBox, weightBox, sizeBox, creditBox, memoryBox, 
                    phoneNumberBox, durationBox, downloadSizeBox,displayNumBox})  

                    clearInput.setText(null);
                    JOptionPane.showMessageDialog(null, "Boxes cleared");
            }
        };clearInputButton.addActionListener(clearInputListener);
        

        ActionListener displayListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                StringBuilder displayDetails = new StringBuilder();

                for (Gadget gadget : gadgets) 
                {
                    displayDetails.append("Display Number: ").append(displayNumber).append("\n");
                    gadget.display();
                    displayNumber++;
                }

                System.out.println(displayDetails); 
            }
        };displayButton.addActionListener(displayListener);
        
        
        ActionListener makeACallListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                String phoneNumber = phoneNumberBox.getText();
                int durationOfCall = Integer.parseInt(durationBox.getText());

                if (getDisplayNumber() != -1) 
                {
                    Gadget gadget = gadgets.get(getDisplayNumber());
                    Mobile mobile = (Mobile) gadget;
                    mobile.makeACall(phoneNumber, durationOfCall);
                } 
                else
                    {
                        JOptionPane.showMessageDialog(null, "Please add display number to Make A Call");
                    }
            }
        };makeACallButton.addActionListener(makeACallListener);
        

        ActionListener downloadMusicListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                int memory = Integer.parseInt(downloadSizeBox.getText());

                if (getDisplayNumber() != -1)
                    {
                        Gadget gadget = gadgets.get(getDisplayNumber());
                        MP3 mp3 = (MP3) gadget;
                        mp3.downloadMusic(memory);
                        JOptionPane.showMessageDialog(null, "Downloading Music " );
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null, "Please add display number to Download Music");
                    }
            }
        };downloadMusicButton.addActionListener(downloadMusicListener);  
}


private int getDisplayNumber() 
{
    try 
        {
            int displayNum = Integer.parseInt(displayNumBox.getText());
            if (displayNum < 0) 
                {
                    JOptionPane.showMessageDialog(this, "Invalid display number. Please enter a number between 0 and " + (gadgets.size() - 1));
                    return -1;
                }
                
            if (displayNum >= gadgets.size()) 
                {
                    JOptionPane.showMessageDialog(this, "Invalid display number. Please enter a number between 0 and " + (gadgets.size() - 1));
                    return -1;
                }
                
            else 
                {
                return displayNum;
                }
            }

    catch (NumberFormatException exc) 
    {
        JOptionPane.showMessageDialog(this, "Invalid display number. Please enter a valid integer.");
        return -1;
    }
    }
}
