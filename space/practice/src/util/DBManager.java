package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ����ʵ��JDBC�ķ�װ����Ҫʵ�ִ��������
 * ��������ĳ�����̣���Ա��������Ա��������
 * ���ݿ�ķ��ʲ��裺
 * ��1�������������������ӣ����������󣨷�װ�ڹ��췽���У�
 * ��2������insert��delete��update֮��Ĳ�����������Ӱ��ļ�¼����
 * ��>0�����ʾ�����ɹ��������ʾ����ʧ�ܣ���Ҫʵ��һ������
 * ��3������select�Ĳ��������ص��ǲ�ѯ���ļ�¼������Ҫʵ��һ������
 * ��4�������ݿ����Ӷ���Ĺرգ����ͷ���Դ�������Դ����ʱ���ͷţ�ϵͳ�������
 * ��out of memory���Ĵ��󣬵���ϵͳ����
 * 
 */
public class DBManager {
    //��Ա����
    private static Connection con;
    private static Statement stm;
    private ResultSet rs;



    //����Ϊ��װ�ĳ�Ա����
    /*
     * 1.���췽����ʵ�ּ����������������ӣ�����������
	 */
    public static Statement  DbManager() {
        try {
            // 1.��������
            String driverName = "com.mysql.jdbc.Driver"; // mysql
            // jdbc����������,ʵ���Ͼ���driver���ڰ��е�����·��
            Class.forName(driverName);

            // 2.���������ݿ������
            // ���ݿ������ַ�����һ��ʹ��ͳһ��Դ��λ����url������ʽ
            // �������ݿ���Ϊsalegui
            String url = "jdbc:mysql://127.0.0.1:3306/lastjavawork?useUnicode=true&characterEncoding=utf-8";

            String user = "root"; // �������ݿ�ʱ���û�
            // �������ݿ�ʱ������
            String password = "root123";
            con = DriverManager.getConnection(url, user, password);

            //3.����������
            stm = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return stm;

    }
    

    

}