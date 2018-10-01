package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class leastk {
	public static int  p(int[] input,int k,int s,int e,ArrayList<Integer> list) {
		int i=s, j=e;
		int t = input[s];
		
		while(i<j)
		{
			while(i<j && input[j]>t)//大 的在上
				j--;
			
			while(i<j && input[i]<=t)
			{
				i++;
			}
			
			if(i<j){
				int tmp = input[i];
				input[i] = input[j];
				input[j] = tmp;
			}
				
		}
		input[s] = input[j];
		input[j] = t;
		System.out.println(s+" "+j+" "+e);
		for(int h=s;h<=e;h++)
			System.out.print(input[h]+" ");
		System.out.println();
		
		/*if(s-j+1>=t)
			p(input, k, s, j, list);*/
		return j;
		
		//return 0;
		
	}
	public void HeapAdjust(int[] input,int parent,int length) {
		int tmp = input[parent];
		for(int i=parent*2+1;i<=length;i=i*2+1){
			if(i<length && input[i]<input[i+1])
				i++;
			//如果父节点大于或者等于较大的孩子，那就退出循环
			if(tmp>input[i])
				break;
			
			 //如果父节点小于孩子节点，那就把孩子节点放到父节点上
            input[parent] = input[i];
            //把孩子节点的下标赋值给parent
            //让其继续循环以保证大根堆构造正确
            parent = i;


			
		}
		
	}
	public static void Heapsort(int [] input,int k) {
		
	}
	
public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	int s=0;
	ArrayList<Integer> list = new ArrayList<>();
    int e=input.length-1;
    
    if(input.length<k || k<=0){
        //Arrays.sort(input);
    	
    	return list;
    }
    int index = p(input, k, 0, e, list);//先判断	
    while(index!=k-1)
    {
    	if(index<k-1)
    	{
    		s = index+1;
    		index = p(input, k,s, e, list);
    	}
    	if(index>k-1)
    	{
    		e = index-1;
    		index = p(input, k, s, e, list);
    	}
    }
    for(int h=0;h<=index;h++)
		list.add(input[h]);
	
	
	
        return list;
    }
public static void main(String[] args) {
	int[] a={};
	ArrayList<Integer> list = GetLeastNumbers_Solution(a,0);
	
	System.out.println(list);
}

}
