package com.jaseroo.infrun;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	entity player;
	entity rob;
	static List<entity> entities = new ArrayList<entity>();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		

		entity player = new entity(1, 1, 11, "player.png");
	
			
	
	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		for(int i = 0; i < entities.size(); i++){
			entities.get(i).draw(batch);
		}
		
		batch.end();
	}
}
