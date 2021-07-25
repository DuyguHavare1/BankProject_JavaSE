package com.ecodation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseConnectionDb {

	private String url = "jdbc:mysql://localhost:3306/bankproject?useUnicode=yes&characterEncoding=UTF-8";
	private String user = "root";
	private String password = "duygu123";
	private Connection connection;

	public static final Logger LOGGER = Logger.getLogger(DatabaseConnectionDb.class.getName());

	public Connection getConnection() {

		try {

			if (this.connection == null || this.connection.isClosed()) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver yüklendi");
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("Baðlantý kuruldu");

			} else {
				return connection;
			}

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();

		}

		return connection;

	}

}
