package NiuKe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
public static void f(int a[],int l,int r) {
	if( l >= r) {  
    return;  
}  
	int begin = l;
	int end = r;
	int p = a[l];
	System.out.println("l="+l+"r="+r+"p="+p);
	
	System.out.println("diao yong ");
	while(l<r)
	{
		
		while(l<r && a[r]>p)//上下顺序很重要，上面的先确定
			r--;
		while(l<r && a[l]<=p)
			l++;
		if(l<r)
		{
		int tmp = a[l];
		a[l] = a[r];
		a[r] = tmp;
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println(" change ");
	}
	int tmp = a[begin];
	a[begin] = a[l];//l是最后一个比p小的
	a[l] = tmp;
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	 f(a, begin, l-1);
	 f(a, l+1, end);
	
}
private static void quickSort(int[] a, int low, int high) {  
    //1,找到递归算法的出口  
    if( low > high) {  
        return;  
    }  
    //2, 存  
    int i = low;  
    int j = high;  
    System.out.println("diao yong ");
    
	/*if( l >= r) {  
        return;  
    }  */
	
    //3,key  
    int key = a[ low ];  
    System.out.println("l="+low+"r="+high+"p="+key);
    //4，完成一趟排序  
    while( i< j) {  
        //4.1 ，从右往左找到第一个小于key的数  
        while(i<j && a[j] > key){  
            j--;  
        }  
        // 4.2 从左往右找到第一个大于key的数  
        while( i<j && a[i] <= key) {  
            i++;  
        }  
        //4.3 交换  
        if(i<j) {  
            int p = a[i];  
            a[i] = a[j];  
            a[j] = p;  
        }  
        for(int t=0;t<a.length;t++)
			System.out.print(a[t]+" ");
		System.out.println(" change ");
    }  
    // 4.4，调整key的位置  
    int p = a[i];  
    a[i] = a[low];  
    a[low] = p;  
    //5, 对key左边的数快排  
    quickSort(a, low, i-1 );  
    //6, 对key右边的数快排  
    quickSort(a, i+1, high);  
}  
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] strings = scanner.nextLine().trim().split(" ");
	int[]a = new  int[strings.length];
	for(int i=0;i<a.length;i++)
	{
		a[i] = Integer.valueOf(strings[i]);
		
	}
	//Arrays.sort(a);
	quicksort q = new quicksort();
	//q.f(a,0,a.length-1);
	q.quickSort(a, 0, a.length-1);
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	
	
}
}
