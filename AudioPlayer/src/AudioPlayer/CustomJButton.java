package AudioPlayer;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CustomJButton extends JButton {

	private static final long serialVersionUID = 1L;

	String soundFilename, iconFilename;

	public CustomJButton(String soundFilename, String iconFilename, int posX, int posY, int width, int height) {
		this.soundFilename = soundFilename;
		this.iconFilename = iconFilename;

		setName(soundFilename);
		setIcon(new ImageIcon(iconFilename));
		setBounds(posX, posY, width, height);
	}

}