package ex;

public class ParcelService {

	private static ParcelService instance;

	private ParcelService() {
	}

	public static ParcelService getInstance() {
		if (instance == null) {
			instance = new ParcelService();

		}
		return instance;
	}

	Parcel[] parcelArray = new Parcel[100];

	public Parcel createParcel(String itName) {
		int itemNum = 0;
		while (true) {
			itemNum = (int) (Math.random() * 100) + 1;
			if (checkItemNum(itemNum) == null) {
				break;
			}
		}
		Parcel pc = new Parcel(itemNum, 0, itName);
		return pc;
	}

	public Parcel checkItemNum(int itemNum) {

		for (Parcel pc : parcelArray) {
			if (pc != null) {
				if (pc.getItemNum() == itemNum) {
					return pc;
				}
			}
		}

		return null;
	}

}