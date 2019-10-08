/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gill;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 *
 * @author gill
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
