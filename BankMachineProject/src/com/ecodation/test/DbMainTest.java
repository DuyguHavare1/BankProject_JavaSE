package com.ecodation.test;

import com.ecodation.utils.DatabaseConnectionDb;

public class DbMainTest {

	public static void main(String[] args) {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();
		connectionDb.getConnection();
	}

}
