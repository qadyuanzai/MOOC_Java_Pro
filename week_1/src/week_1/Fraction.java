package week_1;

import java.util.Scanner;

class Fraction {
	
	int a;
	int b;
	
	Fraction(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	double toDouble()
	{
		return (1.0*a/b);
	}
	
	Fraction plus(Fraction r)
	{
		Fraction plus = new Fraction(this.a,this.b);
		plus.a = plus.a * r.b + r.a *plus.b ;
		plus.b = plus.b * r.b;
		return plus;
	}
	
	Fraction multiply(Fraction r)
	{
		Fraction multiply = new Fraction(this.a,this.b);
		multiply.a = multiply.a * r.a;
		multiply.b = multiply.b * r.b;
		return multiply;
	}
	
	void print()
	{
		if(a==b)
		{
			System.out.println(1);
		}
		else if(a==0)
		{
			System.out.println(0);
		}
		else if(a>b)
		{
			for(int i = b; i>1; i--)
			{
				if(a%i==0&&b%i==0)
				{
					a = a / i;
					b = b / i;
					break;
				}
			}
			System.out.println(a+"/"+b);
		}
		else if(a<b)
		{
			for(int i = a; i>1; i--)
			{
				if(a%i==0&&b%i==0)
				{
					a = a / i;
					b = b / i;
					break;
				}
			}
			System.out.println(a+"/"+b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
