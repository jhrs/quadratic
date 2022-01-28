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
            double a = 0.0, b = 0.0 , c = 0.0;
            String Prompt, A, B, C;
            
            if(args.length < 3)
            {
                System.out.println("To few parameters supplied for direct command line invokation\nUsage:-\njava -jar quadratic.jar A B C\n(Where A, B, and C are the co-efficients)\n");
                
                System.out.println("Equation parameters required please :-\n(General form of a quadratic equation is 'Ax^2 + Bx + C = 0')\n");
                
                for(int counter = 0; counter < 3; counter++)
                {
                    switch(counter)
                    {
                        case 0 :
                        {
                            Prompt = "A = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            Scanner UserInput = new Scanner(System.in);
                            a = UserInput.nextDouble();
                            
                            break;
                            
                        }
                        
                        case 1 :
                        {
                            Prompt = "B = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            Scanner UserInput = new Scanner(System.in);
                            b = UserInput.nextDouble();
                            
                            break;
                            
                        }
                        
                        case 2 :
                        {
                            Prompt = "C = ? (ENETR for zero)";
                            System.out.println(Prompt);
                            Scanner UserInput = new Scanner(System.in);
                            c = UserInput.nextDouble();
                            
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
                       
                ProcessEquation(a, b, c);            
                
            }
            else if(args.length > 3)
            {
                System.out.println("Now you're taking the piss!\n");
            }
            else
            {
                System.out.println("\nParameters look good, processing");
                System.out.println("Extracting parameters...\n");
                
                A = args[0].toString();
                B = args[1].toString();
                C = args[2].toString();
                
                System.out.println("Equation :-");
                System.out.println("(" + A + ").x^2 + (" + B + ").x + " + "(" + C + ")" + "\n");
                
                a = Double.parseDouble(A);
                b = Double.parseDouble(B);
                c = Double.parseDouble(C);
                
                ProcessEquation(a, b, c);
                
                System.out.println();
                          
            }
    
//            // run again?
//            // going to use a 'goto' as this qucik and simple code-base was never intended for this; shall refactor in the future!
//            System.out.println();
//            System.out.println("Run again ? (Null string for 'yes'; anything else for 'no')");
//            Scanner UserInput = new Scanner(System.in);
//            String userResponse = UserInput.nextLine();
//              
//            if(userResponse.length() > 0)
//            {
//                break;
//                
//           }

            // temporary hack by JHRS!
            break;
            
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

