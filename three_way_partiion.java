/*
    Time Complexity  : O(N)
    Space Complexity : O(1)

    Where N is the length of the given array.
    https://www.codingninjas.com/codestudio/problems/three-way-partition_1170519?leftPanelTab=0
*/

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> arr, int n, int a, int b) {

        int low = 0, high = n - 1;
        int index = 0;

        // Traverse all elements of array
        while (index <= high) {

            // Place elements less than a to front
            if (arr.get(index) < a) {
                int temp = arr.get(index);
                arr.set(index, arr.get(low));
                arr.set(low, temp);

                index++;
                low++;
            }

            // Place elements greater than b to back
            else if (arr.get(index) > b) {
                int temp = arr.get(index);
                arr.set(index, arr.get(high));
                arr.set(high, temp);
                high--;
            }

            else {
                index++;
            }
        }

        return arr;

    }

}
