package com.bl.generics;

public class MaxNumber{

		Integer x,y,z;

		public MaxNumber(Integer x, Integer y, Integer z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public void print(){
			System.out.println("Given Integer's are : ");
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
			MaxNumber maxNum = new MaxNumber(1, 2, 3);
			maxNum.print();
			maxNum.findMax();
		}
}
