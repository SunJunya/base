package com.datanext;


public class Re {
		class Node{   //把节点类定义成内部类；
			private String data;  //类的属性
			private Node next;
			public Node (String data ) {  //方法
				this.data=data;
			}
			/*
			 *方法；add操作 
			 *首先判断下一个节点是否为空；如果是空把新节点放到next处；如果不是空，则表示
			 *该节点处有东西，还存在下一个节点，则继续使用add方法在下一个位置处添加。
			 * */
			public void add(Node newNode) {
				if(this.next==null){    
					this.next=newNode;
				}else {
					this.next.add(newNode);
				}
			}
			/*
			 * 方法：print函数，输出
			 * 输出当前节点
			 * 如果下一个节点不为空继续print函数输出下一个函数
			 * */
			public void print() {
				System.out.println(this.data+"\t");
				if(this.next!=null){
					this.next.print();
				}
			}
			/*
			 * 有返回值的boolean equals方法，
			 * 判断两个字符串的内容是否相同
			 * java中string常用的操作方法
			 * 
			 * 有返回值的boolean search函数	
			 * 内部定义搜索方法 
			 * */
			public boolean search(String data) {
				if(data.equals(this.data)){//判断当前节点的名字是否与查找一致；
					return true;//如果一致，返回true
				}else{//如果不一致继续判断下一个节点
					if (this.next!=null) {//下一个节点存在，继续查找
						return this.next.search(data);//返回下一个的查询结果
					}else {
						return false;//节点不存在，返回false
					}
				}
				
			}
			/*
			 * 删除节点的操作
			 * 
			 */
			public void delete(Node previous,String data) {
				if(data.equals(this.data)){//找到匹配节点
					previous.next=this.next;//空出节点
				}else{
					if (this.next!=null) {
						this.next.delete(this, data);//继续找
					}
				}
			}
		};//内部类分号；
		private Node root;//根节点
		public void addNode(String data) {//添加节点的操作
			Node newNode =new Node(data);//建立新的节点
			if(this.root==null){
				this.root=newNode;//如果根节点为空，将第一个节点设为根节点
				
			}else {
				this.root.add(newNode);//用内部类的操作添加在合适的位置
			}
		}
		public void printNode() {
			if(this.root!=null){
				this.root.print();//存在根节点打印节点
			}
		}
		public boolean contains(String name) {
			return this.root.search(name);//查找
		}
		public void deleteNode(String data) {
			if(this.contains(data)){
				if(this.root.equals(data)){//判断根节点是否为所要删除的节点
					this.root=this.root.next;//将根节点之后的内容设成根节点。
				}else {
					this.root.next.delete(root, data);//删除根节点
				}
			}
		}	


}
