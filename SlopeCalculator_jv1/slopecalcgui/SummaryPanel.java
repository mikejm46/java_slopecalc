package slopecalcgui;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class SummaryPanel extends JPanel 
{
    private static String fDecade;
    private static String fStart;
    private static String fStop;
    private static String fRate;
    private static String fCount;
    private static String fCalFactor;
    
    private static JLabel 	jlblfStart2	= new JLabel("xxxx");
    private static JLabel 	jlblfStop2	= new JLabel("xxxx");
    private static JLabel 	jlblfDecade2	= new JLabel("xx");
    private static JLabel 	jlblfRate2	= new JLabel("xxx");
    private static JLabel 	jlblfCount2	= new JLabel("xxx");
    private static JLabel	jlblfCalFactor2 = new JLabel("x.xxx");
    
    public SummaryPanel()
    {
	JLabel 	jlblfStart1 	= new JLabel("Freq Start (Hz): ");
	JLabel 	jlblfStop1	= new JLabel("Freq Stop (Hz): ");
	JLabel 	jlblfDecade1	= new JLabel("Freq/Decade: ");
	JLabel 	jlblfRate1	= new JLabel("Freq Rate: ");
	JLabel 	jlblfCount1	= new JLabel("Freq Count: ");
	JLabel 	jlblfCalFactor1 = new JLabel("Cal Factor: ");
	
	//create the Summary panel
	JPanel pnlSummary = new JPanel(new GridLayout(6, 2));
	pnlSummary.add(jlblfStart1);
	jlblfStart1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfStart2);
	
	pnlSummary.add(jlblfStop1);
	jlblfStop1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfStop2);
	
	pnlSummary.add(jlblfDecade1);
	jlblfDecade1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfDecade2);
	
	pnlSummary.add(jlblfRate1);
	jlblfRate1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfRate2);
	
	pnlSummary.add(jlblfCount1);
	jlblfCount1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfCount2);
	
	pnlSummary.add(jlblfCalFactor1);
	jlblfCalFactor1.setHorizontalAlignment(SwingConstants.LEFT);
	pnlSummary.add(jlblfCalFactor2);
	
	add(pnlSummary);
    }
	
    //getters and setters to save the summary data
	public static void setfStart(String freqStart)
	{
	    fStart = freqStart;
	    jlblfStart2.setText(fStart);
	}
	public static String getfStart()
	{
		return fStart;
	}
	public static void setfStop(String freqStop)
	{
	    fStop = freqStop;
	    jlblfStop2.setText(fStop);
	}
	public static String getfStop()
	{
		return fStop;
	}
	public static void setfRate(String freqRate)
	{
	    fRate = freqRate;
	    jlblfRate2.setText(fRate);
	}
	public static String getfRate()
	{
		return fRate;
	}
	public static void setfDecade(String freqDecade)
	{
	    fDecade = freqDecade;
	    jlblfDecade2.setText(fDecade);
	}
	public static String getfDecade()
	{
		return fDecade;
	}
	public static void setfCount(String freqCount)
	{
	    fCount = freqCount;
	    jlblfCount2.setText(fCount);
	}
	public static String getfCount ()
	{
		return fCount;
	}
	public static void setfCalFactor(String freqCalFactor)
	{
		fCalFactor = freqCalFactor;
		jlblfCalFactor2.setText(fCalFactor);
	}
	public static String getfCalFactor()
	{
		return fCalFactor;
	}
	
}
