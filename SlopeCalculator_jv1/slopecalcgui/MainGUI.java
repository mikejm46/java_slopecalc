package slopecalcgui;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JPanel 
{
	

	public  MainGUI()
	{	
			
		// set the layout using the BorderLayout format
		setLayout(new BorderLayout(3,3));
		
		HeaderPanel headerp1 = new HeaderPanel();
		add(headerp1, BorderLayout.NORTH);
		
		FreqDecadePanel fdp1 = new FreqDecadePanel();
		add(fdp1, BorderLayout.WEST);
		
		SaveExitClearPanel secp1 = new SaveExitClearPanel();
		add(secp1, BorderLayout.SOUTH);
		
		//use a box to hold the three panels and make it look like one
		RangePanel rngp1 = new RangePanel();
		SlopePanel slopep1 = new SlopePanel();
		SummaryPanel sump1 = new SummaryPanel();
		
		Box bxFreqInfo = Box.createVerticalBox();
		bxFreqInfo.add(Box.createVerticalStrut(1));
		bxFreqInfo.add(rngp1);
		bxFreqInfo.add(Box.createVerticalStrut(1));
		bxFreqInfo.add(slopep1);
		bxFreqInfo.add(Box.createVerticalStrut(1));
		bxFreqInfo.add(sump1);
		bxFreqInfo.add(Box.createVerticalStrut(5));
		bxFreqInfo.setBorder(new TitledBorder("Freq Info"));
		this.add(bxFreqInfo, BorderLayout.CENTER);
	}
	

    	
}