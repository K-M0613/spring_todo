package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	@Id //対象のフィールド(Integer id)が主キーであることを表す
	@GeneratedValue(strategy = GenerationType.IDENTITY) //自動採番
	private Integer id;
	
	private Integer categoryId;
	private Integer userId;
	private String title;
	private LocalDate closingDate;
	private Integer progress;
	private String memo;
	
	
	// デフォルトコンストラクタ（空のオブジェクトを作成するのに必要）
	public Task() {
	}
	
	// 引数付きコンストラクタ（新しいタスクを作成するとき（インスタンス化）に必要）
	public Task(Integer categoryId, Integer userId, String title, LocalDate closingDate, Integer progress, String memo) {
		this.categoryId = categoryId;
		this.userId = userId;
		this.title = title;
		this.closingDate = closingDate;
		this.progress = progress;
		this.memo = memo;
	}
	
	
	// IDの取得・設定
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	// ユーザーIDの取得・設定
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	// カテゴリIDの取得・設定
	public Integer getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	
	// ユーザーIDの取得・設定
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	// タイトルの取得・設定
	public LocalDate getClosingDate() {
		return closingDate;
	}
	
	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}
	
	
	// 進捗状況の取得・設定
	public Integer getProgress() {
		return progress;
	}
	
	public void setProgress(Integer progress) {
		this.progress = progress;
	}
	
	
	// 締切日の取得・設定
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
