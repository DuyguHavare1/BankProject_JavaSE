package com.ecodation.utils;

import java.sql.Connection;
import java.util.ArrayList;

public interface IAllDbConnection<T> {
	// crud
	public void create(T t);

	public void delete(T t);

	public void update(int id, T t);

	public ArrayList<T> list();

	default Connection getInterfaceConnection() {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();

		return connectionDb.getConnection();
	}

}
