package com.kirill.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kirill.game.WallsBall;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = WallsBall.WIDTH;
		config.height = WallsBall.HEIGTH;
		config.title = WallsBall.TITLE;
		new LwjglApplication(new WallsBall(), config);
	}
}
