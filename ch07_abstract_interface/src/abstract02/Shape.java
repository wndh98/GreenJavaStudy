package abstract02;

public abstract class Shape {
	public Shape() {
		System.out.println("부모 생성자");
	}
	// 자식이 재정의할 수도 있고 안 할 수도 있는 메소드
	void title() {
		System.out.println("도형 그리기");
	}
	// 자식이 무조건 구현(implement) 해줘야 하는 메소드
	abstract void draw();

	abstract void delete();
}


class Circle extends Shape{
	
	public Circle() {
		
		System.out.println("원객체 생성");
	}
	
	void draw() {
		System.out.println("원그리기");
	}
	void delete() {
		System.out.println("원삭제");
	}
}
class Rectangle extends Shape{
	public Rectangle() {
		System.out.println("사각형 객체 생성");
	}
	void draw() {
		System.out.println("사각형그리기");
	}
	void delete() {
		System.out.println("사각형삭제");
	}
}
class Triangle extends Shape{
	public Triangle() {
		System.out.println("삼각형 객체 생성");
	}
	void draw() {
		System.out.println("삼각형그리기");
	}
	void delete() {
		System.out.println("삼각형삭제");
	}
}

