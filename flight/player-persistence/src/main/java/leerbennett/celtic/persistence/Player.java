package leerbennett.celtic.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String destination;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

}
