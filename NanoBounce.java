public class NanoBounce {
	static String CLS = "\u001b[2J";
        static String HOME = "\u001b[H";
        static String BOLD = "\u001b[1m";
        static String BELL="\u0007"; //in Windows 10, this plays the "Critical Stop" system sound. I set mine to https://www.wavsource.com/snds_2020-10-01_3728627494378403/sfx/phasesr2.wav
        static String HIDE_CURSOR="\u001b[?25l";
        static String SHOW_CURSOR="\u001b[?25h";
        static int delay = 100; //how many miliseconds each frame will remain on the screen before the next one is drawn
    public static void main(String[] args) throws InterruptedException {
     	    System.out.println(CLS + BOLD + HIDE_CURSOR);
	    ball(0,1);
	    ball(1,2);
	    ball(2,3);
	    ball(3,4);
	    ball(4,5);
	    ball(5,6);
	    ball(6,5);
	    ball(7,4);
	    ball(8,3);
	    ball(9,2);
	    ball(10,1);
	    ball(11,2);
	    ball(12,3);
	    ball(13,4);
	    ball(14,5);
	    ball(15,6);
	    ball(16,5);
	    ball(17,4);
	    ball(18,3);
	    ball(19,2);
	    ball(20,1);
	    ball(21,2);
	    ball(23,3);
	    ball(24,4);
	    ball(25,5);
	    ball(26,6);
	    ball(27,5);
	    ball(28,4);
	    ball(29,3);
	    ball(30,2);
	    ball(31,1);
	    System.out.println(CLS + SHOW_CURSOR);
    }
    public static void bars() {
	System.out.println(CLS + HOME);
	System.out.println("\n\n================================\n\n\n\n\n\n\n================================");
	System.out.println(HOME);
    }
	public static void ball(int x, int y) throws InterruptedException {
		bars();
		for(int i = -2; i < y; i++) {
			System.out.println();
		}
		for(int j = 0; j < x; j++) {
			System.out.print(" ");
		}
		System.out.print("O");
		if(x != 0 && (y == 1 || y == 6)) {
			System.out.print(BELL);
		}
		
		Thread.sleep(delay);
	}


}
