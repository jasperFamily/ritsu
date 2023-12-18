import java.io.File;
import java.util.Scanner;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class BGM {
	
	public static void main(String [] args) throws Exception {
		//MIDIでBGMを再生するシンセサイザ（シーケンサ）の準備
		Sequencer seq = MidiSystem.getSequencer();
		seq.open();


		seq.setLoopCount(-1);


		
		//クリスマスのベルの音をWAVから読み取る準備
		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));
		Clip Clip = AudioSystem.getClip();
		Clip.open(ais);
		
		System.out.println("メリークリスマス!");
		System.out.println("何か入力すると三回だけベルがなるよ");
		
		for (int i = 0; i < 4; i++) {
			new Scanner(System.in).nextLine(); //任意の入力を待つ
			Clip.start();
			Clip.setFramePosition(0);
			
		}
		//サンプリング音声の終了
		Clip.stop();
		ais.close();
		//MIDIシンセサイザの終了
		seq.stop();
		seq.close();
	}

}