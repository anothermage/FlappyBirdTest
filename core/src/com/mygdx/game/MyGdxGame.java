package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("ZBGame", "created");
		setScreen(new GameScreen());
	}
}
