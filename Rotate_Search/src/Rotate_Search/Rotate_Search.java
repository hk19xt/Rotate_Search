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
            int middlePosition = (initialPosition + lastPosition)/2;
            //Case 2
            if(inputs[initialPosition]<=inputs[middlePosition]){
//                if(target>inputs[middlePosition]&&target<=inputs[lastPosition]){
//                    initialPosition = middlePosition+1;
//                }
                if(target>=inputs[initialPosition] && target<inputs[middlePosition]){
                    lastPosition = middlePosition-1;
                }else{
                    initialPosition = middlePosition+1;
                }
            }
            //Case 1
            if(inputs[middlePosition]==target){
                return target;
            }
            //Case 3
            if(inputs[middlePosition]<=inputs[lastPosition]){
//                if(target<inputs[middlePosition]&&target>=inputs[lastPosition]){
//                    lastPosition = middlePosition-1;
//                }

                if(target>inputs[middlePosition]&&target<=inputs[lastPosition]){
                    initialPosition = middlePosition+1;
                }else{
                    lastPosition = middlePosition-1;
                }
            }

        }
        return -1;
    }
}
