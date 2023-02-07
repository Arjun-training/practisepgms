package coupling;

public class Traveller {
	Car c= new Car();
	
	public static void main(String[] args) {
		Traveller t= new Traveller();
		t.startJourney();
	}

	private  void startJourney() {
		// TODO Auto-generated method stub
		c.move();
	}

}
