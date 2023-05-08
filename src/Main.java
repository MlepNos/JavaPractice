// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



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














}
