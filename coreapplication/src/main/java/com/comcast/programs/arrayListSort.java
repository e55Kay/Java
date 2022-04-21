package com.comcast.programs;

import java.util.ArrayList;

public class arrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Integer temp = 0;
		//5,8,2,1,9,4,7,3,6;
		arr.add(5);
		arr.add(8);
		arr.add(2);
		arr.add(1);
		arr.add(9);
		arr.add(4);
		arr.add(7);
		arr.add(3);
		arr.add(6);
		
		for(int i = 0; i < arr.size(); i++)
		{
			for(int j = 0; j < arr.size() - i - 1; j++)
			{
				if(arr.get(j) > arr.get(j+1))
				{
					temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		
		for(Integer i: arr) {
			System.out.print(i + " ");
		}
	}

}
