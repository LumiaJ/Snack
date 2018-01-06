package com.lumiaj.frame;

import javax.swing.JFrame;

import com.lumiaj.utils.Constant;

@SuppressWarnings("all")
public class GameFrame extends JFrame{
	private GamePanel gp;
	
	public void start() {
		while(true) {
			gp.repaint();
		}
	}
	
	public GameFrame() {
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(Constant.WINDOWS_X, Constant.WINDOWS_Y, Constant.FRAME_WIDTH, Constant.FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp = new GamePanel();
		this.add(gp);
		this.addKeyListener(gp.new KeyMonitor());
	}
	
	public static void main(String[] args) {
		new GameFrame().start();
	}
}
