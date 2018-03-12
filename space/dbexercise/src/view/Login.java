package view;

import java.util.Scanner;

import model.dao.UserDao;
import model.vo.User;

/*
 * 登陆界面视图
 */
public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("欢迎使用***超市收银系统，请输入用户名及其密码");
		Scanner scan = new Scanner(System.in);

		System.out.print("用户名：");
		String userName = scan.nextLine();
		System.out.print("密    码：");
		String password = scan.nextLine();

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		UserDao dao = new UserDao();
		/*
		 * 要求用户名及其密码不正确时，可以重新输入，最多能尝试3次
		 */
		if (!dao.checkUser(user)) {
			System.out.println("用户名或密码不正确，请重新输入");
		} else {
			// 显示主界面视图
			(new MainMenu()).diaplay(user);
		}

	}

}
