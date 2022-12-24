package BileşikFaiz;

public class Faiz {

	public static void main(String[] args) {
		int anapara = 1000;

		double faiz = 0.05;
		int yil = 10;

		for (int i = 1; i <= 10; i++) {
			double btoplampara = anapara * (1 + (faiz * i));

			double toplampara =  btoplampara;
			System.out.println(i + "Biriken Para: " + toplampara);
		}
		

	}

}
