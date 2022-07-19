package in.synxt.inventorynxt.model;

public class ProductModel {
	private Integer id;
	private String name;
	private String category;
	private Double price;
	private Integer quantityInHand;
	
	public ProductModel() {
		super();
	}
	
	public ProductModel(Integer id, String name, String category, Double price, Integer quantityInHand) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantityInHand = quantityInHand;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantityInHand() {
		return quantityInHand;
	}
	public void setQuantityInHand(Integer quantityInHand) {
		this.quantityInHand = quantityInHand;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", quantityInHand=" + quantityInHand + "]";
	}
	
}
