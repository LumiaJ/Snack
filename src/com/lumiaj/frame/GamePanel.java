package com.lumiaj.frame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import com.lumiaj.items.Food;
import com.lumiaj.items.Snake;
import com.lumiaj.utils.Constant;

@SuppressWarnings("all")
public class GamePanel extends JPanel{
	private Food f;
	private Snake s;
	private int score;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		if(!s.isAlive()) {
			g.setFont(new Font("微软雅黑",Font.CENTER_BASELINE,30));
			g.drawString("最后得分是："+score, Constant.FRAME_WIDTH/3, (int)(Constant.FRAME_WIDTH/3));
		}else {
//			drawBlock(g);
			f.paint(g);
			s.paint(g);
			if(s.eat(f.getP())) {
				f.newOne(g, s.getSnake());
				score++;
			}
		}
	}
	
	private void drawBlock(Graphics g) {
		for(int row = 0; row<=Constant.ROW_NUM;row++) {
			g.drawLine(row*Constant.BLOCK_SIZE, 0, row*Constant.BLOCK_SIZE, Constant.VERTICAL_NUM*Constant.BLOCK_SIZE);
		}
		for(int ver = 0; ver<=Constant.ROW_NUM;ver++) {
			g.drawLine(0, ver*Constant.BLOCK_SIZE, Constant.ROW_NUM*Constant.BLOCK_SIZE, ver*Constant.BLOCK_SIZE);
		}
	}
	
	public class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			s.turn(e.getKeyCode());
		}
		
	}
	
	public GamePanel() {
		f = new Food();
		s = new Snake();
		this.score = 0;
	}
	
}
