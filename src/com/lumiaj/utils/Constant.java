package com.lumiaj.utils;

import java.awt.Color;

public class Constant {
	public static final int WINDOWS_X = LoadPro.getConf().getWindows_x();	//���ں�����λ��
	public static final int WINDOWS_Y = LoadPro.getConf().getWindows_y();		//����������
	public static final int FRAME_WIDTH = LoadPro.getConf().getFrame_width();	//���ڿ��
	public static final int FRAME_HEIGHT = LoadPro.getConf().getFrame_height();	//���ڸ߶�
	public static final int BLOCK_SIZE = LoadPro.getConf().getBlock_size();	//ÿ�����ӵĴ�С
	public static final int ROW_NUM = LoadPro.getConf().getRow_num();		//������Ӹ���
	public static final int VERTICAL_NUM = LoadPro.getConf().getVertical_num();	//������Ӹ���
	public static final int INITIAL_LENGTH = LoadPro.getConf().getInitial_length();	//�߳�ʼ����
	public static final int INITIAL_SPEED = LoadPro.getConf().getInitial_speed();//�ߵĳ�ʼ�ٶ�
	
	//���̰���ӳ��
	public static final int UP = LoadPro.getConf().getUp();
	public static final int DOWN = LoadPro.getConf().getDown();
	public static final int LEFT = LoadPro.getConf().getLeft();
	public static final int RIGHT = LoadPro.getConf().getRight();
	
	//��ɫ
	public static final Color FOOD_COLOR = Color.orange;
	public static final Color SNAKE_COLOR = Color.red;
}
