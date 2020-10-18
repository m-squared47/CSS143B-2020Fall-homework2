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
        int search;                                 //search value
        int[] removed = new int[nums.length];       //array of non duplicates
        int index = 1;                              //index of removed[]

        removed[0] = nums[0];               //assuming the array is sorted, first element is the first value
        search = nums[0];

        for(int value : nums){              //for every element in nums
            if(search < value){             //if the search value is less than the array element
                removed[index] = value;     //store the array element at index
                search = value;             //store the array element into the search value
                index++;                    //increment index by 1
            }
        }

        int[] remove_cut = new int[index];          //removed[] with no empty spaces

        for(int i = 0; i < remove_cut.length; i++){     //translate removed[] to remove_cut[]
            remove_cut[i] = removed[i];
        }

        nums = remove_cut;      //remove_cut[] stored in nums[]

        return nums.length;     //return length of array
    }
}
