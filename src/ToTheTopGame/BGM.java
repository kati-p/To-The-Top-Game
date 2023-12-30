package ToTheTopGame;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

/**
 *
 * @author Xvariable
 */
public class BGM {

    private static Clip clip;

    public BGM() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //new file
        File file = new File("src\\bgm\\Kirby_s-Return-to-Dream-Land-Title-Theme-8-Bit-Remix.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        //get clip
        clip = AudioSystem.getClip();

        //open file clip
        clip.open(audioStream);

        //set volume
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        double percent = 0.1;   // set the percent (between 0.0 and 1.0)
        float dB = (float) (Math.log(percent) / Math.log(10.0) * 20.0);
        volume.setValue(dB);

        //play clip
        while (true) {
            if (clip.getMicrosecondPosition() == 0) {
                clip.start();
            } else if (clip.getMicrosecondPosition() == clip.getMicrosecondLength()) {
                clip.stop();
                clip.setMicrosecondPosition(0);
            }
        }

    }
}
