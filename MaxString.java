package com.bl.generics;

public class MaxString {
	String x,y,z;

	public MaxString(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("Given String's are : ");
		System.out.print(x +", ");
		System.out.print(y +", ");
		System.out.print(z +" ");
		System.out.println(" ");
	}
	public void findMax() {
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			System.out.println("Max String is : "+x);

		} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Max String is : "+y);

		} else {
			System.out.println("Max String is : "+z);
		}
	}
	public static void main(String[] args) {
		MaxString max = new MaxString("Apple","Peach","Banana");
		max.print();
		max.findMax();
	}
}