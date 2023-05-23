// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {


        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());



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
            return java.lang.Math.PI * java.lang.Math.pow(radius,2);
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

public static boolean isOdd(int number){
    if(number<0){
        return false;
    }else if(number % 2 !=0){
        return true;
    }else{
        return false;
    }
}

public static int sumOdd(int start, int end){
    if(end < start || start<=0 || end <=0){

        return -1;
    }
    int sum=0;
    for(int a = start; a <= end; a++){
        if(isOdd(a)){
            //System.out.println("odd number: " + a);
            sum += a;
        }
    }
    return sum;
}

/*  9_Number Palindrome
Write a method called isPalindrome with one int parameter called number.The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false. Check the tips below for more info about palindromes.
Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

Tip: Logic to check a palindrome number
Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.

Tip: Be careful with negative numbers. They can also be palindrome numbers.*/


public static boolean isPalindrome(int number){
    String NumString = Integer.toString(number);
    NumString= NumString.replaceAll("[^0-9]", "");
    int[] array = new int[NumString.length()+1];
    int[] arrayReverse = new int[NumString.length()+1];
    for(int b=0 ; b<NumString.length();b++){
        array[b]= NumString.charAt(b) -48;
    }
    for(int b=0 ; b<NumString.length();b++){
        arrayReverse[b]= array[NumString.length()-b-1];
    }
    for(int b=0 ; b<NumString.length();b++){
        if(arrayReverse[b]!= array[b]){
            return false;
        };
    }

    return true;
}

/*  10_First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.

Example input/output
sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
*/

public static int sumFirstAndLastDigit(int number){
    if(number <0){
        return -1;
    }
    int firstDigit=0;
    int LastDigit = number % 10;
    while(number!=0) {
        firstDigit = number%10;
        number /= 10;
    }

    return firstDigit+LastDigit;
}


/* 11_Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.

EXAMPLE INPUT/OUTPUT:
getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
getEvenDigitSum(-22); → should return -1 since the number is negative */


public static int getEvenDigitSum(int number){
    if(number <0){
        return -1;
    }
    int mod=0;
    int counter = 0;
    int sum=0;
    while(number > 0)
    {
        mod = number % 10;
        if(mod %2==0){
            sum+= mod;
        }
        number = number / 10;
        counter++;
    }
    return sum;
}

/*  12_Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers */


public static int[] intoArray(int num){
    int mod=0;
    int counter = 0;
    int[] FirstArray = new int[2];
    while(num > 0)
    {
        mod = num % 10;
        FirstArray[counter]= mod;
        num = num / 10;
        counter++;
    }
    return FirstArray;
}

    public static boolean hasSharedDigit(int a, int b){
        if(a<10 || a >99 || b<10 || b>99){
        return false;
    }
        int[] FirstArray = new int[2];
        FirstArray= intoArray(a);
        int[] SecondArray = new int[2];
        SecondArray= intoArray(b);

    for(int i =0;i<=1;i++){
       for(int y =0;y<=1;y++) {
            if(FirstArray[i]== SecondArray[y]){
                return true;
            }
       }
    }
    return false;
    }


    /* 13_Last Digit Checker
    Write a method named hasSameLastDigit with three parameters of type int.
    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

    EXAMPLE INPUT/OUTPUT:
    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

    Write another method named isValid with one parameter of type int.
    The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

    EXAMPLE INPUT/OUTPUT
    isValid(10); → should return true since 10 is within the range of 10-1000
    isValid(468); → should return true since 468 is within the range of 10-1000
    isValid(1051); → should return false since 1051 is not within the range of 10-1000
   */

    public static boolean hasSameLastDigit(int a, int b , int c){
        if(!isValid(a) || !isValid(a) || !isValid(b))
        {
            return false;
        }

        Vector<Integer> Intvector= new Vector<>();
        Intvector= IntoVector(a);
        int LastDigitA =Intvector.get(1);

        Vector<Integer> Intvector2= new Vector<>();
        Intvector2= IntoVector(b);
        int LastDigitB =Intvector2.get(1);

        Vector<Integer> Intvector3= new Vector<>();
        Intvector3= IntoVector(c);
        int LastDigitC =Intvector3.get(1);

        if(LastDigitA == LastDigitB || LastDigitA == LastDigitC || LastDigitB == LastDigitC)
        {
            return false;
        }
        //System.out.println(Intvector.get(1));
        return true;
    }
    public static boolean isValid(int num){
        if(num > 1000 || num < 10){
            return false;
        }
        return true;
    }

    public static Vector<Integer> IntoVector(int num){
        int mod=0;
        int counter = 0;
        Vector<Integer> Intvector= new Vector<>();
        while(num > 0)
        {
            mod = num % 10;
            Intvector.add(mod);
            num = num / 10;
            counter++;
        }

        return Intvector;
    }

/* 14_All Factors
Write a method named printFactors with one parameter of type int named number. If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

EXAMPLE INPUT/OUTPUT:
printFactors(6); → should print 1 2 3 6
printFactors(32); → should print 1 2 4 8 16 32
printFactors(10); → should print 1 2 5 10
printFactors(-1); → should print "Invalid Value" since number is < 1

For example, the printout for printFactors(10); can be:
1 2 5 10 */

public static void printFactors(int number){
    Vector<Integer> Intvector= new Vector<>();
    if(number < 1){
        System.out.println("Invalid Value");
    }
    for(int i=1; i<=number ;i++){
      if(number % i == 0){
          Intvector.add(i);
      }
    }
   System.out.println(Intvector);
}




/* 15_Greatest Common Divisor
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

EXAMPLE INPUT/OUTPUT:
getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

*/

public static int getGreatestCommonDivisor(int first, int second){

    if(first <10 || second < 10 ){
        return -1;
    }

    int Less = (first == second) ||(first < second) ? first : second;
    while(Less >0){

        if(first % Less == 0 && second % Less ==0){
            return Less;
        }
        Less--;
    }

  return -1;
}

/*  16_Perfect Number
What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
Therefore, 6 is a perfect number (as well as the first perfect number).
Write a method named isPerfectNumber with one parameter of type int named number.
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.

EXAMPLE INPUT/OUTPUT:
isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
isPerfectNumber(-1); should return false since the number is < 1    */

    public static boolean isPerfectNumber(int number){
        Vector<Integer> Intvector= new Vector<>();
        if(number <1 ){
            return false;
        }
        int counter = number -1;
        while(counter >0){
            if(number % counter== 0){
                Intvector.add(counter);
            }
                counter--;
        }
        int sum =0;
        for(int i=0;i< Intvector.size(); i++){
            sum += Intvector.get(i);
        }
        if(sum == number){
            return true;
        }
        return false;
    }


/* 17_Number To Words
Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
Extract the last digit of the given number using the remainder operator.
Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
Remove the last digit from the number.Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order. For example,
if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432.
The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero".
To solve this problem, write a third method called getDigitCount.
The method getDigitCount should have one int parameter called number and return the count of the digits in that number.
 If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method
getDigitCount(0); should return 1 since there is only 1 digit
getDigitCount(123); should return 3
getDigitCount(-12); should return -1 since the parameter is negative
getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method
reverse(-121); should  return -121
reverse(1212); should return  2121
reverse(1234); should return 4321
reverse(100); should return 1

Example Input/Output - numberToWords method
numberToWords(123); should print "One Two Three".
numberToWords(1010); should print "One Zero One Zero".
numberToWords(1000); should print "One Zero Zero Zero".
numberToWords(-12); should print "Invalid Value" since the parameter is negative.

HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print
"One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
One
Two
Three
They don't have to be separated by a space.*/

    public static int getDigitCount(int number){
       if(number <0) {
           return -1;
       }
       int mod=0;
       int counter = 0;
       while(number > 0)
       {
            mod = number % 10;
            number = number / 10;
            counter++;
       }
       return counter;
    }
    public static int reverse(int number){
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }


    public static void  numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);


        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverse % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverse /= 10;
        }
        System.out.println();
    }


/* 18_Largest Prime
Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.

EXAMPLE INPUT/OUTPUT:
getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
getLargestPrime (0); should return -1 since 0 does not have any prime numbers
getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
getLargestPrime (-1); should return -1 since the parameter is negative

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers. */


public static int getLargestPrime(int number){
    int counter = number ;
    int largestPrime=0;
    if (number <= 0) {
       return -1;
    }
    while(counter>1){
        if(number % counter ==0 && isPrime(counter)){
            return counter;
        }
        counter--;
    }

  return -1;
}

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= java.lang.Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /* 19_Diagonal Star
Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

EXAMPLE INPUT/OUTPUT:
EXAMPLE 1
printSquareStar(5); should print the following:
*****
** **
* * *
** **
*****

Explanation:
*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2
printSquareStar(8); should print the following:
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********

The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
In the first or last row
In the first or last column
When the row number equals the column number
When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.
HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); */

public static void printSquareStar(int number){
    if (number < 5) {
        System.out.println("Invalid Value");
    }else{
        for(int row=0;row < number;row++){
            for(int column=0;column<number;column++){

                if(column==0 || column == number-1 || row==0 || row==number-1 || column==row  || row== number-1-column ){

                    System.out.print("*");
                }else{
                    System.out.print(" ");    // r 1 c 3       r 3  c 1
                }
            }
            System.out.println();
        }
    }
}
/*
20_
    In this challenge, you'll read 5 valid numbers from the console, entered by the user, and print the sum of those five numbers.
    You'll want to check that the numbers entered, are valid integers.
    If not,  print out the message "Invalid number" to the console, but continue looping, until you do have 5 valid numbers.
    Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count, 1, 2, 3, etc.
    And as an example there, the first message would look something like,"Enter number #1:", the next, "Enter number #2:", and so on.*/

    /*
    Scanner scanner = new Scanner(System.in);
    int sum=0;
    int counter=1;
        while(counter<=5){
        System.out.println("Enter Number: "+ counter);
        String Stringnumber = scanner.nextLine();
        try{
            int number = Integer.parseInt(Stringnumber);
            sum += number;
            counter++;
        }catch (NumberFormatException nfe){
            System.out.println("Invalid Number");
        }
    };
        System.out.println("The Sum of the Numbers is: "+ sum);

    */

    /* 21
    You'll be using an endless loop which:
    Prompts the user to enter a number, or any character to quit.
    Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
    If the user-entered data is not a number, quit the loop.
    Keep track of the minimum number entered.
    Keep track of the maximum number entered.
    If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.

     */
     /*
    boolean isValid=true;
    int min = 0;
    int max = 0;
    Scanner scanner = new Scanner(System.in);
        while(isValid){

        String Stringnumber = scanner.nextLine();
        try{
            int number = Integer.parseInt(Stringnumber);
            if(number >= max){
                max = number;
            }else if(number <= min){
                min = number;
            }
        }catch(NumberFormatException nfe){
            isValid=false;
        }
    }
        System.out.println("The Max Number is : "+ max);
        System.out.println("The Min Number is : "+ min);

    */

/* 22_Input Calculator
Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

EXAMPLES OF INPUT/OUTPUT:
EXAMPLE 1:
INPUT:
1
2
3
4
5
a
OUTPUT
SUM = 15 AVG = 3

TIP: Use Scanner to read an input from the user.
TIP: Use casting when calling the round method since it needs double as a parameter.
NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.*/

public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);
    int sum=0;
    double count=0;
    boolean isValid=true;
    while(isValid){
        String StringNumber = scanner.nextLine();

        try{
             sum += Double.parseDouble(StringNumber);
             count++;

        }catch(NumberFormatException nfe){
            isValid=false;
        }
    }
    System.out.println("SUM = " + java.lang.Math.round(sum) + " AVG = " + java.lang.Math.round((double) sum/count));
    System.out.println("SUM = " + sum + " AVG = " +  sum/count);
    //scanner.close();   -2.5 --> -2

}
/////////////////////////          OOP           /////////////////////////




/* 1_Classes Challange  (Account Class)
Create a new class for a bank account.
Create fields for account characteristics like:
-account number
-account balance
-customer name
-email
-phone number

Create getters and setters for each field.
Create two additional methods:
-one for depositing funds into the account
-one for withdrawing funds from the account

A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
You'll create an instance of an Account class, and then test your withdraw and deposit methods.
You'll print information to the console, that confirms what the balance is after the methods are called.

Main CODE:

  Account account = new Account();

        account.setBalance(10000);
        System.out.println(account.getBalance());

        account.DepositInto(400);
        account.Withdraw(20000);
        account.Withdraw(200);
        account.Withdraw(200.5543);

 */

/* 2_Sum Calculator

Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber
both of type double.
Write the following methods (instance methods):
-Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
-Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
-Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
-Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
-Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
-Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
-Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
-Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

TEST EXAMPLE
TEST CODE:
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
OUTPUT:

add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0

    /* 3_Person
Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
-Method named getFirstName without any parameters, it needs to return the value of the firstName field.
-Method named getLastName without any parameters, it needs to return the value of the lastName field.
-Method named getAge without any parameters, it needs to return the value of the age field.
-Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
-Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
-Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
Method named getFullName without any parameters, it needs to return the full name of the person.

In case both firstName and lastName fields are empty, Strings return an empty String.
In case lastName is an empty String, return firstName.
In case firstName is an empty String, return lastName.

To check if s String is empty, use the method isEmpty from the String class. For example,firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.



TEST EXAMPLE

TEST CODE:

Person person = new Person();
person.setFirstName("");   // firstName is set to empty string
person.setLastName("");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());

OUTPUT:
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith   */

/*   4_ Consturctor Challange
1.Create a new class, called Customer, with three fields:
-name
-credit limit
-email address.
2.Create the getter methods only, for each field.  You don't need to create the setters.
3.Create three constructors for this class:
-First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
-Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
-And lastly, create a constructor with just the name and email parameters, which also calls another constructor.

Main Code:
Customer Firstcustomer = new Customer();
        System.out.println(Firstcustomer.getName());
        System.out.println(Firstcustomer.getCreditLimit());
        System.out.println(Firstcustomer.getEmail());

        Customer Secondcustomer = new Customer("bob",2100,"upsups@");
        System.out.println(Secondcustomer.getName());
        System.out.println(Secondcustomer.getCreditLimit());
        System.out.println(Secondcustomer.getEmail());

        Customer Thirdcustomer = new Customer("bob","upsups@");
        System.out.println(Thirdcustomer.getName());
        System.out.println(Thirdcustomer.getCreditLimit());
        System.out.println(Thirdcustomer.getEmail());

/*  5_Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters width and height of type double and it needs to initialize the fields.
In case the width is less than 0 it needs to set the width field value to 0,
in case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
+Method named getWidth without any parameters, it needs to return the value of width field.
+Method named getHeight without any parameters, it needs to return the value of height field.
+Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
+Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
+Method named getArea without any parameters, it needs to return the area of the wall.

TEST EXAMPLE
→ TEST CODE:

 Wall wall = new Wall(5,4);
 System.out.println("area= " + wall.getArea());
 wall.setHeight(-1.5);
 System.out.println("width= " + wall.getWidth());
 System.out.println("height= " + wall.getHeight());
 System.out.println("area= " + wall.getArea());

→ OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0
*/

/*

6_Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
+Method named getX without any parameters, it needs to return the value of x field.
+Method named getY without any parameters, it needs to return the value of y field.
+Method named setX with one parameter of type int, it needs to set the value of the x field.
+Method named setY with one parameter of type int, it needs to set the value of the y field.
+Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
+Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
+Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

How to find the distance between two points?
To find a distance between points this A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.

TEST EXAMPLE
→ TEST CODE:

Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());

OUTPUT:
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: In total, you have to write 7 methods.



/*  7_Carpet Cost Calculator
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
To cover the floor with a carpet that costs $8 per square meter would cost $960.

1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0,
in case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
+Method named getArea without any parameters, it needs to return the calculated area (width * length).

2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.
Write the following methods (instance methods):
+Method named getCost without any parameters, it needs to return the value of cost field

3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
Write the following methods (instance methods):
-Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.

TEST EXAMPLE
→ TEST CODE:

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

→ OUTPUT:
total= 38.5
total= 36.45

 /*  8_Complex Operations
A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
and i is a solution of the equation x² = −1. Because no real number satisfies this equation, i is called an imaginary number.
For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers,
just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another,
the sum of 3 + i and –1 + 2i is 2 + 3i.

Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double.
It represents the Complex Number.
The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.

Write the following methods (instance methods):
+Method named getReal without any parameters, it needs to return the value of real field.
+Method named getImaginary without any parameters, it needs to return the value of imaginary field.
-Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
-Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
-Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
-Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.

TEST EXAMPLE
→ TEST CODE:

ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1,1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());


→ OUTPUT:

one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0 */
























}
