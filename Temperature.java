
/**
 * Write a description of class Temperature here.
 *
 * @author (R. Shiroya)
 * @version (01-23-2020)
 */
public class Temperature
{
    // two fields : celsius and fahrenheit.
    private double celsius;
    private double fahrenheit;
    
    // default constructor
    public Temperature()
    {
        celsius = 0;
        fahrenheit = 32; 
    }
    //constructor
    public Temperature(double value, char scale)
    {
        
        if(scale == 'c')
        {
            celsius = value;
            fahrenheit = (celsius * 9.0/5) + 32;
        }
        
        else if (scale == 'f')
        {
            fahrenheit = value;
            celsius = (fahrenheit - 32)/(9.0/5);
        }
    }   
    
    // set() methods

    public void setCelsius(double inCelsius)
    {
        celsius = inCelsius;
        fahrenheit = (celsius * 9.0/5) + 32;
        
    }
    public void setFahrenheit(double inFahrenheit)
    {
        fahrenheit = inFahrenheit;
        celsius = (fahrenheit - 32)/(9.0/5);
        
    }
    
    //get() methods
    public double getCelsius()
    {
        return celsius;
    }
    public double getFahrenheit()
    {
        return fahrenheit;
    }
    
    public String toString()
    {
        return "Fahrenheit: " + fahrenheit +  "\nCelsius: " + celsius;
    }

}
