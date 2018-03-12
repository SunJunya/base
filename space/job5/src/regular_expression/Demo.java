package regular_expression;

public class Demo {

	public static Boolean userNameValid(String name) {
		return name.matches("^[a-zA-Z][a-zA-Z0-9_]{2,9}$");
		/*^:匹配字符串的开头位置
		 * []:匹配其中的一个字符
		 * {n,m}:匹配[a-zA-Z0-9_]至少 n 次，至多 m 次
		 * $:匹配字符串的结尾位置
		 * 
		 * 表示以大写或小写的字母开头，后面只能出现大小写的字母，或者数字，或者下划线，且长度为2-9，并且以此作为结尾。
		 * */
	}


	public static Boolean passWordValid(String pw) {
		return pw.matches("^[a-zA-Z0-9]{6,10}$");
		/*^:匹配字符串的开头位置
		 * [a-zA-Z0-9]:匹配a-z,或者A-Z,或者0-9其中的一个字符
		 * {6,10}:匹配[a-zA-Z0-9]最少6次，最多10次
		 * 
		 * 匹配长度为6到10的字符串，且只有字母和数字组成。
		 * */
	}
	public static Boolean mobilePhoneValid(String phone) {
		return phone.matches("^1(3[0-9]|4[57]|5[0-35-9]|7[01678]|8[0-9])\\d{8}$");
		/*x|y:匹配x或y
		 * \\d:匹配一个数字
		 * {8}:匹配数字刚好匹配八次
		 * 
		 * 以1开头，二三位数字为3[0-9]或者4[57]或者5[0-35-9]或者7[01678]或者8[0-9]
		 * [0-9]表示0-9中的一个数字，[57]表示5或者7，[0-35-9]表示0-3或者5-9
		 * [01678]表示01678其中的一个，
		 * 最后匹配8位数字。
		 * */
	}
	public static Boolean telephoneValid(String tele) {
		return tele.matches("\\d{3,5}-\\d{7,8}(-\\d{1,})?");
		/*\\d{3,5}：匹配数字至少3次，最多5次
		 * -：匹配字符‘-’
		 * \\d{7,8}：匹配数字至少7次，最多8次
		 * (pattern)：匹配 pattern 并捕获该匹配的子表达式
		 * \\d{1,}：匹配数字至少1次
		 * ？：匹配尽可能短的字符
		 * 
		 * 两个-连接的三段数字，第一段长度为3-5，第二段长度为7或者8，最后一段最短为1；
		 * */
	}
	public static Boolean qqValid(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");
		/*
		 *第一个是1-9其中的数字，后面是0-9其中的数字，且后面的长度为4到14；
		 * */
	}
	public static Boolean idValid(String id) {
		return id.matches("^\\d{15}$|^\\d{17}(\\d|X|x)$");
		/*^\\d{15}$:15个数字
		 * ^\\d{17}(\\d|X|x)$:以17个数字开头，最后一位是0-9其中的一个数字，或者是X，或者是x;
		 * */
	}
	public static Boolean emailValid(String email) {
		return email.matches("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$");
		/*\\w: 匹配一个任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。
		 * + : 一次或多次匹配前面的字符或子表达式
		 * \\.:匹配字符’.‘。
		 * \\w+：一次或多次匹配[A-Za-z0-9_]
		 *'*'：零次或多次匹配前面的字符或子表达式
		 *(\\.\\w+)+：匹配一个.  一次或多次匹配[A-Za-z0-9_]
		 *

		 * */
	}
	public static Boolean websiteValid(String ws) {
		return ws.matches("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+)[.])+([A-Za-z0-9-~/])+$");
		/*[hH][tT]{2}[pP]：匹配字符串中字符有大写或者小写的http
		 * ://：匹配://
		 * [hH][tT]{2}[pP][sS]：匹配字符串中字符有大写或者小写的httphttps
		 * ([A-Za-z0-9-~]+)：一次或多次匹配A-Z或者a-z或者0-9或者_或者~其中的一个字符
		 * 
		 * */
	}
	public static Boolean birthDateValid(String bd) {
		return bd.matches("(\\d{4}[.]\\d{2}[.]\\d{2})|(\\d{4}[-]\\d{2}[-]\\d{2})");
		/*\\d{4}：匹配4个数字
		 * \\d{2}：匹配2个数字
		 * 
		 * 匹配如下格式的字符串：1997.10.09或者1997-10-09
		 * */
	}
	public static Boolean chineseNameValid(String cn) {
		return cn.matches("[\u4E00-\u9FA5]{2,5}");
		/*[\u4E00-\u9FA5]  :匹配一个中文字符
		 * 
		 * 匹配中文字符最少2个，最长3个。
		 * */
	}
	public static void main(String[] args) {
		System.out.println(Demo.birthDateValid("1997.10.09"));
	    System.out.println(Demo.chineseNameValid("孙君雅")); 
	    System.out.println(Demo.websiteValid("http://127.0.0.1"));
	    System.out.println(Demo.emailValid("1576200085@qq.com"));
	    System.out.println(Demo.idValid("123456789012345678"));
	    System.out.println(Demo.qqValid("1576200085"));
	    System.out.println(Demo.telephoneValid("021-80217000"));
	    System.out.println(Demo.mobilePhoneValid("15927188503"));
	    System.out.println(Demo.passWordValid("123456"));
	    System.out.println(Demo.userNameValid("suliya"));
	    
	    
	}

}
