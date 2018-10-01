package offer;

/**二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * **/
public class OneFindArray {
	public  boolean Find(int target, int [][] array) {
		int m = array[0].length;
		int n = array.length;
		int begin=0;
		boolean res = false;
		if(n<=0 || m<=0)
			return res;
		int i=0,j=m-1;
		while(i<n && j>=0)	{//右上角不断逼近 不是最右上的就比左边一行下面的大
			//判断放最上面
			if(array[i][j] == target){
				res = true;
				break;
			}
			if(array[i][j]>target)
			{
				j = j-1;
			}
			if(array[i][j]<target)
			{
				i = i+1;
			}
			
		}
		
	
		return res;
    
}
}
