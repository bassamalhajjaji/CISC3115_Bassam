import java.util.Scanner;

public class ImmutableObject {
    public static void main(String[] args) {
        float fahrenheit, centigrade;

        
        fahrenheit = 98.6f;

        
        centigrade = (5.0f / 9.0f) * (fahrenheit - 32);

        
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Centigrade: " + centigrade);

        
        System.out.println("Centigrade values:");
        for (float i = 0.0f; i <= 40.0f; i += 4.0f) {
            float celsius = (5.0f / 9.0f) * (i - 32);
            System.out.println(i + " Fahrenheit is " + celsius + " Centigrade");
        }

        
        Scanner scanner = new Scanner(System.in);

        
        String isin;
        String inputWords;

        while (true) {
            System.out.print("Enter a word: ");
            inputWords = scanner.nextLine();

            
            if (inputWords.equalsIgnoreCase("STOP")) {
                StopChecking();
                break;
            } else {
                
                String[][] myArray = {
                    {"BMW", "Ferrari", "Lambo"},
                    {"pizza", "burger", "dumpling"}
                };

                boolean found = false;

               
                for (String[] array : myArray) {
                    for (String item : array) {
                        if (item.equalsIgnoreCase(inputWords)) {
                            found = true;
                            break;
                        }
                    }
                }

                
                if (found) {
                    System.out.println("Input word is in the 2D array.");
                } else {
                    System.out.println("Input word is not in the 2D array.");
                }
            }
        }

        
        scanner.close();
    }

    
    public static void StopChecking() {
        System.out.println("Program terminated.");
    }
}
