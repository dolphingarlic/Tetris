package tetris;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 *
 * @author Andi Qu
 */
public class TetrisLauncher {
    
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration(); 
        config.title = "Tetris";
        config.width = 1920;
        config.height = 1080;
        config.fullscreen = false;
        new LwjglApplication(new TetrisGame(), config);
    }
}
