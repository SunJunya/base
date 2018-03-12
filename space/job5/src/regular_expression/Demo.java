package regular_expression;

public class Demo {

	public static Boolean userNameValid(String name) {
		return name.matches("^[a-zA-Z][a-zA-Z0-9_]{2,9}$");
		/*^:ƥ���ַ����Ŀ�ͷλ��
		 * []:ƥ�����е�һ���ַ�
		 * {n,m}:ƥ��[a-zA-Z0-9_]���� n �Σ����� m ��
		 * $:ƥ���ַ����Ľ�βλ��
		 * 
		 * ��ʾ�Դ�д��Сд����ĸ��ͷ������ֻ�ܳ��ִ�Сд����ĸ���������֣������»��ߣ��ҳ���Ϊ2-9�������Դ���Ϊ��β��
		 * */
	}


	public static Boolean passWordValid(String pw) {
		return pw.matches("^[a-zA-Z0-9]{6,10}$");
		/*^:ƥ���ַ����Ŀ�ͷλ��
		 * [a-zA-Z0-9]:ƥ��a-z,����A-Z,����0-9���е�һ���ַ�
		 * {6,10}:ƥ��[a-zA-Z0-9]����6�Σ����10��
		 * 
		 * ƥ�䳤��Ϊ6��10���ַ�������ֻ����ĸ��������ɡ�
		 * */
	}
	public static Boolean mobilePhoneValid(String phone) {
		return phone.matches("^1(3[0-9]|4[57]|5[0-35-9]|7[01678]|8[0-9])\\d{8}$");
		/*x|y:ƥ��x��y
		 * \\d:ƥ��һ������
		 * {8}:ƥ�����ָպ�ƥ��˴�
		 * 
		 * ��1��ͷ������λ����Ϊ3[0-9]����4[57]����5[0-35-9]����7[01678]����8[0-9]
		 * [0-9]��ʾ0-9�е�һ�����֣�[57]��ʾ5����7��[0-35-9]��ʾ0-3����5-9
		 * [01678]��ʾ01678���е�һ����
		 * ���ƥ��8λ���֡�
		 * */
	}
	public static Boolean telephoneValid(String tele) {
		return tele.matches("\\d{3,5}-\\d{7,8}(-\\d{1,})?");
		/*\\d{3,5}��ƥ����������3�Σ����5��
		 * -��ƥ���ַ���-��
		 * \\d{7,8}��ƥ����������7�Σ����8��
		 * (pattern)��ƥ�� pattern �������ƥ����ӱ��ʽ
		 * \\d{1,}��ƥ����������1��
		 * ����ƥ�価���̵ܶ��ַ�
		 * 
		 * ����-���ӵ��������֣���һ�γ���Ϊ3-5���ڶ��γ���Ϊ7����8�����һ�����Ϊ1��
		 * */
	}
	public static Boolean qqValid(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");
		/*
		 *��һ����1-9���е����֣�������0-9���е����֣��Һ���ĳ���Ϊ4��14��
		 * */
	}
	public static Boolean idValid(String id) {
		return id.matches("^\\d{15}$|^\\d{17}(\\d|X|x)$");
		/*^\\d{15}$:15������
		 * ^\\d{17}(\\d|X|x)$:��17�����ֿ�ͷ�����һλ��0-9���е�һ�����֣�������X��������x;
		 * */
	}
	public static Boolean emailValid(String email) {
		return email.matches("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$");
		/*\\w: ƥ��һ���κ������ַ��������»��ߡ���"[A-Za-z0-9_]"��Ч��
		 * + : һ�λ���ƥ��ǰ����ַ����ӱ��ʽ
		 * \\.:ƥ���ַ���.����
		 * \\w+��һ�λ���ƥ��[A-Za-z0-9_]
		 *'*'����λ���ƥ��ǰ����ַ����ӱ��ʽ
		 *(\\.\\w+)+��ƥ��һ��.  һ�λ���ƥ��[A-Za-z0-9_]
		 *

		 * */
	}
	public static Boolean websiteValid(String ws) {
		return ws.matches("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+)[.])+([A-Za-z0-9-~/])+$");
		/*[hH][tT]{2}[pP]��ƥ���ַ������ַ��д�д����Сд��http
		 * ://��ƥ��://
		 * [hH][tT]{2}[pP][sS]��ƥ���ַ������ַ��д�д����Сд��httphttps
		 * ([A-Za-z0-9-~]+)��һ�λ���ƥ��A-Z����a-z����0-9����_����~���е�һ���ַ�
		 * 
		 * */
	}
	public static Boolean birthDateValid(String bd) {
		return bd.matches("(\\d{4}[.]\\d{2}[.]\\d{2})|(\\d{4}[-]\\d{2}[-]\\d{2})");
		/*\\d{4}��ƥ��4������
		 * \\d{2}��ƥ��2������
		 * 
		 * ƥ�����¸�ʽ���ַ�����1997.10.09����1997-10-09
		 * */
	}
	public static Boolean chineseNameValid(String cn) {
		return cn.matches("[\u4E00-\u9FA5]{2,5}");
		/*[\u4E00-\u9FA5]  :ƥ��һ�������ַ�
		 * 
		 * ƥ�������ַ�����2�����3����
		 * */
	}
	public static void main(String[] args) {
		System.out.println(Demo.birthDateValid("1997.10.09"));
	    System.out.println(Demo.chineseNameValid("�����")); 
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
