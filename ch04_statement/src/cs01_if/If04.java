package cs01_if;

public class If04 {

	public static void main(String[] args) {
		// age 0�� �����̸� "õ��" ���
		// age 18�� �̻��̸� "����" ���, 15~17���� "Ŀ��", 15�� �̸��̸� "����"
		// ���� ������� Ȯ���ϰ�(age > 0) ����� ��쿡�� ���̿� �´� ���Ḧ ��õ
		int age = 1;
		String str="";
		if(age>0) {
			if(age>=18) {
				str="����";
			}else if(age>=15) {
				str="Ŀ��";
			}else {
				str="����";
			}
		}else {
			str="õ��";
		}
		System.out.println(str);
	}

}