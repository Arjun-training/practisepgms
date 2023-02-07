package solidprinciples;

public class Traveller {
	/*dependency inversion principle open */
	private Vehicle vehicle;
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/*dependency inversion principle closed */
	
	public static void main(String[] args) {
		Traveller t= new Traveller();
		/*open closed principle open*/
		System.out.println("OC priciple");
		Vehicle v=new Bike();
		t.startVehcile(v);
		Vehicle v1=new Car();
		t.startVehcile(v1);
		/*open closed principle closed*/
		
		/*dependency inversion principle open */
		System.out.println("DI priciple");
		t.setVehicle(new Car());
		t.startVehcile1();
		t.setVehicle(new Bike());
		t.startVehcile1();
		/*dependency inversion principle closed */
		
	}

	/*open closed principle open */
	private void startVehcile(Vehicle v) {
		// TODO Auto-generated method stub
		
		v.move();
	}
	/*open closed principle closed*/
	/*dependency inversion principle open */
	private void startVehcile1() {
		// TODO Auto-generated method stub
		vehicle.move();
	}
	/*dependency inversion principle closed */

}
