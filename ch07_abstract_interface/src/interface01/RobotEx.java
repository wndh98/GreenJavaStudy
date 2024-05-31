package interface01;

public class RobotEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanceRobot d1 = new DanceRobot();
		SingRobot s1 = new SingRobot();
		Robot r1 = new DanceRobot();
		Robot r2 = new SingRobot();
		Robot r3 = new JavaRobot();
		Robot[] robots = {r1,r2,r3};
		for(Robot r : robots) {
			r.recharge();
			
			if(r instanceof DanceRobot) {
				((DanceRobot) r).dance();
			}else if(r instanceof SingRobot) {
				((SingRobot) r).sing();
			}else if(r instanceof JavaRobot) {
//				((JavaRobot) r).program();
				// 둘다 가능하지만 밑에 부분을 쓰는게 내 생각으로는 범용성이 높다고 생각됨
				((CodingRobot) r).program();
			}
		}
	}

}





