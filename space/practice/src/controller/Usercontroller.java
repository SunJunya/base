package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;
import dao.Usermapper;

public class Usercontroller {
      public void loginin(User user) {
    	  ResultSet rSet=null;
    	  Usermapper usermapper=new Usermapper();
    	  rSet=usermapper.loginin(user);
    	  if(rSet!=null){
    		  try {
				while(rSet.next()){
					if("T".equals(rSet.getString("Index"))){
						System.out.println("��ӭ"+rSet.getString("UserName")+"��ʦ��¼�ɹ�");
					}else if ("S".equals(rSet.getString("Index"))) {
						System.out.println("��ӭ"+rSet.getString("UserName")+"ѧ����¼�ɹ�");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		  
    	  }else{
    		  System.out.println("�û������������,����������");
    	  }
    	  
		
	}
      public static void main(String[] args) {
		Usercontroller usercontroller=new Usercontroller();
		User usert=new User("123","123");
		User users=new User("suliya","suliya");
		usercontroller.loginin(usert);
		usercontroller.loginin(users);
	}
}