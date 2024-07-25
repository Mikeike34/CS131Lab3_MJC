
public class ListApp {

	public static void main(String[] args) {
		ArrayList<Square> squareList = new ArrayList<Square>(5);
		ArrayList<String> stringList= new ArrayList<String>(5);
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(5);
		
		//showing different lists(all empty)
		System.out.println(squareList.toString());
		System.out.println(stringList.toString());
		System.out.println(pointList.toString());
		
		
		System.out.println("\n====================testing addItem with stringList====================");
		stringList.addItem("Fun");
		stringList.addItem("run");
		stringList.addItem("bun");
		stringList.addItem("sun");
		stringList.addItem("pun");
		System.out.println(stringList.toString());
		stringList.addItem("done");
		System.out.println(stringList.toString());
		
		System.out.println("\n====================testing addItem with squareList====================");
		squareList.addItem(new Square(5.0));
		squareList.addItem(new Square(20.0));
		squareList.addItem(new Square(18.0));
		squareList.addItem(new Square(22.2));
		squareList.addItem(new Square(19.3));
		System.out.println(squareList.toString());
		squareList.addItem(new Square(10.0));
		System.out.println(squareList.toString());
		
		System.out.println("\n====================testing addItem with pointList====================");
		pointList.addItem(new PointThreeD(10,22,82.4));
		pointList.addItem(new PointThreeD(18.2,95,97));
		pointList.addItem(new PointThreeD(1,8.6, 10));
		pointList.addItem(new PointThreeD(20,50,55));
		pointList.addItem(new PointThreeD(33.3,15.2,90.9));
		System.out.println(pointList.toString());
		pointList.addItem(new PointThreeD(1,2,3));
		System.out.println(pointList.toString());
		

	}//end main

}//end class
