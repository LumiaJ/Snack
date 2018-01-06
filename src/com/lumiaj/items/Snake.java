package com.lumiaj.items;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lumiaj.utils.Constant;

public class Snake {
	private List<Piex> snk;
	private Color c;
	private String direction;
	private Date eTime, bTime;
	private int time, _dNum;
	
	public Piex[] getSnake() {
		return snk.toArray(new Piex[0]);
	}
	
	private void grow() {
		snk.add(new Piex(-1,-1,c));
	}
	
	public boolean isAlive() {
		Piex head = snk.get(0);
		for(int i=1; i<snk.size();i++) {
			if(head.getX() == snk.get(i).getX() && head.getY() == snk.get(i).getY()) return false;
		}
		return true;
	}
	
	public boolean eat(Piex food) {
		if(food.getX() == snk.get(0).getX() && food.getY() == snk.get(0).getY()) {
			grow();
			return true;
		}
		return false;
	}
	
	public void turn(int code) {
		if(code==Constant.LEFT) {
			if(direction.equals("right") || direction.equals("left")) {return;
			}else {direction = "left"; return;}
		}else if(code==Constant.UP) {
			if(direction.equals("up") || direction.equals("down")) {return;
			}else {direction = "up";return;}
		}else if(code==Constant.RIGHT) {
			if(direction.equals("right") || direction.equals("left")) {return;
			}else {direction = "right";return;}
		}else if(code==Constant.DOWN) {
			if(direction.equals("up") || direction.equals("down")) {return;
			}else {direction = "down";return;}
		}
	}
	
	private void isOut(int i) {
		if(snk.get(i).getX()>Constant.ROW_NUM-1 || snk.get(i).getY()>Constant.VERTICAL_NUM-1
				|| snk.get(i).getX()<0 || snk.get(i).getY()<0) {
			back(i);
		}
	}
	
	private void back(int i) {
		if(snk.get(i).getX()>Constant.ROW_NUM-1) {
			snk.get(i).setX(0);
		}
		if(snk.get(i).getX()<0) {
			snk.get(i).setX(Constant.ROW_NUM-1);
		}
		if(snk.get(i).getY()>Constant.VERTICAL_NUM-1) {
			snk.get(i).setY(0);
		}
		if(snk.get(i).getY()<0) {
			snk.get(i).setY(Constant.VERTICAL_NUM-1);
		}
	}
	
	private void controlSpeed() {
		eTime = new Date();
		if((int)(eTime.getTime()-bTime.getTime())-time>_dNum) {//方块下落的时间、难度
			move();
			time+=_dNum;
		}
	}
	
	public void move() {
		
		Piex temp;
		Piex next = new Piex(snk.get(0));
		
		//运行轨迹
		if(direction.equals("up"))
			next.setY(next.getY()-1);
		else if(direction.equals("down"))
			next.setY(next.getY()+1);
		else if(direction.equals("left"))
			next.setX(next.getX()-1);
		else if(direction.equals("right"))
			next.setX(next.getX()+1);
		
		for(int i=0;i<snk.size();i++) {
			temp = new Piex(snk.get(i));
			snk.set(i, new Piex(next));
			next = new Piex(temp);
			isOut(i);
		}
	}
	
	public void paint(Graphics g) {
		for(Piex p : snk) {
			p.paint(g);
		}
		this.controlSpeed();
	}
	
	public Snake() {
		this.snk = new ArrayList<Piex>();
		this._dNum = Constant.INITIAL_SPEED;
		this.time = 0;
		this.bTime = new Date();
		//颜色
		this.c = Constant.SNAKE_COLOR;
		//初始长度
		Piex p0 = new Piex(Constant.VERTICAL_NUM/2,
				Constant.ROW_NUM/2, c);
//		snk.add(p0);
		for(int i=0;i<Constant.INITIAL_LENGTH;i++) {
			this.snk.add(new Piex(p0.getX()-i,p0.getY(),c));
		}
		this.direction = "right";
	}
}
