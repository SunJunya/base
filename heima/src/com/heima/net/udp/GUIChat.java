package com.heima.net.udp;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUIChat extends Frame{
	private TextField tf;
	private TextArea viewText;
	private TextArea sendText;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private DatagramSocket socket;
	private BufferedWriter bw;

	/*
	 * GUI����
	 * */
	
	public GUIChat(){
		init();//�������ô���
		southPanel();
		centerPanel();
		Event();
	}

	private void Event() {
		this.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 
				 try {
					socket.close();
					 bw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				 
				 System.exit(0);
			 }
		});
		
		
		//��������
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

			
		});
		
		//��¼����
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

			private void logFile() throws IOException {
				bw.flush();
				FileInputStream fis = new FileInputStream("config.txt");
				ByteArrayOutputStream baos = new ByteArrayOutputStream();//���ڴ��д���������
				int len=0;
				byte[] arr = new byte[8192];
				while((len=fis.read(arr)) != -1){
					baos.write(arr,0,len);
				}
				
				String str =baos.toString();
				viewText.setText(str);
				fis.close();
			}
		});
		
		//��������
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
		
		//�𶯼���
		shake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[]{-1},tf.getText());
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

			
		});
		
		sendText.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown())
					try {
						send();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
			}
		});
		
	}
	
	private void shake() {
		int x = this.getLocation().x;
		int y = this.getLocation().y;
		
		for(int i=0 ;i<5;i++){
			try {
				this.setLocation(x+20, y+20);
				Thread.sleep(20);
				this.setLocation(x+20, y-20);
				Thread.sleep(20);
				this.setLocation(x-20, y+20);
				Thread.sleep(20);
				this.setLocation(x-20, y-20);
				Thread.sleep(20);
				this.setLocation(x, y);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
	private void send(byte[] arr , String ip) throws IOException{
		DatagramPacket packet = new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 6666);
		socket.send(packet);
	}
	
	
	private void send() throws IOException {
		String messge = sendText.getText();  //��ȡ������������ݣ�
		String ip = tf.getText() ; // ��ȡip��ַ
		
		ip=ip.trim().length()==0?"255.255.255.255" : ip;
		
		send(messge.getBytes(),ip);
		
		String time = getCurrentTime();
		String str = time+" �Ҷ�  "+(ip.equals("255.255.255.255")?"������":ip)+" ˵:"+"\r\n"+messge+"\r\n";
		viewText.append(str);
		bw.write(str);
		sendText.setText("");
	}
	
	private String getCurrentTime() {
		Date d = new Date();  //������ǰ���ڶ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		
		return sdf.format(d);  //��ʱ���ʽ��
	}

	private void centerPanel() {
		Panel center = new Panel();
		sendText = new TextArea(5,1);
		viewText = new TextArea();
		center.setLayout(new BorderLayout());
		center.add(sendText, BorderLayout.SOUTH);
		center.add(viewText, BorderLayout.CENTER);
		viewText.setEditable(false);  		 //viewText���ò����Ա༭
		viewText.setBackground(Color.WHITE); //���ñ�����ɫ
		sendText.setFont(new Font("test", Font.PLAIN, 20));
		viewText.setFont(new Font("test", Font.PLAIN, 20));
		this.add(center);
	}

	private void southPanel() {
		Panel south = new Panel();   //���������panel
		tf = new TextField(15);
		tf.setText("127.0.0.1");
		send = new Button("����");
		log = new Button("��¼");
		clear = new Button("����");
		shake = new Button("��");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south, BorderLayout.SOUTH);
	}

	private void init() {
		//��������
		this.setLocation(500,50);  //����λ��
		this.setSize(400, 600);    //���ô�С
		this.setVisible(true);     //������ʾ
		new Recive().start();
		try {
			socket = new DatagramSocket();
			bw = new BufferedWriter(new FileWriter("config.txt",true));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	class Recive extends Thread{ //���պͷ�����Ҫͬʱִ�У�������Ҫ���߳�
		public void run(){
			try {
				DatagramSocket socket = new DatagramSocket(6666);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				while(true){
					socket.receive(packet);
					byte[] arr = packet.getData();
					int len = packet.getLength();
					
					if(arr[0]==-1 && len ==1){
						shake();continue;
					}
					

					String remess = new String(arr, 0, len);
					
					String ip =packet.getAddress().getHostAddress();
					String time = getCurrentTime();
					String str = time+"  "+ip+" ����˵:"+"\r\n"+remess+"\r\n";
					viewText.append(str);
					bw.write(str);
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		new GUIChat();
	}
	
	
}














