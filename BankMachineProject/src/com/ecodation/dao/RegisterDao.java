package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.ecodation.dto.RegisterDto;
import com.ecodation.utils.IAllDbConnection;

public class RegisterDao implements IAllDbConnection<RegisterDto> {
	// insert delete update=executeUpdate
	@Override
	public void create(RegisterDto registerDto) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false);
			String sql = "insert  register (register_name,register_surname,register_email,register_password) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getRegisterName());
			preparedStatement.setString(2, registerDto.getRegisterSurname());
			preparedStatement.setString(3, registerDto.getRegisterEmailAddress());
			preparedStatement.setString(1, registerDto.getRegisterPassword());

			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				connection.commit();

			} else {
				connection.rollback();
				connection.setAutoCommit(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(RegisterDto registerDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(int id, RegisterDto registerDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update register set register_name=? ,register_surname=?,register_email=? ,register_password=? where register_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getRegisterName());
			preparedStatement.setString(2, registerDto.getRegisterSurname());
			preparedStatement.setString(3, registerDto.getRegisterEmailAddress());
			preparedStatement.setString(1, registerDto.getRegisterPassword());
			preparedStatement.setLong(5, registerDto.getRegisterId());

			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				connection.commit();

			} else {
				connection.rollback();
				connection.setAutoCommit(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<RegisterDto> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
