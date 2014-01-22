package fileutils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import slopecalcgui.SaveExitClearPanel;
import slopecalcgui.SummaryPanel;
import calculation.FreqStepCalculation;

public class FileWrite
{
	
	
    public FileWrite ()
    {
	
    }
    public static void WriteHeader() throws IOException
    {
	
    File FreqFile = new File("C:\\Temp\\FreqList.txt");
	FileWriter fWrite = new FileWriter (FreqFile);
	PrintWriter pw = new PrintWriter (fWrite);
  
    //use print writer and put the header info at the top of the file
    //pw.print(PrintHeader.printDivider());
    pw.print(FileHeaderInfo.printDivider());
    pw.println(FileHeaderInfo.getModelNumber());
    pw.println(FileHeaderInfo.getSerialNumber());
    pw.println(FileHeaderInfo.getIDNumber());
    pw.println(FileHeaderInfo.getSpecification());
    pw.println(FileHeaderInfo.getSection());
    pw.println(FileHeaderInfo.getCategory());
    pw.println(FileHeaderInfo.getDate());
    pw.println(FileHeaderInfo.getNotes());
    
    //write the frequency list parameters to the file
    pw.print(FileHeaderInfo.printDivider());
    pw.printf("Freq Cal Factor " + SummaryPanel.getfCalFactor() + "\n");
    pw.println("Freq Rate Type: " + SummaryPanel.getfRate());
    pw.printf("Freq per Decade: " + SummaryPanel.getfDecade() + "\n");
    pw.printf("Frequency Count: " + SummaryPanel.getfCount() + "\n");
    pw.printf("Start Freq: " + SummaryPanel.getfStart() + "\n" );
    pw.printf("Stop Freq: " + SummaryPanel.getfStop() + "\n" );
    pw.print(FileHeaderInfo.printDivider());
    
    //write the frequency list contents
    for (int i = 0; i < SaveExitClearPanel.freqList.size(); i++)
    {
        double dFreq  = SaveExitClearPanel.freqList.get(i);
        pw.printf( "%.3e\n" , dFreq );
    }        

    //remember to close the print writer
    pw.close();
    
    }
}
