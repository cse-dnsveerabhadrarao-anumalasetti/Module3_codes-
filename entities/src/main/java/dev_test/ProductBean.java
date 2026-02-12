/**
 * 
 */
package dev_test;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
public class ProductBean implements Serializable{
	private Integer id;
	private String brand;
	private String name;
	private Double price;
}
