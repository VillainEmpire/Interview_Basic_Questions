class Solution {
    public void rotate(int[] nums, int k) {
        // if the rotation of array is  greater than the length of the array 
        // then we have to calculate the modulo of the array.
        k = k%nums.length;

        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }
    static void rotateArray(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}