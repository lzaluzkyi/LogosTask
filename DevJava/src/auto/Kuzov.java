package auto;

public class Kuzov {

	private String color;

	

	public Kuzov(String color) {
		super();
		this.color = color;
	}

	public String toString() {
		return "Kuzov [color=" + color + "]";
	}

	public String reColor(String reColor) {
		color = reColor;
		return color;

	}

}
