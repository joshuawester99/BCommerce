package argon;

import jakarta.persistence.Entity; // TODO Might be an issue later.
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
public class Cart {
	
	@Id private String cartId;
	private double total;

}
