//�ڹ��� 4�� Ư¡: ĸ��ȭ(��������) , ��� , �߻�ȭ , ������
package class08_dto;

//DTO(data transfer object): ������ ��� �ٴϴ� Ʋ
//VO(value object) - Doamin
public class Person {

	// field encapsulation(ĸ��ȭ)
	private String name;
	private String idNo;
	private int age;

	// ����
	public Person() {
	}

	public Person(String name, String idNo, int age) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.age = age;
	}

	// private ������ ������ �޼ҵ�: getter & setter
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
			System.out.println("10�� �̻� ����");
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




