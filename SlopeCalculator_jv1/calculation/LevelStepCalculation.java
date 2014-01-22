package calculation;

public class LevelStepCalculation
{
    public double[] LogSlope(double StartFreq, double StopFreq, double StartLevel, double StopLevel)
    {
        //calculate level point logarithmically
        // X1 = start freq, X2 = stop freq
        // Y1 = start level, Y2 = stop level
         
	double levelM1 = 0.0;
        double levelB1 = 0.0;
        double levelFlag = 0.0;
        double[] logSLopeCalcValues = new double[7];

        //calculate M1 value
        // M1 = (Y2 - Y1) / (X2- X1)
        levelM1 = (Math.log10(StopLevel) - Math.log10(StartLevel)) / (Math.log10(StopFreq) - Math.log10(StartFreq));

        //calculate B1 value
        // B1 = Y2 -(M1 * X2)
        levelB1 = Math.log10(StopLevel) - (levelM1 * Math.log10(StopFreq));

        // put the values in the array to return it
        logSLopeCalcValues[0] = levelM1;
        logSLopeCalcValues[1] = levelB1;
        logSLopeCalcValues[2] = StartFreq;
        logSLopeCalcValues[3] = StopFreq;
        logSLopeCalcValues[4] = StartLevel;
        logSLopeCalcValues[5] = StopLevel;
        logSLopeCalcValues[6] = levelFlag;
        //return the array with the M1 and B1 values
        return logSLopeCalcValues;
    }
    
    public double[] LinSlope(double StartFreq, double StopFreq, double StartLevel, double StopLevel)
    {
        double levelM1 = 0.0;
        double levelB1 = 0.0;
        double levelFlag = 0.0;
        double[] linSLopeCalcValues = new double[7];

        //calculate logarithmically
        // X1 = start freq, X2 = stop freq
        // Y1 = start level, Y2 = stop level
        // M1 = (Y2 - Y1) / (X2- X1) 
        levelM1 = (StopLevel - StartLevel) / (StopFreq - StartFreq);

        //calculate B1 value
        // B1 = Y2 -(M1 * X2)
        levelB1 = StopLevel - (levelM1 *StopFreq);

        // put the values in the array to return it
        linSLopeCalcValues[0] = levelM1;
        linSLopeCalcValues[1] = levelB1;
        linSLopeCalcValues[2] = StartFreq;
        linSLopeCalcValues[3] = StopFreq;
        linSLopeCalcValues[4] = StartLevel;
        linSLopeCalcValues[5] = StopLevel;
        linSLopeCalcValues[6] = levelFlag;
        //return the array with the M1 and B1 values
        return linSLopeCalcValues;
    }

    public static double CalcLevel_Log(double SlopeStart, double SlopeStop,double FreqPoint)
    {
        //calculate the level based on the slope y=mx+b
        double levelLog = 0.0;
        double tempY = 0.0;

        tempY = SlopeStart * (Math.log10(FreqPoint)) + SlopeStop;
        levelLog = (Math.pow(10, tempY));

        return levelLog;
    }
    
    public static double CalcLevel_Lin(double SlopeStart, double SlopeStop,double FreqPoint)
    {
        //calculate the level based on the slope y=mx+b
        double levelLin = 0.0;
        double tempY = 0.0;

        tempY = SlopeStart * FreqPoint + SlopeStop;
        levelLin = (Math.pow(10, tempY));

        return levelLin;
    }
}
