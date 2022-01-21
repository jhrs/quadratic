/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Map;
//import org.fluentd.logger.FluentLogger;


/**
 *
 * @author Jason
 */
public class Quadratic
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        //start:
        
        for(;;)
        {
            if(args.length < 3)
            {
                System.out.println("To few parameters supplied for direct command line invokation\nUsage:-\njava -jar quadratic.jar A B C\n(Where A, B, and C are the co-efficients)\n");
                
                System.out.println("Equation parameters required please :-\n(General form of a quadratic equation is 'Ax^2 + Bx + C = 0')\n");
                
                Scanner UserInput = new Scanner(System.in);
                String Prompt, a = "", b = "", c = "";
                for(int counter = 0; counter < 3; counter++)
                {
                    switch(counter)
                    {
                        case 0 :
                        {
                            Prompt = "A = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            a = UserInput.nextLine(); 
                            
                            break;
                            
                        }
                        
                        case 1 :
                        {
                            Prompt = "B = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            b = UserInput.nextLine(); 
                            
                            break;
                            
                        }
                        
                        case 2 :
                        {
                            Prompt = "C = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            c = UserInput.nextLine(); 
                            
                            break;
                            
                        }
                        
                        default :
                        {
                            Prompt = "Fatal Error";
                            
                        }
                        
                    }
                                  
                }
                System.out.println();
                
                System.out.println("Parameters look good, processing\n");
                System.out.println("Extracting parameters...\n");
                
                double A, B, C;
                A = Double.parseDouble(a);
                B = Double.parseDouble(b);
                C = Double.parseDouble(c);
                
                ProcessEquation(A, B, C);            
                
            }
            else if(args.length > 3)
            {
                System.out.println("Now you're taking the piss!\n");
            }
            else
            {
                System.out.println("Parameters look good, processing\n");
                System.out.println("Extracting parameters...\n");
                
                double A, B, C;
                A = Double.parseDouble(args[0]);
                B = Double.parseDouble(args[1]);
                C = Double.parseDouble(args[2]);
                
                ProcessEquation(A, B, C);
                          
            }
    
            // run again?
            // going to use a 'goto' as this qucik and simple code-base was never intended for this; shall refactor in the future!
            System.out.println();
            System.out.println("Run again ? (Null string for 'yes'; anything else for 'no')");
            Scanner UserInput = new Scanner(System.in);
            String userResponse = UserInput.nextLine();
            
            if(userResponse.length() > 0)
            {
                break;
                
            }
  
        }
        
    }
    
    protected static void ProcessEquation(double anA, double aB, double aC)
    {
        CQuadratic Equation = new CQuadratic(anA, aB, aC);
        
        if(Equation.Solve())
        {
            double rootA = Equation.GetRootA();
            double rootB = Equation.GetRootB();
            
            System.out.println("Your equation has the following roots :-");
            System.out.println(Double.toString(rootA));
            System.out.println(Double.toString(rootB));
            
            
        }
        else
        {
            System.out.println("Your equation has imaginary roots...");
            
        }
        
    }
    
}

