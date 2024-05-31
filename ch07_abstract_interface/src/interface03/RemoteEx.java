package interface03;

public class RemoteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.turnOn();
		tv.setVolume(17);
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(9);
		System.out.println("--------------------");
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(-3);
		rc.play();
		rc.turnOff();
		
		System.out.println("---------------------------");
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.play();
		rc.turnOff();
		
		System.out.println("------------------------------");
		SmartTv st=new SmartTv();
		st.turnOn();
		st.setVolume(1);
		st.play();
		st.search("네이버");
		rc=st;
		((SmartTv)rc).search("다음");
		System.out.println("-------------------------------");
		Computer cp = new Computer();
		cp.turnOn();
		cp.search("123");
		
		
	}

}



