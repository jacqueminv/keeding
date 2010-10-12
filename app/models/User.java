package models;

import java.util.List;
import java.util.ArrayList;

public class User {

    private String username;

    private String password;

    private List<Source> accounts;

    public User() {}

    public User(String username, String password) {
	this.username = username;
	this.password = password;
	this.accounts = new ArrayList<Source>();
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getUsername() {
	return username;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getPassword() {
	return password;
    }

    public List<Source> getAccounts() {
	return accounts;
    }
}