
public class Square {
	private double side;
	
	public Square() {
		side = 0;
	}//end empty-argument constructor
	
	public Square(double s) {
		this.side = s;
	}//end preferred constructor
	
	public double getArea() {
		double area;
		area = side*side;
		return area;
	}//end getArea

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString
	

}//end class
