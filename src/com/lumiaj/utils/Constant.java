package com.lumiaj.utils;

import java.awt.Color;

public class Constant {
	public static final int WINDOWS_X = LoadPro.getConf().getWindows_x();	//窗口横坐标位置
	public static final int WINDOWS_Y = LoadPro.getConf().getWindows_y();		//窗口纵坐标
	public static final int FRAME_WIDTH = LoadPro.getConf().getFrame_width();	//窗口宽度
	public static final int FRAME_HEIGHT = LoadPro.getConf().getFrame_height();	//窗口高度
	public static final int BLOCK_SIZE = LoadPro.getConf().getBlock_size();	//每个格子的大小
	public static final int ROW_NUM = LoadPro.getConf().getRow_num();		//横向格子个数
	public static final int VERTICAL_NUM = LoadPro.getConf().getVertical_num();	//纵向格子个数
	public static final int INITIAL_LENGTH = LoadPro.getConf().getInitial_length();	//蛇初始长度
	public static final int INITIAL_SPEED = LoadPro.getConf().getInitial_speed();//蛇的初始速度
	
	//键盘按键映射
	public static final int UP = LoadPro.getConf().getUp();
	public static final int DOWN = LoadPro.getConf().getDown();
	public static final int LEFT = LoadPro.getConf().getLeft();
	public static final int RIGHT = LoadPro.getConf().getRight();
	
	//颜色
	public static final Color FOOD_COLOR = Color.orange;
	public static final Color SNAKE_COLOR = Color.red;
}
