
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieLab2 {
	public static void main(String[] args) {
		String choice = "y";

		// set up my array list
		ArrayList<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("Star Wars", "scifi"));

		list.add(new Movie("Lilo and Stitch", "animated"));

		list.add(new Movie("Forest Gump", "drama"));

		list.add(new Movie("Dumbo", "animated"));

		list.add(new Movie("Jason Bourne", "drama"));

		list.add(new Movie("Lilo and Stitch", "animated"));

		list.add(new Movie("Shawshank Redemption", "drama"));

		list.add(new Movie("Lion King", "animated"));

		list.add(new Movie("Star Trek", "scifi"));

		list.get(0).getCategory();
		boolean isCategory;
		System.out.println("Welcome to the Movie List Application!!");

		// set up the continue while loop
		while (choice.equalsIgnoreCase("y")) {

			System.out.println(
					"There are 10 movies in this list \nWhat category are you interested in? (animated, drama, or scfi)");

			Scanner scan1 = new Scanner(System.in);

			String userInput = null;

			userInput = scan1.nextLine();
			
			while (!userInput.equalsIgnoreCase("drama") && !userInput.equalsIgnoreCase("scifi") && !userInput.equalsIgnoreCase("animated"))
			{
				System.out.println("Please enter drama, scifi, animated.");
				userInput= scan1.nextLine();
				//scan1.next();
		
			}
			System.out.println("The movies that are " + userInput + " are: ");
			
			

			for (int i = 0; i < list.size(); i++) {

				if (userInput.equalsIgnoreCase(list.get(i).getCategory())) {

					System.out.println(list.get(i).getTitle());

				}
				

			}
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Would you like to conintue? (y/n)");
			choice = scan2.nextLine();
			System.out.println();

		}
	}
}
