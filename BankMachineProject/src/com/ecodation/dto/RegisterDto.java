package com.ecodation.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class RegisterDto implements Serializable {

	private static final long serialVersionUID = 8246496887753942381L;

	private long registerId;
	private String registerName;
	private String registerSurname;
	private String registerEmailAddress;
	private String registerPassword;
	private String roles;
	private Date creationDate;

	public RegisterDto() {

	}

	public RegisterDto(long registerId, String registerName, String registerSurname, String registerEmailAddress,
			String registerPassword, String roles, Date creationDate) {
		super();
		this.registerId = registerId;
		this.registerName = registerName;
		this.registerSurname = registerSurname;
		this.registerEmailAddress = registerEmailAddress;
		this.registerPassword = registerPassword;
		this.roles = roles;
		this.creationDate = creationDate;
	}

	public long getRegisterId() {
		return registerId;
	}

	public void setRegisterId(long registerId) {
		this.registerId = registerId;
	}

	public String getRegisterName() {
		return registerName;
	}

	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	public String getRegisterSurname() {
		return registerSurname;
	}

	public void setRegisterSurname(String registerSurname) {
		this.registerSurname = registerSurname;
	}

	public String getRegisterEmailAddress() {
		return registerEmailAddress;
	}

	public void setRegisterEmailAddress(String registerEmailAddress) {
		this.registerEmailAddress = registerEmailAddress;
	}

	public String getRegisterPassword() {
		return registerPassword;
	}

	public void setRegisterPassword(String registerPassword) {
		this.registerPassword = registerPassword;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RegisterDto [registerId=" + registerId + ", registerName=" + registerName + ", registerSurname="
				+ registerSurname + ", registerEmailAddress=" + registerEmailAddress + ", registerPassword="
				+ registerPassword + ", roles=" + roles + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, registerEmailAddress, registerId, registerName, registerPassword,
				registerSurname, roles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterDto other = (RegisterDto) obj;
		return Objects.equals(creationDate, other.creationDate)
				&& Objects.equals(registerEmailAddress, other.registerEmailAddress) && registerId == other.registerId
				&& Objects.equals(registerName, other.registerName)
				&& Objects.equals(registerPassword, other.registerPassword)
				&& Objects.equals(registerSurname, other.registerSurname) && Objects.equals(roles, other.roles);
	}

}
