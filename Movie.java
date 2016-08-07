

public class Movie {
	private String title;
	private String category;
	
	
	//constructor
	public Movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void printMovie()
	
	{
	System.out.println("The movies that are " + category + "are ");
		
	}
	
	
	
		
	}

