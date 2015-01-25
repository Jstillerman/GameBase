package com.jaseroo.infrun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class entity {
	int life;
	int posX;
	int posY;

	Texture tex;
	
	public entity(int x, int y, int life, String text) {
		MainGame.entities.add(this);
		
		this.tex = new Texture(text);
		
		posX = x; posY = y;
		this.life = life;
	}

	public String status() {
		return ("Life is " + life + " Position is " + posX +" "+ posY);
	
		
	}
	
	public void draw(SpriteBatch b){
		b.draw(tex, posX, posY);
		
	}
	

}
