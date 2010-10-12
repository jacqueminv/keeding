package models;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class User extends Model{

    public String username;

    public String password;

    @OneToMany
    public List<Source> accounts;

    public User() {}

    public User(String username, String password) {
	this.username = username;
	this.password = password;
	this.accounts = new ArrayList<Source>();
    }

}