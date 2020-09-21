package ljudlek;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ljudlek {

	public static void main(String[] args) {

		// skapar frame, knappar och possitionerar dom
		JFrame f = new JFrame("Sound Player");
		JButton sone = new JButton();
		JButton stwo = new JButton();
		JButton sthree = new JButton();
		JButton sfour = new JButton();
		JButton sfive = new JButton();
		JButton ssix = new JButton();
		JButton sseven = new JButton();
		JButton seight = new JButton();
		JButton snine = new JButton();
		
		
		
		
		
		sone.setBounds(25, 25, 100, 60);
		stwo.setBounds(150, 25, 100, 60);
		sthree.setBounds(275, 25, 100, 60);
		sfour.setBounds(25, 150, 100, 60);
		sfive.setBounds(150, 150, 100, 60);
		ssix.setBounds(275, 150, 100, 60);
		sseven.setBounds(25, 275, 100, 60);
		seight.setBounds(150, 275, 100, 60);
		snine.setBounds(275, 275, 100, 60);

		// ger ramen och knapparna bredd och höjd
		f.add(sone);
		f.add(stwo);
		f.add(sthree);
		f.add(sfour);
		f.add(sfive);
		f.add(ssix);
		f.add(sseven);
		f.add(seight);
		f.add(snine);
		f.setSize(400, 450);
		f.setLayout(null);
		f.setVisible(true);

		sone.setIcon(new ImageIcon("hundskralle.jpg"));
		stwo.setIcon(new ImageIcon("gris.jpg"));
		sthree.setIcon(new ImageIcon("elefant.jpg"));
		sfour.setIcon(new ImageIcon("lejon.jpg"));
		sfive.setIcon(new ImageIcon("apa.jpg"));
		ssix.setIcon(new ImageIcon("val.jpg"));
		sseven.setIcon(new ImageIcon("varg.jpg"));
		seight.setIcon(new ImageIcon("orm.jpg"));
		snine.setIcon(new ImageIcon("hast.jpg"));
		
		
		// väljer vilka filer som ska vara kopplade till knappen
		File one = new File("bark.wav");
		File two = new File("ofarm.wav");
		File three = new File("elephantcub.wav");
		File four = new File("lioncub.wav");
		File five = new File("monkey1.wav");
		File six = new File("whale2.wav");
		File seven = new File("wolf8.wav");
		File eight = new File("snakehiss2.wav");
		File nine = new File("animals037.wav");

		// gör actionlitor till varje fil

		sone.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound1(one);
				}

		});

		stwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound2(two);
			}
		});
		sthree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound3(three);
			}
		});

		sfour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound4(four);
			}
		});
		sfive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound5(five);
			}
		});

		ssix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound6(six);
			}
		});
		sseven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound7(seven);
			}
		});

		seight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound8(eight);
			}
		});
		snine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaySound9(nine);
			}
		});

	}

	// gör en try / catch för varje ljudfil.

	static void PlaySound1(File Sound) {
		try {Clip clip = AudioSystem.getClip();
	clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

			}
		}
	

	static void PlaySound2(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound3(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound4(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound5(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound6(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound7(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound8(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

	static void PlaySound9(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}

}
