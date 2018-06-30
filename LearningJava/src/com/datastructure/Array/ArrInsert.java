package com.datastructure.Array;

public class ArrInsert {

	public static void main(String[] args) {

		ArrInsert a=new ArrInsert();
		a.insertIntoArray2(10, 2);
		System.out.println("\n");
		a.DeleteFromArray(3);
	}
public void insertIntoArray(int item, int index)
{ 
	int arr[]= new int[]{5,3,7,9,4,6,7};
	int c=arr.length-1; // c = 6
	int i=index; // i = 2
	while(c>i) // 6 > 2
	{
		arr[c]=arr[c-1]; // a[6] = 6
		c--;
		
	}
	arr[index]=item;
	
	for(int j:arr)
		System.out.print(j+",");
	
}

public void insertIntoArray2(int item, int index)
{
	int arr[]= new int[]{5,3,7,9,4,6,7};
	if(arr.length > index) {
		arr[index] = item;
	}
	
	for(int j:arr)
		System.out.print(j+",");
	
}


public void DeleteFromArray(int index)
{
	
	int arr2[];
	
	int arr[]= new int[]{5,3,7,9,4,6,7};
	int c=arr.length-1;
	int i=index;
	while(c>i)
	{
		arr[i]=arr[i+1];
		i++;
	}
	
	for(int k=0; k<=arr.length-1; k++)
	{
		System.out.print(arr[k]+",");
	}
	
	
}
}
