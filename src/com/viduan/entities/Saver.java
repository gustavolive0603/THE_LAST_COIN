package com.viduan.entities;

import java.awt.image.BufferedImage;

import com.viduan.main.Game;

public class Saver extends Entity {

	public Saver(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
		// TODO Auto-generated constructor stub
		
	}
	public void tick() {
		depth=3;
	}
	
	public static void salvando() {
		Game.saveGame=true;
		System.out.println("To rodando");
		
	}

}