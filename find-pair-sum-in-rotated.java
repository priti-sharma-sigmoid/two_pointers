/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    Where N is the number of elements in array
https://www.codingninjas.com/codestudio/problems/find-pair-sum-in-rotated-and-sorted-array_985350?leftPanelTab=0
*/
import java.util.HashMap;

public class Solution 
{
	public static boolean findPairSum(int[] arr, int target) 
    {
		int n = arr.length;

		// Using HashMap to store already encountered number
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) 
        {
			int req = target - arr[i];
			if (map.containsKey(req)) 
            {
				return true;
			}
			map.put(arr[i], 1);
		}
		return false;
	}

}
