package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import calculation.FreqStepCalculation;

import java.awt.*;
import java.awt.event.*;

public class FreqDecadePanel extends JPanel implements ActionListener
{
	
	JRadioButton x1Button = new JRadioButton("x1");
	JRadioButton x5Button = new JRadioButton("x5");
	JRadioButton x10Button = new JRadioButton("x10");
	static JRadioButton x30Button = new JRadioButton("x30");
	JRadioButton x100Button = new JRadioButton("x100");
	JRadioButton xCButton = new JRadioButton("Custom");
	
	static JTextField jtxtCustom = new JTextField(5);
    private static double freqDecade = 0.0;
    static double fCal = 0.0;
    
    public FreqDecadePanel()
    {
	// create the buttons 
	x1Button.setActionCommand("x1");
	x1Button.setFont(new Font("SansSerif", Font.PLAIN, 13));
	x1Button.setSelected(true);
		
	x5Button.setFont(new Font("SansSerif", Font.PLAIN, 13));
	x5Button.setActionCommand("x5");
	
	x10Button.setFont(new Font("SansSerif", Font.PLAIN, 13));
	x10Button.setActionCommand("x10");

	x30Button.setFont(new Font("SansSerif", Font.PLAIN, 13));
	x30Button.setActionCommand("x30");
	
	x100Button.setFont(new Font("SansSerif", Font.PLAIN, 13));
	x100Button.setActionCommand("x100");
	
	xCButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
	xCButton.setActionCommand("Custom");		

	jtxtCustom.setFont(new Font("SansSerif", Font.PLAIN, 12));
	jtxtCustom.setBorder(BorderFactory.createLoweredBevelBorder());
	
	JLabel jlblSpacer = new JLabel("");
	
		
	//group the freq/decade buttons
	ButtonGroup factorGroup = new ButtonGroup();
	factorGroup.add(x1Button);
	factorGroup.add(x5Button);
	factorGroup.add(x10Button);
	factorGroup.add(x30Button);
	factorGroup.add(x100Button);
	factorGroup.add(xCButton);
		
	//register the buttons with the action listener
	x1Button.addActionListener(this);
	x5Button.addActionListener(this);
	x10Button.addActionListener(this);
	x30Button.addActionListener(this);
	x100Button.addActionListener(this);
	xCButton.addActionListener(this);
	
	//Put the radio buttons in a column in a panel.
	JPanel pnlCalcRdBtn = new JPanel(new GridLayout(0, 1));
	pnlCalcRdBtn.setBorder(new TitledBorder("Decade"));
	pnlCalcRdBtn.add(x1Button);
	pnlCalcRdBtn.add(x5Button);
	pnlCalcRdBtn.add(x10Button);
	pnlCalcRdBtn.add(x30Button);
	pnlCalcRdBtn.add(x100Button);
	pnlCalcRdBtn.add(xCButton);
	pnlCalcRdBtn.add(jtxtCustom);
	pnlCalcRdBtn.add(jlblSpacer);
	add(pnlCalcRdBtn);      	

    }

    @Override
    public void actionPerformed(ActionEvent e)
	{
        // capture the click events of the buttons
		String command = e.getActionCommand();
		/*send the radio button value to the summary panel */
		SummaryPanel.setfDecade(command);
		
		// parse the label string into a double
		if (command != "Custom")
			{
				String sDecade = (String) command.substring(1);
				freqDecade = Double.parseDouble(sDecade);
			}
		else
		{
			//get the value from the Custom text box
			freqDecade = Double.parseDouble(jtxtCustom.getText());
		}
        //call the calculate methode from the freq info class
        setCalFactor(FreqStepCalculation.CalcFreqFactor(freqDecade));
	}
    
	public  void setCalFactor(double fDecade)
	{
	     //freqDecade = fDecade;
	    fCal = fDecade;
	    
	}
	public static double getCalFactor()
	{
		return fCal;
	}
    
}
