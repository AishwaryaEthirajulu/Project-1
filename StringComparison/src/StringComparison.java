
public class StringComparison {

	private void checksFaster() {
		final int NUM_ITERATIONS = 10000;
		// For StringBuffer
		long startBf = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Full");
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			sb.append("Creative");
		}
		long endBf = System.currentTimeMillis();
		long totalRunTimeBf = endBf - startBf;
		System.out.println("Execution time for String buffer: " + totalRunTimeBf + "ms");

		// for String
		long startS = System.currentTimeMillis();
		String str = "Full";
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			str += "Creative";
		}
		long endS = System.currentTimeMillis();
		long totalRunTimeS = endS - startS;
		System.out.println("Execution time for String : " + totalRunTimeS + "ms");

		// For StringBuilder
		long startBu = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Full");
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			sb2.append("Creative");
		}
		long endBu = System.currentTimeMillis();
		long totalRunTimeBu = endBu - startBu;
		System.out.println("Execution time for String builder: " + totalRunTimeBu + "ms");

		if ((totalRunTimeS < totalRunTimeBf) && (totalRunTimeS < totalRunTimeBu)) {
			System.out.println("The Concatenation using String is faster");
		} else if (totalRunTimeBf < totalRunTimeBu) {
			System.out.println("The Concatenation using StringBuffer is faster");
		} else {
			System.out.println("The Concatenation using StringBuilder is faster");
		}
	}

	public static void main(String args[]) {
		StringComparison s = new StringComparison();
		s.checksFaster();
	}
}
