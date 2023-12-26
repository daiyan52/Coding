package leetcode.in;

import java.util.Scanner;

public class Pow {
	public static double pow(double x,int n)
	{
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            double d = Math.pow(x,n);
            return d;
        }
        return Math.pow(x,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter base and power");
		Scanner s = new Scanner(System.in);
		double d = 1/4;
		System.out.println("D "+d);
		double x = s.nextDouble();
		int n = s.nextInt();
		double res = pow(x,n);
		System.out.println(res);
	}

}
