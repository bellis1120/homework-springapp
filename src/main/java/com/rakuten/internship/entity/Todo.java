package com.rakuten.internship.entity;

/**
 * このクラスは、タスク管理の対象となるTodoのエンティティーです。
 * エンティティーとして使えるように、コードを記入してください。
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

//Entityクラス = DBのtable
@Entity
@Table(name = "Todo")

public class Todo {
    // TODO 必要なコードを記入してください。
    
    @Id
    @GeneratedValue
    private Integer No;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Description")
    private String Description;
  
	public Integer getNo() {
		return this.No;
	}

	public void setId(Integer No) {
		this.No = No;
	}   
	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}
 	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
  
}
   