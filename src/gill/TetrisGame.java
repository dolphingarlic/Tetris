/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gill;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author gill
 */
public class TetrisGame extends ApplicationAdapter {
    
    Sprite background;
    SpriteBatch batch;
    
    @Override
    public void create() {
        Texture tex = new Texture("images/grid.png");
        background = new Sprite(tex);
        background.setPosition(690, 45);
        batch = new SpriteBatch();
    }
    
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0.2f, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        
        batch.begin();
        background.draw(batch);
        batch.end();
    }
    
}
