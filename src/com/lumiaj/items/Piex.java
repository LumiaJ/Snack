package com.lumiaj.items;

import java.awt.Color;
import java.awt.Graphics;

import com.lumiaj.utils.Constant;

public class Piex {
	private int x;
	private int y;
	private Color c;
	public Piex getP() {
		return this;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setC(Color c) {
		this.c = c;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getC() {
		return c;
	}
	public Piex(int x, int y, Color c) {
		super();
		this.x = x;
		this.y = y;
		this.c = c;
	}
	public Piex() {
	}
	public Piex(Color c) {
		this.c = c; 
	}
	public void paint(Graphics g) {
		Color temp = g.getColor();
		g.setColor(c);
		g.fillRect(x*Constant.BLOCK_SIZE, y*Constant.BLOCK_SIZE, Constant.BLOCK_SIZE, Constant.BLOCK_SIZE);
		g.setColor(temp);
	}
	public Piex(Piex p) {
		this.x = p.x;
		this.y = p.y;
		this.c = p.c;
	}
}
