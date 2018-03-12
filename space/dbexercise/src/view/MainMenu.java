package view;

import model.vo.User;

/*
 * 登陆成功后主界面
 */
public class MainMenu {
	
	public void diaplay(User user){
		System.out.println("欢迎使用****超市收银系统");
		System.out.println("当前用户："+user.getChrName());
		System.out.println("1.收银");
		System.out.println("2.查询");
		System.out.println("3.退出");
		System.out.println("请选择（1-3）：");		
	}

}
