package GameEngine;
import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sound {
    private Media soundFile;
    private MediaPlayer player;
    

    public void Sound(String filename) {
        // Assuming "sound.mp3" is in a folder named "sound" within your project
        this.player = player;
        String path = "sound/sound1.mp3" ;
        soundFile = new Media(new File(path).toURI().toString());
        player = new MediaPlayer(soundFile);
        
    }
  
    


    

    // Add other methods for stopping, pausing, looping, etc. as needed
}
 
