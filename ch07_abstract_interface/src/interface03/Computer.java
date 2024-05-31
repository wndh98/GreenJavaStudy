package interface03;

public class Computer implements Searchable, RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Computer On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Computer Off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < RemoteControl.MIM_VOLUME) {
			this.volume = MIM_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Computer 볼륨 : " + this.volume);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Computer Play");
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터가 "+url + " 검색 합니다.");
	}

}
