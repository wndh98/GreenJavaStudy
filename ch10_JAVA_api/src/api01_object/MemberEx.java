package api01_object;

public class MemberEx {

	public static void main(String[] args) throws CloneNotSupportedException{
		Member m1 = new Member("aa","aa","tom");
		Member m2 = new Member("cc","aa","tom");
		Member m3 = new Member("aa","aa","tom");
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		Member m4 = (Member)m1.clone();
		System.out.println(m1);
		System.out.println(m4);

	}

}
