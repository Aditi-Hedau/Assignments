package in.cdac.acts;

public class Book {
	String tittle;
	String author;
	String publisher;
	String isbn;
	int year;
	double price;
	int quantity;

	public Book(String tittle, String author, String publisher, String isbn, int year, double price, int quantity) {
		this.tittle = tittle;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Bussiness logic

	public void increaseQuantity(int quantity) {
		this.quantity += quantity;
	}

	public void decreaseQuantity(int quantity) {
		if (this.quantity >= quantity) {
			this.quantity -= quantity;
		} else {
			System.out.println("insufficient quantity available");
		}
	}

	public double getInventoryValue() {
		return price * quantity;
	}

	public static void main(String[] args) {
		Book b = new Book("Java Programming", "James Gosline", "Oracle", "ADBIO123", 1970, 29.90, 100);

		b.increaseQuantity(50);
		System.out.println("Increased Book Quantity : " + b.getQuantity());

		b.decreaseQuantity(30);
		System.out.println("Decreased Book Quantity : " + b.getQuantity());

		System.out.println("Inventory value $: " + b.getInventoryValue());

	}
}
