package models;

import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Source extends Model{

    public String url;

    public Source() {}

    public Source(String url) {
	this.url = url;
    }

}