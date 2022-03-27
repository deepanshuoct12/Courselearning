
public class Book {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	public String toString() {
		return this.title + " by " + this.author;
	}
	
	public Price getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
