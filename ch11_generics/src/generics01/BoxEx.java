package generics01;

class Pair<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare;
	}
}

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("test");

		String name = (String) box.getObj();
		System.out.println(name);

		box.setObj(new Apple());
//		name = (String) box.getObj();
//		name = (Apple) box.getObj();
		System.out.println(name);

		// generics 지정을 하면 형변환 없이 사용가능하고 불필요한 익셉션을 미연에 방지
		Box_Gen<String> bg = new Box_Gen<>();
		bg.setObj("test2");
		name = bg.getObj();
		System.out.println(name);

		Box_Gen<Apple> bg_apple = new Box_Gen<>();
		bg_apple.setObj(new Apple());
		Apple ap = bg_apple.getObj();

	}

}
