
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int tar = target;
        int interval = 1;
        int[] answer = new int[2];
        for (int i = 0; i < length - 1; i++){
            for (int j = interval; j < length; j++){
                if (i!=j){
                    if (nums[i] + nums[j] == tar){     
                      Arrays.fill(answer, 0,1, i);
                      Arrays.fill(answer, 1,2, j);
                      return answer;
                   }
 
                }

               }
           }
        return answer;
        }
    

    }