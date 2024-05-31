package interface03;

public class SmartTv extends TV implements Searchable{
	private int volume;
	
	public void search(String url) {
		System.out.println("스마트 티비가 "+url + " 검색 합니다.");
	}
	public void play() {
		System.out.println("스마트 티비 영상 재생");
	}
	
}
