package view;

import java.util.Scanner;

import model.dao.UserDao;
import model.vo.User;

/*
 * ��½������ͼ
 */
public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ӭʹ��***��������ϵͳ���������û�����������");
		Scanner scan = new Scanner(System.in);

		System.out.print("�û�����");
		String userName = scan.nextLine();
		System.out.print("��    �룺");
		String password = scan.nextLine();

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		UserDao dao = new UserDao();
		/*
		 * Ҫ���û����������벻��ȷʱ�������������룬����ܳ���3��
		 */
		if (!dao.checkUser(user)) {
			System.out.println("�û��������벻��ȷ������������");
		} else {
			// ��ʾ��������ͼ
			(new MainMenu()).diaplay(user);
		}

	}

}
