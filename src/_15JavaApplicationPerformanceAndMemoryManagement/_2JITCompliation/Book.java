package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

public class Book implements ReadOnlyBook {
	private int id;
	private String title;
	private String author;
	private Price price;

	/* (non-Javadoc)
	 * @see _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation.ReadOnlyBook#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation.ReadOnlyBook#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	
	@Override
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	public Book(ReadOnlyBook book) {
		this.id = book.getId();
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.price = book.getPrice();
		// this.price = new Price(new Double(book.getPrice().toString()));

	}


	@Override
	public String toString() {
		return title + " by " + author;
	}


	@Override
	public Price getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = new Price(price);
	}
}
