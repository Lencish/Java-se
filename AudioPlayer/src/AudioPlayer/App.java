package AudioPlayer;

import javax.swing.WindowConstants;

public class App {

	public static void main(final String[] args) throws Exception {

		final CustomJFrame f = new CustomJFrame("Sound Player");

		f.setSize(1125, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
