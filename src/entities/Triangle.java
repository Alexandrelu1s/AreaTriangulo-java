package entities;

public class Triangle {
	private Double a;
	private Double b;
	private Double c;
	
	public Triangle(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Double getA() {
		return this.a;
	}
	
	public void setX(Double a) {
		this.a = a;
	}
	
	public Double getB() {
		return this.b;
	}
	
	public void setB(Double b) {
		this.b = b;
	}
	
	public Double getC() {
		return this.c;
	}
	
	public void setC(Double c) {
		this.c = c;
	}
	
	public Double area() {
		Double p = (a + b + c)/2.0;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
}
