package com.knuseski.myfarm;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.knuseski.myfarm.state.GSM;
import com.knuseski.myfarm.state.PlayState;

public class CM extends ApplicationAdapter {

	public static final String TITLE = "My Farm!";
	public static int WIDTH = 1026;
	public static int HEIGHT = 768;

	private SpriteBatch sb;
	private GSM gsm;

	@Override
	public void create() {
		Gdx.gl.glClearColor(.9f, .9f, .9f, 1);

		sb = new SpriteBatch();

		gsm = new GSM();
		gsm.push(new PlayState(gsm));
	}

	@Override
	public void render() {
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(sb);
	}
}