package cs01_if;

public class If04 {

	public static void main(String[] args) {
		// age 0세 이하이면 "천사" 출력
		// age 18세 이상이면 "소주" 출력, 15~17세면 "커피", 15세 미만이면 "우유"
		// 먼저 사람인지 확인하고(age > 0) 사람일 경우에만 나이에 맞는 음료를 추천
		int age = 1;
		String str="";
		if(age>0) {
			if(age>=18) {
				str="소주";
			}else if(age>=15) {
				str="커피";
			}else {
				str="우유";
			}
		}else {
			str="천사";
		}
		System.out.println(str);
	}

}
