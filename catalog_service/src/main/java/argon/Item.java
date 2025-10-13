package argon;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity @Table(name = "items")
public class Item {
	
	@Id private String name;
	private String description;
	private int quantity_in_stock;
	private double price;
}
