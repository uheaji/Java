package composite;

import lombok.Data;

@Data
public class ShrimpBurgerSet {
	private ShrimpBurger shrimpburger;
	private Potato potato;
	private Coke cola;
	
	public ShrimpBurgerSet() {
		this(new ShrimpBurger(), new Potato(), new Coke());
	}
	
	public ShrimpBurgerSet(ShrimpBurger shrimpburger, Potato potato, Coke cola) {
		this.shrimpburger = shrimpburger;
		this.potato = potato;
		this.cola = cola;
	}
	
	
	

}
