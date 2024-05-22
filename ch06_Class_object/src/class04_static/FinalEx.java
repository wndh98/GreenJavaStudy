package class04_static;

class Korean {
	final String nation = "Korea"; // 선언하면서 초기화
	final String idNo;
	String name;

	public Korean(String idNo, String name) {
		super();
		this.idNo = idNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", idNo=" + idNo + ", name=" + name + "]";
	}

}

class Earth {
	int population;
	static final double EARTH_RADIUS = 6400.0;
	static final double EARTH_SURFACE_AREA;

	public Earth() {
		//EARTH_SURFACE_AREA = EARTH_RADIUS * EARTH_RADIUS * Math.PI * 4;
	}
	static {
		EARTH_SURFACE_AREA 
		= EARTH_RADIUS * EARTH_RADIUS * Math.PI * 4;
	}

}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("a123", "가희");
		System.out.println(k1);
		k1.name = "sally";
		System.out.println(k1);
//		k1.nation="중국";
//		System.out.println(k1);
		
		System.out.println("지구 반지름" + Earth.EARTH_RADIUS);
		System.out.println("지구 표면적" + Earth.EARTH_SURFACE_AREA);
	}

}


// 
