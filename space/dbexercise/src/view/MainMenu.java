package view;

import model.vo.User;

/*
 * ��½�ɹ���������
 */
public class MainMenu {
	
	public void diaplay(User user){
		System.out.println("��ӭʹ��****��������ϵͳ");
		System.out.println("��ǰ�û���"+user.getChrName());
		System.out.println("1.����");
		System.out.println("2.��ѯ");
		System.out.println("3.�˳�");
		System.out.println("��ѡ��1-3����");		
	}

}
