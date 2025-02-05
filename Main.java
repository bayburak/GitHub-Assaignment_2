import java.util.Scanner;
import java.util.Random;

public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static int[] list;


    // Creates the array and fills it with random integers from 0 to 100
    public static void initializeProgram(){
        System.out.print("Please enter the array size: ");
        int arraySize = sc.nextInt();
        list = new int[arraySize];

        Random random = new Random();
        for(int i = 0; i< list.length; i++){
            list[i] = random.nextInt( 101);
        }
    }

    //prints out the menu
    public static void printMenu(){
        System.out.println();
        System.out.println("1- Find the maximum");
        System.out.println("2- Find the minimum");
        System.out.println("3- Display how much each elementof the array differs from the avarage ");
        System.out.println("4- Find the sum of the elements with odd and even numbered indexes");
        System.out.println("5- Exit");
        
    }
    
    // Handles teh user input 
    public static void run(){

        int choice;
        do {
            printMenu();
            System.out.print("Enter which operation you would like to do:");
            choice = sc.nextInt();
        

            switch(choice){
                case 1:
                    findMax();
                    break;
                case 2:
                    findMin();
                    break;
                case 3:
                    differenceFromAvarage(list);
                    break;
                case 4:
                    sumOfOddandEvenElements();
                    break;
            

            }

            
        } while (choice != 5);
        
    }

    //Finds teh maximum value throughout the array
    public static void findMax(){
        int max = 0;

        for (int h = 0; h < list.length; h++) {
            if (list[h] > max) {
                max = list[h];
            }
        }

    System.out.println(max);
    }

    //Finds the minimum value throughout the array
    public static void findMin(){
        int min = 100;

        for (int k = 0; k < list.length; k++) {
            if (list[k] < min) {
                min = list[k];
            }
        }
        
    System.out.println(min);

    }

    //Finds the avarage of the array and displays how much each element differs from the avarage
    public static void differenceFromAvarage(int [] list){
        int size;
        double sumOfArray;
        double avarage;
        size = list.length;
        sumOfArray = 0;
        for (int i : list) 
        {
            sumOfArray += i;
        }
        avarage = sumOfArray/size;
        System.out.printf("The average is %3.2f %n", avarage);
        for (int i : list) 
        {
            double diff = i - avarage;
            System.out.printf("%3.2f ", diff);
        }
        System.out.println();
    }

    //Calcuates the sum of od and even indexed elements
    public static void sumOfOddandEvenElements(){
        int sumOfOdd = 0;
        int sumOfEven = 0;
        int l = list.length;
        for ( int i = 0; i < l-1; i+=2){
        sumOfEven += list[i];
        sumOfOdd += list[i+1];
        }
        if (l % 2 == 0){
            sumOfEven += list[l-2];
            sumOfOdd += list[l-1];
        }
        else{
            sumOfEven += list[l-1];
        }
        System.out.print("Sum of odd indexes: " + sumOfOdd + "\nSum of even indexes: " + sumOfEven);
    }

    public static void main(String[] args) {
        
        initializeProgram();
        run();
        

    }

}
