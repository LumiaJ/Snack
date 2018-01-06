package com.lumiaj.items;

import java.awt.Graphics;

import com.lumiaj.utils.Constant;

public class Food {
	private Piex p;
	
	public Piex getP() {
		return p;
	}
	
	public void newOne(Graphics g, Piex[] snk) {
		p.setX((int)(Math.random()*Constant.ROW_NUM));
		p.setY((int)(Math.random()*Constant.VERTICAL_NUM));
		onceMore:
		for(Piex s : snk) {
			if(p.getX()==s.getX() && p.getY()==s.getY()) {
				p.setX((int)(Math.random()*Constant.ROW_NUM));
				p.setY((int)(Math.random()*Constant.VERTICAL_NUM));
				continue onceMore;
			}
		}
			
		this.paint(g);
	}
	
	public void paint(Graphics g) {
		p.paint(g);
	}
	
	public Food() {
		p = new Piex(Constant.FOOD_COLOR);
		p.setX((int)(Math.random()*Constant.ROW_NUM));
		p.setY((int)(Math.random()*Constant.VERTICAL_NUM));
	}
	
}
