/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

import java.util.Scanner;

class fees
{
    boolean feePayStatus = true;
}
class course
{
    String[] courses =
            {
                    ": AI", ": ML", ": DS", ": DSA", ": OOP", ": SE2", ": For all couses"};
}

class prereq
{
    String pre_req_of_DSA = "  PF for OOP";
    String pre_req_of_SE2 = "  SE1 for SE2";
}

class result
{
    // we have two condition;

    String PF = "Passed";
    String SE1 = "Fail";
}

public class Main
{
    public static void main (String[]args)
    {

        Scanner sc = new Scanner (System.in);

        fees feeOjb = new fees ();
        course courseObj = new course ();
        prereq prereqObj = new prereq ();
        result resultObj = new result ();

        while (true)
        {
            System.out.println
                    ("\n\n******** Student Course Registration System *******\n");

            System.out.println ("  1: for check the PreRequiste of Courses");
            System.out.println ("  2: for check the fee status of your");
            System.out.println ("  3: Available courses for registration \n");
            System.out.print ("  Enter the choice here: ");
            int choice = sc.nextInt ();
            // System.out.println("  Enter a code for registration"+"\n");

            if (choice == 1)
            {
                System.out.println (prereqObj.pre_req_of_DSA + "\n" +
                        prereqObj.pre_req_of_SE2);
                break;
            }

            else if (choice == 2)
            {
                if (feeOjb.feePayStatus)
                {
                    System.out.println ("  Paid");
                }
                else
                {
                    System.out.println ("  Not Paid");
                }
                break;
            }

            else if (choice == 3)
            {
                System.
                        out.println ("********** So Available Course *************");
                for (int i = 0; i < courseObj.courses.length; i++)
                {
                    System.out.println ("  " + i + courseObj.courses[i]);
                }
                System.out.print ("  Enter a course code for registration: ");
                int courseChoice = sc.nextInt ();
                if (courseChoice == 0 && feeOjb.feePayStatus)
                {
                    System.out.println ("  Enrolled in AI");
                    break;
                }
                else if (courseChoice == 1 && feeOjb.feePayStatus)
                {
                    System.out.println ("  Enrolled in ML");
                    break;
                }
                else if (courseChoice == 2 && feeOjb.feePayStatus)
                {
                    System.out.println ("  Enrolled in DS");
                    break;
                }
                else if (courseChoice == 3 && feeOjb.feePayStatus)
                {
                    System.out.println ("  Enrolled in DSA");
                    break;
                }
                else if (courseChoice == 4 && feeOjb.feePayStatus)
                {
                    if (resultObj.PF == "Passed")
                    {
                        System.out.println ("  Enrolled in OOP");
                    }
                    else
                    {
                        System.out.println
                                ("  Your OOP PreRequiste is not cleared so, sorry you can`t enroll in this course with out passing the OOP");
                    }
                    break;
                }
                else if (courseChoice == 5 && feeOjb.feePayStatus)
                {
                    if (resultObj.PF == "Passed")
                    {
                        System.out.println ("  Enrolled in SE2");
                        break;
                    }
                    else
                    {
                        System.out.println
                                ("  Your SE1 PreRequiste is not cleared so, sorry you can`t enroll in this course without passing the SE1");
                        break;
                    }
                }
                else if (courseChoice == 6 && feeOjb.feePayStatus)
                {
                    if (resultObj.PF == "Passed" && resultObj.SE1 == "Passed")
                    {
                        for (int i = 0; i < courseObj.courses.length - 1; i++)
                        {
                            System.out.println ("  " +
                                    (courseObj.
                                            courses[i]).substring (2));
                        }
                        break;
                    }
                    else if (resultObj.PF == "Fail" || resultObj.SE1 == "Fail")
                    {
                        if (resultObj.PF == "Fail")
                        {
                            System.out.println
                                    ("  you can not enroll in OOP because you are not passed in PF");
                            break;
                        }
                        if (resultObj.SE1 == "Fail")
                        {
                            System.out.println
                                    ("  you can not enroll in SE2 because you are not passed in SE1");
                            break;
                        }
                        else
                        {
                            System.out.println
                                    ("you can not enroll because you are not passing in pre requiste of course");
                            break;
                        }
                    }

                }
                else if (!feeOjb.feePayStatus)
                {
                    System.out.println ("  fees is not Paid");
                    break;
                }
                else
                {
                    System.out.println ("  Enter a valid course Code");
                }
            }
            else
            {
                System.out.println ("  Enter a valid choice");
            }
        }
    }
}
