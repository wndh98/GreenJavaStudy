//자바의 4대 특징: 캡슐화(정보은닉) , 상속 , 추상화 , 다형성
package class08_dto;

//DTO(data transfer object): 데이터 담고 다니는 틀
//VO(value object) - Doamin
public class Person {

	// field encapsulation(캡슐화)
	private String name;
	private String idNo;
	private int age;

	// 생성
	public Person() {
	}

	public Person(String name, String idNo, int age) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.age = age;
	}

	// private 변수에 접근할 메소드: getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 10) {
			System.out.println("10살 이상만 가능");
			return;
		}
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", idNo=" + idNo + ", age=" + age + "]";
	}

}
// 




