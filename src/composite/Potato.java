package composite;

import lombok.Data;

@Data // getter setter
public class Potato {
	
	private int price;
	private String desc;
	
	public Potato() {
		this(1000, "����Ƣ��");
	}
	
	public Potato(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}
	
	
	
	
}
