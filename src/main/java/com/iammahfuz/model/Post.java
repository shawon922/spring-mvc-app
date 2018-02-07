package com.iammahfuz.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	private int id;
	private String content;
	private int status;
}
