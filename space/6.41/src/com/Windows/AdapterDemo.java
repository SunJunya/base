package com.Windows;
//���������ʵ�֣�

import java.awt.Window;

import javax.sound.midi.VoiceStatus;

interface Windows{
	public void close();
	public void open();
	public void activated();
	public void iconified();
	public void deiconified();
}
//���������ʵ�ֽӿ�
abstract class WindowAdapter implements Windows{
	public void activated(){}
	public void close(){}
	public void open(){}
	public void iconified(){}
	public void deiconified(){}
}
//����ֱ�Ӽ̳�WIndowAdapter�࣬��ѡ���ʵ����Ҫ�ķ���
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("���ڴ򿪡�");
	}
	public void close(){
		System.out.println("���ڹرա�");
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
