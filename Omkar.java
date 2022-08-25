import java.util.*;

public class Omkar {
    public static int averageOfNumbers(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    // Write a function to print the sum of all odd numbers from 1 to n.

    public static int sumOfOdd(int a){
        int sum = 0;
        for(int i=0; i<=a; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum; 
    }

    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greatrOfTwo(int a, int b) {
        if (a>b){
            System.out.println("greater number is: " + a);
        } else if (b>a) {
            System.out.println("greater number is: "+ b);
        } 
    }   

    // Write a function that takes in the radius as input and returns the circumference of a circle.

    public static double circumferenceOfCircle(double a){
        double coc = 2 * 3.14 * a;
        return coc;
    }

    public static void ageOfPerson(int a){
        if (a>=18){
            System.out.println("can vote");
        } else {
            System.out.println("cannot vote");
        }
        
    }
    public static void main(String[] args) {

        // Write a program to enter the numbers till the user wants and at the end 
        // it should display the count of positive, negative and zeros entered. 

        Scanner sc = new Scanner(System.in);
        

        System.out.println("how many numbers you want to enter: ");
        int numInput = sc.nextInt();
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 1; i<= numInput; i++){

            System.out.println("Enter number: ");
            int num = sc.nextInt();            
    
            if (num>0) {
                positiveCount += 1;
            } else if (num<0) {
                negativeCount += 1;
            } else{
                zeroCount += 1;
            }
        }
        System.out.println("positive count is:" + positiveCount + " negative count is: " + negativeCount + " zero count is: " +zeroCount);



        // Write an infinite loop using do while condition.
        // int i=0;
        // do {
        //     System.out.println("omkar");
        // } while(i<1);{
        //     System.out.println("patole");
        //     i++;
        // }
        
        // ageOfPerson(19);

        // double ans = circumferenceOfCircle(2);
        // System.out.println(ans);


        // greatrOfTwo(5, 2);
        

        // int ans = sumOfOdd(5);
        // System.out.println(ans);
        
        // Enter 3 numbers from the user & make a function to print their average.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter num: ");
        // int a = sc.nextInt();

        // System.out.print("Enter num: ");
        // int b = sc.nextInt();
        
        // System.out.print("Enter num: ");
        // int c = sc.nextInt();

        // int avg = averageOfNumbers(a, b, c);
        // System.out.println(avg);

    }
}
