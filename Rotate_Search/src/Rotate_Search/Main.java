package Rotate_Search;

public class Main {
    public static void main(String[] args){

        int[] userInputs = {4,5,6,7,0,1,2}; // User can change the input values here.
        int target = 0; // User can change the target value here.
        Rotate_Search RS = new Rotate_Search();
        int output = 0;
        output = RS.calculation(userInputs, target);
        System.out.println("The output minimum value is: " + output);

    }
}
