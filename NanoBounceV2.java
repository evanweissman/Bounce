public class NanoBounceV2 {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 31; i++) {
			ball(i, i%10 == 0 ? 1 : i%10 == 1 || i%10 == 9 ? 2 : i%10 == 2 || i%10 == 8 ? 3 : i%10 == 3 || i%10 == 7 ? 4 : i%10 == 4 | i%10 == 6 ? 5 : 6);
			if(i%10 == 0 || i%10  == 5) {
				System.out.print("\u0007");
			}
		}
		System.out.print("\u001b[2J"+ "\u001b[?25h");
	}
	public static void ball(int x, int y) throws InterruptedException {
		System.out.print("\u001b[2J"+ "\u001b[1m" + "\u001b[?25l" + "\u001b[H" + "\n\n================================\n\n\n\n\n\n\n================================" + "\u001b[H");
		for(int i = -2; i < y; i++) {
			System.out.println();
		} for(int j = 0; j < x; j++) {
			System.out.print(" ");
		}
		System.out.print("O");
		Thread.sleep(100);
	}
}
