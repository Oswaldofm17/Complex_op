package complex;

import java.util.*;

public class Complex {
	
	private double real;
	private double img;
	
	
	
	public Complex (double r, double i)
	{
		this.real = r;
		this.img = i;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImg() {
		return img;
	}
	public void setImg(double img) {
		this.img = img;
	}
	public void sum(Complex a, Complex b)
	{
		this.real = a.getReal() + b.getReal();
		this.img = a.getImg() + b.getImg();
	}
	public void resta(Complex a, Complex b)
	{
		this.real= a.getReal() - b.getReal();
		this.img = a.getImg() - b.getImg();
	}

}
