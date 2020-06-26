package com.exerate.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ReceiptDoc")
public class Receipt {

	@Id
	private long id;

	private String customerId;
	private double amount;
	private String amountLetter;
	private Date date;
	private String branch;
	private String receivedBy;
	private String paymentType;
	private String paymentReason;
	private String details;
	private Date createdAt;
	private String createdBy;

	public Receipt() {
		// TODO Auto-generated constructor stub
	}

	public Receipt(long id, String customerId, double amount, String amountLetter, Date date, String branch,
			String receivedBy, String paymentType, String paymentReason, String details, Date createdAt,
			String createdBy) {
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
		this.amountLetter = amountLetter;
		this.date = date;
		this.branch = branch;
		this.receivedBy = receivedBy;
		this.paymentType = paymentType;
		this.paymentReason = paymentReason;
		this.details = details;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAmountLetter() {
		return amountLetter;
	}

	public void setAmountLetter(String amountLetter) {
		this.amountLetter = amountLetter;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentReason() {
		return paymentReason;
	}

	public void setPaymentReason(String paymentReason) {
		this.paymentReason = paymentReason;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
