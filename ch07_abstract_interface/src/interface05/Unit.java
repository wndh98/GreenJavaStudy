package interface05;



public class Unit {
	int hitPoint; // 현재 생명력
	final int MAX_HP; // 최대 생명력
	
	public Unit(int hp) {
		MAX_HP=hp;
	}
	
	
}

class GroundUnit extends Unit{

	public GroundUnit(int hp) {
		super(hp);
	}
	
	
}

class AirUnit extends Unit{

	public AirUnit(int hp) {
		super(hp);
	}
	
}




