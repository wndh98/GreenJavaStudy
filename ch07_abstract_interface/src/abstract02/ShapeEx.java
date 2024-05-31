package abstract02;

public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c1 = new Circle();
		Shape r1 = new Rectangle();
		Shape t1 = new Triangle();
		Shape[] shapes = { c1, r1, t1 };
		for(Shape s : shapes) {
			s.title();
			s.draw();
			s.delete();
		}
	}

}
