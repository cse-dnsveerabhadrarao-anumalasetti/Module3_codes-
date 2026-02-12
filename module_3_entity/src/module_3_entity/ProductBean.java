package module_3_entity;

import java.util.Objects;
import java.io.Serializable;

public class ProductBean implements Serializable{
	private Integer id;
	private String brand;
	private String name;
	private Double price;
	/**
	 * 
	 */
	public ProductBean() {
		super();
	}
	/**
	 * @param id
	 * @param brand
	 * @param name
	 * @param price
	 */
	public ProductBean(Integer id, String brand, String name, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the brand
	 */
	public final String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public final void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public final Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public final void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductBean other = (ProductBean) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}
	
}
