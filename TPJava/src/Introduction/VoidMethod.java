package Introduction;

public class VoidMethod {

	public static void methodRankPoints() {
		double points = 155.7;
		if (points >= 202.4) {
			System.out.println("Rank:A1");
		} else if (points >= 122.5) {
			System.out.println("Rank: A2");
		} else {
			System.out.println("Rank: A3");
		}
	}

	public static void main(String[] args) {
		methodRankPoints();
	}

}
