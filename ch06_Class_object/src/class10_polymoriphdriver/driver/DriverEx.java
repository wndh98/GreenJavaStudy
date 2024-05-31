package class10_polymoriphdriver.driver;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b= new Bus();
		Taxi t= new Taxi();
		Vehicle v= new Vehicle();
		Driver driver = new Driver();
		driver.drive(b);
		driver.drive(t);
		driver.drive(v);
		System.out.println(b.getClass() == Bus.class);
	}

}
