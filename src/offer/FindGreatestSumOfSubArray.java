package offer;

public class FindGreatestSumOfSubArray {
	public static int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
        	sum = sum + array[i];
        	if(sum>max)
        		max = sum;
        	if(sum<0)
        		sum = 0;
        }
        
        return max;
    }
public static void main(String[] args) {
	int[] array = {2,8,1,5,9};
	System.out.println(FindGreatestSumOfSubArray(array));
	
}
}
