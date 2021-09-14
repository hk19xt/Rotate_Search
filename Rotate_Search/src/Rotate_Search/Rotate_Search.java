package Rotate_Search;

/*This class is the implementation class to find the minimum value in the array.
* This implementation will be using the binary search by sorted array.
* The input values and the target value are inserted by users in the main class. */

public class Rotate_Search {
    public int calculation(int[] inputs, int target){
        int initialPosition = 0;
        int lastPosition = inputs.length - 1;

        //In order to find the minimum value, we should consider the five cases in total.
        while(initialPosition<=lastPosition){
            int middlePosition =  (initialPosition + lastPosition)/2;
            //Case 1: when the first element is smaller than the middle value
            if(inputs[initialPosition]<=inputs[middlePosition]){

                if(target>=inputs[initialPosition] && target<inputs[middlePosition]){
                    lastPosition = middlePosition-1;
                }

                if(target<inputs[initialPosition] || target>=inputs[middlePosition]){
                    initialPosition = middlePosition+1;
                }
            }
            //Case 2 : when the middle value meets the target value, 
            // then we will finally return the target value (our goal).
            if(inputs[middlePosition]==target){
                return target;
            }
            //Case 3 : when the middle value is smaller than the last element
            if(inputs[middlePosition]<=inputs[lastPosition]){

                if(target>inputs[middlePosition]&&target<=inputs[lastPosition]){
                    initialPosition = middlePosition+1;
                }
                if(target<=inputs[middlePosition]||target>inputs[lastPosition]){
                    lastPosition = middlePosition-1;
                }
            }

        }
        return -1; //If there is no elements in the input number array, then return -1.
    }
}
