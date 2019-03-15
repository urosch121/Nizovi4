package kursk;

import java.util.Scanner;

public class Main_Niz_4 {

	public static void main(String[] args) 
	{
		int n,m;
		System.out.println("Koliko clanova niz a ima?");
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		
		int a [] = new int [n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("a [" + i + "] = ");
			a[i] = in.nextInt();
		}
			
				
		System.out.println("Koliko clanova niz b ima?");
		m = in.nextInt();
		
		int b [] = new int [m];
		
		for (int i = 0; i < m; i++) 
		{
			System.out.print("b [" + i + "] =");
			b[i] = in.nextInt();
		}
		
		System.out.print("a : ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
			
		System.out.print("b : ");
		for (int i = 0; i < m; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		
		boolean flag = true;
		
		for (int i = 0; i < m && flag == true; i++)
		{
			boolean ind = false;
			
			for (int j = 0; j < n && ind == false; j++)
				if (a[j] == b[i])
					ind = true;
				
			if (ind == false)
				flag = false;
			
		}
		
		if (flag == true)
			System.out.println("Nalazi se ceo b u a");
		else
			System.out.println("Ne nalazi se ceo b u a");
		
		
		
		
		}

}
