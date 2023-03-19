import java.util.Scanner;

public class rain {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("It is raining enter 1 and not enter 0: ");
        int rain = sc.nextInt();


        while (true){
            if (rain == 0) {

                System.out.println("You are Saved");
                break;
            }
            if (rain  == 1) {
                System.out.print("Are you outside enter 1 and not enter 0: ");
                int outside = sc.nextInt();
                if (outside == 0) {
                    System.out.println("You are Saved");
                    break;
                } else if (outside == 1) {
                    System.out.print("You have an umbrella enter 1 and not enter 0: ");
                    int umbrella = sc.nextInt();
                    if(umbrella == 0){
                        System.out.println("You wet");
                        break;
                    } else if (outside ==  1) {
                        System.out.println("You are Saved");
                        break;
                    }
                }
            }
            else {
                System.out.println("Invalid Choice");
                break;
            }

        }
    }
}
