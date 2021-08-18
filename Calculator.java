import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("List of operations: add subtract multiply divide alphabetize");

        // Prompt to Choose an Operation

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter an operation:");
        String opInput = input.next();
        String op = opInput.toLowerCase();

        switch(op){

            case "add":

            int num1, num2;
            
            System.out.println("Enter two integers:");

            if (input.hasNextInt()){
                num1 = input.nextInt();
                if (input.hasNextInt()){
                num2 = input.nextInt();
                int addresult= num1 + num2;
                System.out.println("Answer:" + addresult);
            }else{System.out.println("Invalid input entered. Terminating...");
                  }
            } else {
            System.out.println("Invalid input entered. Terminating..."); }
            break;

            

            case "subtract":

            int num3, num4;
            
            System.out.println("Enter two integers:");

            if (input.hasNextInt()){
                num3 = input.nextInt();
                if (input.hasNextInt()){
                num4 = input.nextInt();
                int subresult= num3 - num4;
                System.out.println("Answer:" + subresult);
            }else{System.out.println("Invalid input entered. Terminating...");
                  }
            } else {
            System.out.println("Invalid input entered. Terminating..."); }
             break;



            case "multiply":

            double num5, num6;
            
            System.out.println("Enter two doubles:");

            if (input.hasNextDouble()){
                num5 = input.nextDouble();
                if (input.hasNextDouble()){
                num6 = input.nextDouble();
                double multiresult= num5 * num6;
                System.out.printf("Answer: %.2f \n", multiresult);
            }else{System.out.println("Invalid input entered. Terminating...");
                  }
            } else {
            System.out.println("Invalid input entered. Terminating..."); }

            break;


            case "divide":

            double num7, num8;
            
            System.out.println("Enter two doubles:");

            if (input.hasNextDouble()){
                num7 = input.nextDouble();
                if (input.hasNextDouble()){
                num8 = input.nextDouble();

                    if (num8!=0) {
                    double divresult= num7 / num8;
                    System.out.printf("Answer: %.2f \n", divresult);
                }
                    else{System.out.println("Invalid input entered. Terminating...");
                     }

            }else{System.out.println("Invalid input entered. Terminating...");
                  }
            } else {
            System.out.println("Invalid input entered. Terminating..."); }

            break;

            case "alphabetize":

            System.out.println("Enter two words:");

            if (input.hasNext()){
                String worda = input.next();
                String word1 = worda.toLowerCase();
                if (input.hasNext()){
                String wordb = input.next();
                String word2 = wordb.toLowerCase();

            int result;
            result = word1.compareTo(word2);

            if (result<0) {
                System.out.println("Answer: " + worda + " comes before "+ wordb +" alphabetically.");}
            else if (result>0){
                System.out.println("Answer: " + wordb + " comes before "+ worda +" alphabetically.");}
            else{
                System.out.println("Answer: Chicken or Egg.");}
        }
    }
            else{System.out.println("Invalid input entered. Terminating...");
                  }

                  break;

            default:
            System.out.println("Invalid input entered. Terminating...");
            
        }
      }  
}





