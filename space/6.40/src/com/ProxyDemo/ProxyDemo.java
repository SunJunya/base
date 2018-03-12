package com.ProxyDemo;
//´úÀí²Ù×÷
interface Network{
	public void browse();
}

class Real implements Network{
	public void browse(){
		System.out. println("browse");
	} 
}

class Proxy implements Network{
	private Network network;
	public Proxy(Network network){
		this.network=network;
	}
	public void check(){
		System.out.println("check if it is legal");
	}
	public void browse(){
		this.check();
		this.network.browse();
	}
}

public class ProxyDemo {
     public static void main(String args[]){
    	 Network net=new Proxy(new Real());
    	 net.browse();
     }
}
