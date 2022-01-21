package quadratic;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class CQuadratic
{
    // constants...
    static final double IMAGINARY_ROOTS = -9999;
    
    // properties...
    double mA, mB, mC;
    
    // methods...
    public CQuadratic(double anA, double aB, double aC)
    {
        mA = anA;
        mB = aB;
        mC = aC;
        
    }
    
    public boolean Solve()
    {
        if(TopRoot() == IMAGINARY_ROOTS)
        {
            return false;
            
        }
        else
        {
            return true;
            
        }
        
    }
    
    protected double TopRoot()
    {
        double preRoot = (Math.pow(mB, 2) - 4 * mA * mC);
        
        if(preRoot < 0)
        {
            return IMAGINARY_ROOTS;
            
        }
        else
        {
            return Math.pow(preRoot, 0.5);
            
        }
        
    }
    
    public double GetRootA()
    {
        return (-1 * mB + TopRoot()) / 2 * mA;
        
    }
    
    public double GetRootB()
    {
        return (-1 * mB - TopRoot()) / 2 * mA;
        
    }
        
}
