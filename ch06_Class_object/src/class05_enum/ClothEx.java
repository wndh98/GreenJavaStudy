package class05_enum;

class Cloth {
	String code;
	String name;
	String material;
	Season season;

	public Cloth(String code, String name, String material, Season season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

	@Override
	public String toString() {
		return "Cloth [code=" + code + ", name=" + name + ", material=" + material + ", season=" + season + "]";
	}

}

public class ClothEx {

	public static void main(String[] args) {
		Cloth c1 = new Cloth("1111", "love", "jean", Season.SUMMER);
		Cloth c2 = new Cloth("2222", "hate", "cotton", Season.WINTER);
		Cloth c3 = new Cloth("3333", "money", "jean", Season.SUMMER);
		Cloth c4 = new Cloth("4444", "sky", "cotton", Season.SPRING);
		Cloth c5 = new Cloth("5555", "sky", "silk", Season.AUTUMN);
		Cloth c6 = new Cloth("6666", "love", "jean", Season.SUMMER);
		
		Cloth[] clothes = { c1, c2, c3, c4, c5, c6 };
		for(int i=0;i<clothes.length;i++) {
			if(clothes[i].season==Season.SUMMER) {
				System.out.println(clothes[i]);
			}
		}

	}

}
