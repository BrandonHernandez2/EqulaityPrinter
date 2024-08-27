public class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    private static void printEqual(int num1, int num2, int num3) {
        //TODO: Check if num1 <0, num2 < 0, and/or num3 <0

        if (num1 < 0 && num2 < 0 && num3 < 0){
            System.out.println("Invalid Value.");
        }

        //TODO: Check if num1 == num2 and num2 == num3

        else if ( num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal.");
        }

        //TODO: Check if num1 != num2 and num1 != num3

        else if (num1 != num2 && num1 != num3){
            System.out.println("All numbers are different.");
        }

        //TODO: done all of the checks so Neither all are equal or different.

        else{
            System.out.println("Neither all are equal or different.");
        }
    }


}