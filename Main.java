 import java.sql.SQLOutput;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean tof = true;
        while(tof) {
            System.out.println("I am not a robot");
            System.out.println("(type enter)");
            String enter = s.nextLine();

            if (enter.equals("enter")) {
                tof = false;
                int i = 0;
                while(i < 3) {
                    System.out.println("=====================");
                    System.out.println("");
                    System.out.println("Which one is a pet name:");
                    System.out.println("[1] Johnny");
                    System.out.println("[2] Kelly");
                    System.out.println("[3] Father");
                    System.out.println("[4] Doctor Strange");
                    System.out.println("[5] Browny");
                    System.out.println("");
                    int choose = s.nextInt();
                    if(choose == 5){
                        System.out.println("Welcome user");
                        break;
                    }
                    else{
                        i++;
                    }
                }
                if(i == 3){
                    System.out.println("Login Error");
                    System.out.println("=====================");
                    tof = true;
                }
            } else {
                System.out.println("Invalid input");
                System.out.println("=====================");

            }
        }
    }
}