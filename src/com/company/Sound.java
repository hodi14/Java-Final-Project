package com.company;

import java.io.File;
import java.io.IOException;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Sound {

    // to store current position
    private Clip clip;

    // current status of clip
    private String status;

    private AudioInputStream audioInputStream;
    static String filePath;

    // constructor to initialize streams and clip
    Sound()
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException {
        // create AudioInputStream object
        audioInputStream =
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

    }

    // Method to play the audio
    void play()
    {
        //start the clip
        clip.start();

        status = "play";
    }


}
