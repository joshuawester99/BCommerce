package argon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
public class User {

	@Id private String name;
	private String email;
	private String credit_card;
	private String address;
}
