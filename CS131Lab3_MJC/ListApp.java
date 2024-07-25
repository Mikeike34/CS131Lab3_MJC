
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
		squareList.addItem(5);
		

	}//end main

}//end class
