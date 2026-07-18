package hashing;
import java.util.ArrayList;
import java.util.List;

public class CountingFrequencies {
    public List<List<Integer>> countFrequencies(int[] nums) {
        int max = nums[0];
        for(int num : nums){
            if (num > max)
                max = num;
        }
        int hash[] = new int[max+1];
        for(int i=0; i< nums.length;i++){
            hash[nums[i]] +=1;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< hash.length; i++){
            if(hash[i] > 0){
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(hash[i]);

                result.add(pair);
            }
        }
        return result;
    }

}
