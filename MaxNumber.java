package com.bl.generics;

public class MaxNumber{

		Float x,y,z;

		public MaxNumber(Float x, Float y, Float z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public void print(){
			System.out.println("Given Float values are : ");
			System.out.print(x +" ");
			System.out.print(y +" ");
			System.out.print(z +" ");
			System.out.println(" ");
		}
		public void findMax() {
			if (x.compareTo(y) > 0 && x.compareTo(z) > 0){
				System.out.println("Max Number is :"+x);

			} else if (y.compareTo(x) > 0 && y.compareTo(z) > 0){
				System.out.println("Max Number is :"+y);

			} else {
				System.out.println("Max Number is :"+z);
			}
		}
		public static void main(String[] args){
			MaxNumber maxNum = new MaxNumber(1f, 2f, 3f);
			maxNum.print();
			maxNum.findMax();
		}
}
