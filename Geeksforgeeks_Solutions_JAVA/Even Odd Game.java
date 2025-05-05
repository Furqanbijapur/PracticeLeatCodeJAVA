//User function Template for Java

public static void utility(int number){

    //write your code here
    if(number >= 1 && number <=100) {
        if(number % 2 == 0) {
            System.out.print("Friend");
        } else if(number % 2 !=0) {
            System.out.print("You");
        }
    }
}