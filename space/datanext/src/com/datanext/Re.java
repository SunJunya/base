package com.datanext;


public class Re {
		class Node{   //�ѽڵ��ඨ����ڲ��ࣻ
			private String data;  //�������
			private Node next;
			public Node (String data ) {  //����
				this.data=data;
			}
			/*
			 *������add���� 
			 *�����ж���һ���ڵ��Ƿ�Ϊ�գ�����ǿհ��½ڵ�ŵ�next����������ǿգ����ʾ
			 *�ýڵ㴦�ж�������������һ���ڵ㣬�����ʹ��add��������һ��λ�ô���ӡ�
			 * */
			public void add(Node newNode) {
				if(this.next==null){    
					this.next=newNode;
				}else {
					this.next.add(newNode);
				}
			}
			/*
			 * ������print���������
			 * �����ǰ�ڵ�
			 * �����һ���ڵ㲻Ϊ�ռ���print���������һ������
			 * */
			public void print() {
				System.out.println(this.data+"\t");
				if(this.next!=null){
					this.next.print();
				}
			}
			/*
			 * �з���ֵ��boolean equals������
			 * �ж������ַ����������Ƿ���ͬ
			 * java��string���õĲ�������
			 * 
			 * �з���ֵ��boolean search����	
			 * �ڲ������������� 
			 * */
			public boolean search(String data) {
				if(data.equals(this.data)){//�жϵ�ǰ�ڵ�������Ƿ������һ�£�
					return true;//���һ�£�����true
				}else{//�����һ�¼����ж���һ���ڵ�
					if (this.next!=null) {//��һ���ڵ���ڣ���������
						return this.next.search(data);//������һ���Ĳ�ѯ���
					}else {
						return false;//�ڵ㲻���ڣ�����false
					}
				}
				
			}
			/*
			 * ɾ���ڵ�Ĳ���
			 * 
			 */
			public void delete(Node previous,String data) {
				if(data.equals(this.data)){//�ҵ�ƥ��ڵ�
					previous.next=this.next;//�ճ��ڵ�
				}else{
					if (this.next!=null) {
						this.next.delete(this, data);//������
					}
				}
			}
		};//�ڲ���ֺţ�
		private Node root;//���ڵ�
		public void addNode(String data) {//��ӽڵ�Ĳ���
			Node newNode =new Node(data);//�����µĽڵ�
			if(this.root==null){
				this.root=newNode;//������ڵ�Ϊ�գ�����һ���ڵ���Ϊ���ڵ�
				
			}else {
				this.root.add(newNode);//���ڲ���Ĳ�������ں��ʵ�λ��
			}
		}
		public void printNode() {
			if(this.root!=null){
				this.root.print();//���ڸ��ڵ��ӡ�ڵ�
			}
		}
		public boolean contains(String name) {
			return this.root.search(name);//����
		}
		public void deleteNode(String data) {
			if(this.contains(data)){
				if(this.root.equals(data)){//�жϸ��ڵ��Ƿ�Ϊ��Ҫɾ���Ľڵ�
					this.root=this.root.next;//�����ڵ�֮���������ɸ��ڵ㡣
				}else {
					this.root.next.delete(root, data);//ɾ�����ڵ�
				}
			}
		}	


}
