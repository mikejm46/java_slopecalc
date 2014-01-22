package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class HeaderPanel extends JPanel
{
    static JLabel jlblHeader = new JLabel("Freq Calc v 1.0 j");
    private static String labelData;
    
    public HeaderPanel()
    {
	//JPanel panel1 = new JPanel();
	Box bxHeader = Box.createHorizontalBox();
	add(bxHeader);
		
	bxHeader.add(Box.createHorizontalStrut(120));
	bxHeader.add(jlblHeader);
	bxHeader.add(Box.createRigidArea(new Dimension(5,15)));
	bxHeader.add(Box.createHorizontalStrut(155));
	bxHeader.setBorder(new TitledBorder(""));
	add(bxHeader, BorderLayout.NORTH);
    }
    public static void setlabelData(String lblData)
    {
	labelData = lblData;
	jlblHeader.setText(lblData);
	
    }
    public static String getlabelData()
    {
	return labelData;
    }
    
}
