package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import calculation.FreqStepCalculation;
import fileutils.*;
import slopecalc.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

public class SaveExitClearPanel extends JPanel //implements ActionListener
{
	public static ArrayList<Double> freqList = new ArrayList<>();

    JButton jbCalc 	= new JButton("Calc");
    JButton jbClear = new JButton("Clear");
	JButton jbSave 	= new JButton("Save");
	JButton jbExit 	= new JButton("Exit");
	
     public SaveExitClearPanel()
    {
	//Configure the buttons
	Box bxCalcBtn = Box.createHorizontalBox();
	bxCalcBtn.add(Box.createHorizontalStrut(2));
	bxCalcBtn.add(jbCalc);
	bxCalcBtn.add(Box.createRigidArea(new Dimension(10,40)));
	bxCalcBtn.add(jbClear);
	bxCalcBtn.add(Box.createRigidArea(new Dimension(25,40)));
	bxCalcBtn.add(jbSave);
	bxCalcBtn.add(Box.createRigidArea(new Dimension(30,40)));
	bxCalcBtn.add(Box.createHorizontalGlue());
	bxCalcBtn.add(jbExit);
	bxCalcBtn.add(Box.createHorizontalStrut(2));
	add(bxCalcBtn, BorderLayout.SOUTH);
	
	//disable the save button until a calculation is done
	jbSave.setEnabled(false);
	jbCalc.setToolTipText("Calculate a List of Frequencies");
	jbClear.setToolTipText("Clear the selections and start over");
	jbSave.setToolTipText("Save the list of frequencies to a file");
	jbExit.setToolTipText("Exit the Program");
	
	//use an anonymous inner class to handle the calc event
	jbCalc.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
		{
        //call the calculate methode from the freq info class
        //get the start and stop freqs from the text boxes
		double frqStart = Double.parseDouble(RangePanel.jtxtfStart.getText());
		double frqStop = Double.parseDouble(RangePanel.jtxtfStop.getText());
				
        //make an array of the list size and populate it
        freqList = FreqStepCalculation.CalcFreqList(frqStart,frqStop,FreqDecadePanel.getCalFactor());
		//set the start, stop values
		SummaryPanel.setfStart(RangePanel.jtxtfStart.getText());	
		SummaryPanel.setfStop(RangePanel.jtxtfStop.getText());
		//set the number of calculated freq points
		Integer freqCount = freqList.size();
		SummaryPanel.setfCount(freqCount.toString());
		
		//manipulate the cal factor value to make it a formated string 4
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(4);
		SummaryPanel.setfCalFactor(nf.format(FreqStepCalculation.getCalFactor()));
		jbSave.setEnabled(true);
			
		}
	});
	
		
	//use an anonymous inner class to handle the clear event
	jbClear.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
		{
	    	//clear the summary labels, reset the controls
			FreqDecadePanel.x30Button.setSelected(true);
			FreqDecadePanel.jtxtCustom.setText("");
	    	RangePanel.jtxtfStart.setText("");
	    	RangePanel.jtxtfStop.setText("");
	    	SlopePanel.btnLog.setSelected(true);
	    	SummaryPanel.setfStart("");
	    	SummaryPanel.setfStop("");
	    	SummaryPanel.setfDecade("");
	    	SummaryPanel.setfRate("");
	    	SummaryPanel.setfCount("");
	    	SummaryPanel.setfCalFactor("");
	    	//clear the freq array
	    	freqList.clear();
	    	
	    	
		}
	});
	
	//use an anonymous inner class to handle the save event
	jbSave.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
		{
        	//make the file header
			FileHeaderInfo fileHeader = new FileHeaderInfo();
			
        	//use default data 
			SlopeCalcv1.TestHeader();
        	//write it to file
        	try
			{
				FileWrite.WriteHeader();
		        //display the list contents
		        for (int i = 0; i < freqList.size(); i++)
		        {
		            double dFreq  = freqList.get(i);
		            System.out.printf( "%.3e\n" , dFreq );
		        }
			} 
        	catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
	});
   
	//use an anonymous inner class to handle the exit event
	jbExit.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
		{
		    System.exit(0);
		}
	});

    }

}
