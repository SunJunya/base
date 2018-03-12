package com.Windows;
//适配器设计实现；

import java.awt.Window;

import javax.sound.midi.VoiceStatus;

interface Windows{
	public void close();
	public void open();
	public void activated();
	public void iconified();
	public void deiconified();
}
//定义抽象类实现接口
abstract class WindowAdapter implements Windows{
	public void activated(){}
	public void close(){}
	public void open(){}
	public void iconified(){}
	public void deiconified(){}
}
//子类直接继承WIndowAdapter类，有选择的实现需要的方法
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("窗口打开。");
	}
	public void close(){
		System.out.println("窗口关闭。");
	}
}



public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Windows win =new WindowImpl();
        win.open();
        win.close();
	}

}
