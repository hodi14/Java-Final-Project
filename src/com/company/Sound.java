package com.company;

import java.io.File;
import java.io.IOException;


import javax.sound.sampled.*;

class Sound {

    // to store current position
    private Clip clip;
    static String filePath;

    // constructor to initialize streams and clip
    Sound()
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException {
        // create AudioInputStream object
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        AudioFormat format = audioInputStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);

        // create clip reference
        clip = (Clip) AudioSystem.getLine(info);

        // open audioInputStream to the clip
        clip.open(audioInputStream);

    }

    // Method to play the audio
    void play()
    {
        //start the clip
        clip.start();

    }


}
