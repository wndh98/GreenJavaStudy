package interface03;

public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < RemoteControl.MIM_VOLUME) {
			this.volume = MIM_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : " + this.volume);
	}

	@Override
	public void turnOff() {
		System.out.println("audio off");
	}

	@Override
	public void turnOn() {
		System.out.println("audio on");
	}
	@Override
	public void play() {
		System.out.println("오디오재생");
		
	}
}
