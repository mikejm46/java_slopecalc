package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class RangePanel extends JPanel implements ActionListener
{

    static JTextField	jtxtfStart	= new JTextField(5);
	static JTextField	jtxtfStop	= new JTextField(5);
	
	public RangePanel()
    {
	
	JLabel		jlblfStart	= new JLabel("Freq Start");
	JLabel		jlblfStop	= new JLabel("Freq Stop");

	//Configure the text boxes
	Box bxfreqSpan = Box.createHorizontalBox();
	add(bxfreqSpan );
	bxfreqSpan.add(Box.createVerticalStrut(2));
	bxfreqSpan.add(Box.createHorizontalStrut(4));
	bxfreqSpan.add(jlblfStart);
	bxfreqSpan.add(Box.createRigidArea(new Dimension(5,10)));
	bxfreqSpan.add(jtxtfStart);
	//bxfreqSpan.add(Box.createHorizontalGlue());
	bxfreqSpan.add(Box.createHorizontalStrut(5));
	bxfreqSpan.add(jlblfStop);
	bxfreqSpan.add(Box.createRigidArea(new Dimension(5,10)));
	bxfreqSpan.add(jtxtfStop);
	bxfreqSpan.add(Box.createHorizontalStrut(4));
	bxfreqSpan.add(Box.createVerticalStrut(2));
	bxfreqSpan.setBorder(new TitledBorder("Range"));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	String command = e.getActionCommand();
    	SummaryPanel.setfStart(command);
    	SummaryPanel.setfStop(command);
    }

}
