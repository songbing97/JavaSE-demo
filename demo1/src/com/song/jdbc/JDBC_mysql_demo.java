package com.song.jdbc;

import java.sql.*;

public class JDBC_mysql_demo {
	// 加载JDBC驱动文件
	static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	// 数据库地址，参数
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


	// 账号密码，不会变的，防止被修改，用final修饰
	static final String USER = "root";
	static final String PASS = "abcd1234";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// 注册JDBC驱动
			Class.forName(JDBC_Driver);
			// 链接数据库
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			// 执行查询
			statement = connection.createStatement();
			// 查询语句
			String sql = "Select * from family";
			// 返回结果
			ResultSet rs = statement.executeQuery(sql);
			// 展开结果集
			while (rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String title = rs.getString("title");
				// 输出数据
				System.out.println("name: " + name);
				System.out.println("id: " + id);
				System.out.println("title: " + title);
			}
			// 完成后关闭
			rs.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		System.out.println("Success!");
	}
}
