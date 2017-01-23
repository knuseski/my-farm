package com.knuseski.myfarm.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlayState extends State {
	
	public PlayState(GSM gsm) {
		super(gsm);
		
	}

	@Override
	public void update(float dt) {
	}

	@Override
	public void render(SpriteBatch sb) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sb.setProjectionMatrix(cam.combined);
		sb.begin();
		
		
		
		sb.end();
	}
}
