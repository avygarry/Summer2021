
public class Homework84_Book {

	public String title;
	public int numberOfPages;
	public String author;
	public int year;
	public float cost;
	
	public static void main(String[] args) {
		Homework84_Book MSBYOML = new  Homework84_Book();
		MSBYOML.title = "Middle School: The Worst Years Of My Life";
		MSBYOML.numberOfPages = 209;
		MSBYOML.author = "James Patterson";
		MSBYOML.year = 2011;
		MSBYOML.cost = 9.79f;
		
		System.out.println(MSBYOML.title);
		System.out.println(MSBYOML.numberOfPages);
		System.out.println(MSBYOML.author);
		System.out.println(MSBYOML.year);
		System.out.println(MSBYOML.cost);
		
		
	}
}
