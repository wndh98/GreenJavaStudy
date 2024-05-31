package api06_format;

public class MathEx {
	public static void main(String[] args) {
		// PI: 상수
		int r = 7;
		double area = Math.PI * r * r;

		// 절대값
		int a = -5;
		System.out.println(Math.abs(a));
		double a2 = -5.95;
		System.out.println(Math.abs(a2));
		System.out.println("==================");
		// 올림
		double a3 = Math.ceil(5.35);
		double a4 = Math.ceil(-5.35);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("==================");
		// 내림
		double a5 = Math.floor(5.35);
		double a6 = Math.floor(-5.35);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println("==================");
		// random과 반올림
		double a7 = Math.random();
		double a8 = Math.round(a7);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println("==================");
		// 근사값: 가장 가까운 정수 값을 반환. 정확히 가운데일 경우는 가장 가까운 짝수를 반환
		double a9 = Math.rint(5.35);
		double a10 = Math.rint(6.5);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println("==================");
		// 제곱: pow(double, double)
		System.out.println(Math.pow(3.41, -4.08));
	}
}
