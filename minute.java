public class minute {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				int i1 = 1;
				while(0 < 1) {
					for(int i = 1; i <= 60; i++) {
						try {
							System.out.print(" " + i);
							sleep(1000);
							if (i == 60) {
								System.out.println("\n" +"This is the end of minute: " + i1);
								i1 += 1;
							}
						} catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		t.start();
	}
}