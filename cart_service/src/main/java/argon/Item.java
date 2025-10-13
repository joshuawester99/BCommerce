package argon;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
public class Item {
	
	@Id private String name;
	private int quantity_to_purchase;
	private double price;
}
