package AudioPlayer;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CustomJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static Clip clip;

	final String[] sounds = { "bark.wav", "big_pig_snort.wav", "elephantcub.wav", "wolf8.wav", "lioncub.wav",
			"monkey1.wav", "snakehiss2.wav", "Whale2.wav", "animals037.wav" };
	final String[] icons = { "hundskralle.jpg", "gris.jpg", "elefant.jpg", "varg.jpg", "lejon.jpg", "apa.jpg",
			"orm.jpg", "val.jpg", "hast.jpg" };

	final int number_of_sounds = sounds.length;
	final int buttonHeight = 60, buttonWidth = 100;
	final int buttonOffsetX = buttonWidth + 20, buttonOffsetY = 50;
	int x = 25;
	int y = 90;

	CustomJFrame() {
	}

	CustomJFrame(String name) {
		// add all the buttons
		for (int count = 0; count < number_of_sounds; count++) {
			final CustomJButton b = new CustomJButton(sounds[count], icons[count], x, y, buttonWidth, buttonHeight);

			b.addActionListener(this);
			this.add(b);

			x += buttonOffsetX;
		}
	}

	// this is the method that gets called whenever a button recieves an action
	public void actionPerformed(ActionEvent evt) {
		CustomJButton btn = (CustomJButton) evt.getSource();
		try {
			// stop possible playing clips
			if (clip != null && clip.isActive())
				clip.stop();
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File(btn.getName())));
			clip.start();
		} catch (final Exception e) {
			System.out.println("Ouch, something went wrong when trying to play sound..." + btn.getText());
		}
	}
}
