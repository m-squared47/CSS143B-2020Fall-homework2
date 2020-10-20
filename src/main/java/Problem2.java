public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Assuming the input array is sorted, the first value of the input array is stored and used to search for new values.
    As the for loop continues through the array, it checks if the search value (next lowest value) is less than another
    element in the input array. That value is stored and is changed to the new search value and the loop continues. The
    array is then translated and cut to size and stored back to nums[].
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int[] hold = nums;          //temporary array
        int search = hold[0];       //search value
        int size;                   //size of new array
        int[] newNums;              //new array
        int index = 0;

        if(hold.length > 0){        //if input array is not empty
            size = 1;
        }else{                      //if input array is empty
            size = 0;               //new array has no elements
        }

        //find and ignore duplicates
        for(int i = 0; i < hold.length && size != 0; i++){  //for every element in the input array
            if(search < hold[i]){                           //if the next value is more than the search value
                size++;                                     //new array size +1
                search = hold[i];                           //new search value is the greater value
            }
        }

        newNums = new int[size];    //define the new array
        search = hold[0];

        for(int i = 0; i < hold.length && size != 0; i++){  //for every element in the input array
            if(search < hold[i]){                           //if the next value is more than the search value
                newNums[index] = search;                    //put search value into the index specified
                search = hold[i];                           //search value is now the greater value
                index++;                                    //increment index by 1
            }

            if(i == hold.length - 1){
                newNums[index] = hold[i];
            }
        }


        //copy newNums[] to nums
        for(int i = 0; i < newNums.length; i++){            //for every element in the copy array
            nums[i] = newNums[i];                           //copy to nums[]
        }

        return size;     //return the length of nums[]
    }
}
