package didi;

import java.util.Scanner;

public class daoyu {
	public static void dfs(int[][] a,int x,int y,int m,int n) {
		//System.out.println(x+" "+y);
		if(a[x][y]==1)
			a[x][y]=2;
		if(x-1>=0 && a[x-1][y]==1)
			dfs(a, x-1, y, m, n);
		if(x+1<m && a[x+1][y]==1)
			dfs(a, x+1, y, m, n);
		if(y-1>=0 && a[x][y-1]==1)
			dfs(a, x, y-1, m, n);
		if(y+1<n && a[x][y+1]==1)
			dfs(a, x, y+1, m, n);
		/*for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println("");
		}
		System.out.println("");*/
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = Integer.parseInt(scanner.nextLine().trim());
		int n= Integer.parseInt(scanner.nextLine().trim());
		int k= Integer.parseInt(scanner.nextLine().trim());
		//System.out.println(m);
	
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[] c = new int[k];
		
		for(int i=0;i<k;i++)
		{
			int count=0;
			//System.out.println("k="+i);
			String[] tmps = scanner.nextLine().split(" ");
			int x = Integer.parseInt(tmps[0]);
			int y = Integer.parseInt(tmps[1]);
			if(x<0 || y<0 || x>=m || y>=n)
				continue;
			a[x][y] = 1;
			/*int figer = 0;
			if(x-1>=0 && a[x-1][y]==1)
				figer = 1;
			if(x+1<m && a[x+1][y]==1)
				figer = 1;
			if(y-1>=0 && a[x][y-1]==1)
				figer = 1;
			if(y+1<n && a[x][y+1]==0)
				figer = 1;
			if(figer ==1)
				count++;
			c[i] = count;*/
			
			
			for(int p=0;p<m;p++)
			{
				for(int q=0;q<n;q++)
					b[p][q] = a[p][q];
			}
			
			for(int r=0;r<m;r++)
			{
				for(int l=0;l<n;l++)
				{
					
					if(b[r][l]==1)
					{
						//System.out.println("begin"+r+" "+l );
						count++;
						dfs(b, r, l, m, n);
						
					}
				}
			}
			c[i] = count;
			
			
		}
		for(int i=0;i<k;i++)
			System.out.print(c[i]+" ");
		
		
		
		
	}

}
