package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class SlopePanel extends JPanel implements ActionListener
{
	static JRadioButton btnLog = new JRadioButton("Log");
	static JRadioButton btnLin = new JRadioButton("Linear");
	
    public SlopePanel()
    {
	//create the rate buttons
	
	btnLin.setActionCommand("Lin");
	btnLin.setFont(new Font("SansSerif", Font.PLAIN, 13));
	
	btnLog.setActionCommand("Log");
	btnLog.setFont(new Font("SansSerif", Font.PLAIN, 13));
	btnLog.setSelected(true);
	//don't know if this is a good way to do this
	SummaryPanel.setfRate("Log");
	
	//group the buttons
	ButtonGroup rateGroup = new ButtonGroup();
	rateGroup.add(btnLog);
	rateGroup.add(btnLin);
	//register the buttons with the action listener
	btnLog.addActionListener(this);
	btnLin.addActionListener(this);
	
	Box bxCalcLogBtn = Box.createHorizontalBox();
	add(bxCalcLogBtn);
	bxCalcLogBtn.add(Box.createHorizontalStrut(50));
	bxCalcLogBtn.add(btnLog);
	bxCalcLogBtn.add(Box.createRigidArea(new Dimension(45,20)));
	bxCalcLogBtn.add(Box.createHorizontalGlue());
	bxCalcLogBtn.add(btnLin);
	bxCalcLogBtn.add(Box.createHorizontalStrut(55));
	bxCalcLogBtn.setBorder(new TitledBorder(""));
    }
    
	/** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e)
	{
        // capture the click events of the buttons
		String command = e.getActionCommand();
		SummaryPanel.setfRate(command);
	}
    

}
