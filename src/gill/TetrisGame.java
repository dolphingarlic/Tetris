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
    Sprite[] blocks;

    SpriteBatch batch;
    
    int BOARD_HEIGHT = 20, BOARD_WIDTH = 10;
    int[][] board = new int[BOARD_HEIGHT][BOARD_WIDTH];
    
    @Override
    public void create() {
        Texture tex = new Texture("images/grid.png");
        background = new Sprite(tex);
        background.setPosition(690, 45);
        batch = new SpriteBatch();
        
        blocks = new Sprite[8];
        for (int i = 1; i < 8; i++) {
            tex = new Texture("images/block" + i + ".png");
            blocks[i] = new Sprite(tex);
        }
    }
    
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0.2f, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        
        
        batch.begin();
        background.draw(batch);
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                board[i][j] = (int)Math.floor(Math.random() * 7) + 1;
                
                Sprite block = blocks[board[i][j]];
                block.setPosition(735 + 45 * j, 90 + 45 * i);
                block.draw(batch);
            }
        }
        batch.end();
    }
    
}
