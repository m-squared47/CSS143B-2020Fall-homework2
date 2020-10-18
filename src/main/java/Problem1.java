public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The test will go through the array looking for numbers 0-2. If an element matches, then the first non-modified
    element will be swapped with the match. This sort doesn't check until the array is sorted, but goes until the
    number limit is reached. This is like selection sort but this sort checks for matches only between
    0-2. Because of this, this method is a situational use case. 
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int index = 0;                              //holds the index of the array as it scans through

        for(int i = 0; i <= 2; i++){                //run for numbers 0-2
            for(int f = 0; f < nums.length; f++){   //for every element in nums
                if(i == nums[f]){
                    int hold = nums[index];         //hold the value at first most element
                    nums[index] = i;                //swap the positions
                    nums[f] = hold;
                    index++;                        //increment the index by 1
                }
            }
        }
    }
}
