package calculation;
/* FreqSlopeCalculations Class
 * FreqSlopeCalculations class will accept the parameters needed to:
 * 	Calculate the Cal Ffactor needed for the desired number of frequencies per decade.
 *  Calculate the list frequency points for the given range of frequencies.
 *  Return the parameters used to calculate the frequency list.
 * 
 */

import java.util.ArrayList;

public class FreqStepCalculation
{
	static double calFactor;
	static int freqCount;
	
	//constructor
	public FreqStepCalculation()
	{
	}
	
	public static double CalcFreqFactor(double freqDecade)
	{
		//calculate the freq cal factor based on the number of freq/decade
		    calFactor = Math.pow(10, (1 / freqDecade));
	        
	        return calFactor;
	}

	public static ArrayList<Double> CalcFreqList(double startFreq, double stopFreq,
		double FreqIndex)
	{
		//methode to calculate the freq list 
		double dnewFreq = 0;
		//use an ArrayList to hold values before putting them into an array
			ArrayList<Double> tempFreqList = new ArrayList<>();
			// save the first frequency in the list
			dnewFreq = startFreq;
		  	//calculate the freq list
		    do
		    {
		        //calculate and add the new freq to the arraylist
		        tempFreqList.add(dnewFreq);
		        dnewFreq = dnewFreq * FreqIndex;
		    }
		    while (dnewFreq <= stopFreq);
		    //don't forget the stop freq value
		    tempFreqList.add(stopFreq);

		return tempFreqList;
	}


	public static double getCalFactor()
	{
		return calFactor;
	}
	
/*
 		public static int getFreqCount()
	{
	    return freqCount;
	}
	public static double getStopFreq()
	{
		return fStop;
	}
	
	public static double getStartFreq()
	{
		return fStart;
	}
	public static double getFreqPerDecade()
	{
		return fDecade;
	}
	
	public static String getSlopeType()
	{
		return slopeType;
	}
	
	public static String setSlopeType(String sSlope)
	{
		slopeType = sSlope;
		return slopeType;
	}
*/
	
}
