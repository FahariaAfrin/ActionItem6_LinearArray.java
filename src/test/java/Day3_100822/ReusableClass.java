package Day3_100822;

public class ReusableClass {

    //create a void method that will add two numbers and execute the print
    public static void addTwoNumbers(int a, int b){
        int result = a+b;
        System.out.println("The result is " + result);
    }//end of addTwoNumbers

     //create a return method that will add tw numbers and return the values from the print statement
    public static int returnTwoAddNumbers(int a, int b){
        int result = a+b;
        System.out.println("The return result is" + result);
        return result;
    }//end of returnTwoAddNumbers

}//end of java class
