package com.devchronicles.di;

public class UserServiceFactory {
	public UserService6 getInstance() {
		return new UserService6(new UserDataRepositoryImpl());
	}
}
