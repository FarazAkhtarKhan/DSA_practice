package hashing;
import java.util.*;
public class FrequentElement {
    public int queryArray(int[] nums){
        int maxElement = nums[0];
        for(int num : nums){
            if(num > maxElement) maxElement = num;
        }
        int hash[] = new int[maxElement+1];
        for(int i = 0; i < nums.length;i++){
            hash[nums[i]]+=1;
        }

        int maxFrequency = hash[0];
        int count = 0;
        for(int i = 0; i < hash.length;i++){
            if (hash[i] > maxFrequency) {
                maxFrequency = hash[i];
                count = i;
            }
        }
        return count;
    }
    public int mostFrequentElement(int[] nums) {
        //Using Hashmap

        HashMap<Integer,Integer> ele_freq = new HashMap<Integer, Integer>();
        int maxCount = 0;
        int maxElement = nums[0];
        for(int num : nums){
            //this check if number exists if not put it to zero, if its there increment the value to 1
            int currentCount = ele_freq.getOrDefault(num,0) + 1;
            ele_freq.put(num, currentCount);
            if(currentCount > maxCount){
                maxCount = currentCount;
                maxElement = num;
            }
        }
        return maxElement;
    }
}
