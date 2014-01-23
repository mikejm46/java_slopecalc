package slopecalc;


//import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import slopecalcgui.*;
import calculation.FreqStepCalculation;
import fileutils.FileHeaderInfo;


public class SlopeCalcv1 extends JPanel
{
	//ArrayList<Double> freqList = new ArrayList<>();
	
    public static void main(String[] args)throws Exception
    {
		new FreqStepCalculation();
		new MainGUI();
		
		// Create the frame and title
		JFrame frame = new JFrame("Frequency Calculator");
		java.net.URL imageURL = MainGUI.class.getResource("default_text.png");
		
	    if (imageURL != null)
	    	{
	        	//return ImageIcon for frame
	    		frame.setIconImage(new ImageIcon(imageURL).getImage());
	    	} 
	    else
	    	{
	    		System.err.println("Couldn't find file: " + imageURL);
	    	}
		
		// set its size
		frame.setSize(380, 350);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		// exit program when window closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		//Create and set up the content pane.
        JComponent newContentPane = new MainGUI();
        //content panes must be opaque
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
        frame.pack();
	
        // Show it.
        frame.setVisible(true);
		
        
        
    }
    //a methode to test the header info class
    public static void TestHeader()
    {
    	//default data to send to FileHeaderInfo
    	String sModel = "FA5301";
    	String sSerial = "987654";
    	String sID = "5003-5003-12";
    	String sSpec = "DO-160G;";
    	String sSect = "19.3.2";
    	String sCat = "CW";
    	String sNote = "Test Notes go Here!";
    	
    	//send the data to the FileHeader class;
    	FileHeaderInfo.setModelNumber(sModel);
    	FileHeaderInfo.setSerialNumber(sSerial);
    	FileHeaderInfo.setIDNumber(sID);
    	FileHeaderInfo.setSpecification(sSpec);
    	FileHeaderInfo.setSection(sSect);
    	FileHeaderInfo.setCategory(sCat);
    	FileHeaderInfo.setNotes(sNote);
    }

}
