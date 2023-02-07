package liskovPrinciple;

public class Square extends Rectangle {
	public double height;
	public double weight;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		super.setHeight(height);
		super.setWeight(height);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		super.setHeight(weight);
		super.setWeight(weight);
	}

	public static void main(String[] args) {
		Square c= new Square();
		c.setHeight(10);
		c.setWeight(19);
		System.out.println(c.getHeight());
		System.out.println(c.getWeight());
		Rectangle r= new Rectangle();
		r.setHeight(11);
		r.setWeight(13);
		System.out.println(r.getHeight());
		System.out.println(r.getWeight());
		
	}
	
}
