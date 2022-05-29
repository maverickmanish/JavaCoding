package hackerearth;

public class Product {

	private Integer product_id;
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	private String product_name;
	private Integer product_price;
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}
	public Product(Integer product_id, String product_name, Integer product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + "]";
	}

	
	
}
