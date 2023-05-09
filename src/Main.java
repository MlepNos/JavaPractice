// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SumFunction();
    }









        /* 1_Area Calculator
Write a method named area with one double parameter named radius.The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
For formulas and PI value please check the tips below.
*/
        public static double area(double radius){
            if(radius < 0){
                return -1;
            }
            return Math.PI * Math.pow(radius,2);
        }
        public static double area(double x,double y){
            if(x<0 || y<0){
                return -1;
            }
            return x*y;
        }


        /* 2_Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.The method should not return anything ,and
it needs to calculate the years and days from the minutes parameter.If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

EXAMPLES OF INPUT/OUTPUT:
printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
1 hour = 60 minutes
1 day = 24 hours
1 year = 365 days

*/

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365;
        long DD = day % 365;

        System.out.println(minutes + " min = " + year +" y and "+ DD +" d");}
    }
/* 3_Equality Printer
    Write a method printEqual with 3 parameters of type int. The method should not return anything .
    If one of the parameters is less than 0, print text "Invalid Value".If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different". Otherwise, print "Neither all are equal or different".

    EXAMPLES OF INPUT/OUTPUT:
    printEqual(1, 1, 1); should print text All numbers are equal
    printEqual(1, 1, 2); should print text Neither all are equal or different
    printEqual(-1, -1, -1); should print text Invalid Value
    printEqual(1, 2, 3); should print text All numbers are different
*/
public static void printEqual(int a, int b, int c){
    if(a<0 || b<0 || c<0){
        System.out.println("Invalid Value");
    }else if(a==b && b==c){
        System.out.println("All numbers are equal");
    }else if(a != b && a != c && b != c){
        System.out.println("All numbers are different");
    }else{
        System.out.println("Neither all are equal or different");
    }
}

/* 4_Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.Write a method isCatPlaying that has 2 parameters.
Method needs to return true if the cat is playing, otherwise return false
1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.

EXAMPLES OF INPUT/OUTPUT:
isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
isCatPlaying(false, 35); should return true since temperature is in range 25 - 35  */

public static boolean isCatPlaying(boolean summer, int temperature){
    if(summer && temperature <= 45 && temperature >=25){
        return true;
    }else if(!summer && temperature <= 35 && temperature >=25){
        return true;
    }else {
        return false;
    }

}

    /* 5_Number In Word
    Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
    for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.


*/

public static void printNumberInWord(int number){
    switch (number){
        case 1 -> System.out.println("ONE");
        case 2 -> System.out.println("TWO");
        case 3 -> System.out.println("THREE");
        case 4 -> System.out.println("FOUR");
        case 5 -> System.out.println("FIVE");
        case 6 -> System.out.println("SIX");
        case 7 -> System.out.println("SEVEN");
        case 8 -> System.out.println("EIGHT");
        case 9 -> System.out.println("NINE");
        default ->System.out.println("OTHER");
    }
}   //ALTERNATIVE
    public static void printNumberInWordAlt (int num)  {
        String[] array = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(num>=0 && num<=9){
            System.out.println(array[num]);
        } else {
            System.out.println("other");
        }
    }

/* 6_ Number Of Days In Month
Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:
isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
isLeapYear(1600); → should return true since 1600 is a leap year
isLeapYear(2017); → should return false since 2017 is not a leap year
isLeapYear(2000); → should return true because 2000 is a leap year

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:
getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999. */

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999 ){
           return false;
        }else if((year % 100 ==0 && year % 400 ==0) || (year % 4 ==0 && year % 100 !=0 )  ){
            return true;
        } else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year ) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        // Traditional Switch-Case
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return -1;
        }
    }

/* 7_ Sum 3 and 5 Challenge
=====================
Create a for loop using a range of numbers from 1 to 1000 inclusive.Sum all the numbers that can be divided by both 3 and 5
Print out the numbers that have met the above conditions.break out of the loop once you have found 5 numbers that met the conditions.
After breaking out of the loop, print the sum of the numbers that met the conditions.*/
    public static void SumFunction(){

        int counter = 0;
        int sum = 0;
        for (int a = 1; a <= 1000; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Found a match: " + a);
                sum += a;
                counter += 1;
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of the matches " +sum);
    }


/* 8_ Sum Odd
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.Check that number is > 0, if it is not return false.
If number is odd return true, otherwise return false.Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.

Example input/output:
sumOdd(1, 100); → should return 2500
sumOdd(-1, 100); → should return -1
sumOdd(100, 100); → should return 0
sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
sumOdd(100, -100); → should return -1
sumOdd(100, 1000); → should return 247500 */
















}
