package com.lumiaj.utils;

import java.io.IOException;
import java.util.Properties;

public class LoadPro {
	
	private static Configration conf;
	
	static {
		conf = new Configration();
		Properties pro = new Properties();
		try {
			pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/lumiaj/constants.properties"));
			conf.setBlock_size(Integer.parseInt(pro.getProperty("block_size")));
			conf.setDown(Integer.parseInt(pro.getProperty("down")));
			conf.setFrame_width(Integer.parseInt(pro.getProperty("frame_width")));
			conf.setFrame_height(Integer.parseInt(pro.getProperty("frame_height")));
			conf.setInitial_length(Integer.parseInt(pro.getProperty("initial_length")));
			conf.setInitial_speed(Integer.parseInt(pro.getProperty("initial_speed")));
			conf.setLeft(Integer.parseInt(pro.getProperty("left")));
			conf.setRight(Integer.parseInt(pro.getProperty("right")));
			conf.setRow_num(Integer.parseInt(pro.getProperty("row_num")));
			conf.setUp(Integer.parseInt(pro.getProperty("up")));
			conf.setVertical_num(Integer.parseInt(pro.getProperty("vertical_num")));
			conf.setWindows_x(Integer.parseInt(pro.getProperty("windows_x")));
			conf.setWindows_y(Integer.parseInt(pro.getProperty("windows_y")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Configration getConf() {
		return conf;
	}
	
}
