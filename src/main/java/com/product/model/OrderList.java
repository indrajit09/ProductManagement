package com.product.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrderList {
	@Id
	private int orderItemid;
	private int orderId;
	private int VendorProductId;
	private int quantity;
    private double priceTotal;
    private double priceEach;
    private int productId;
    private String status;
    private Date approvedDateTime;
    private int buyUserId;
    private Date rejectDateTime;
    private Date deliveryDateTime;
    private Date DispacheDateTime;
    private String reason;
	public int getOrderItemid() {
		return orderItemid;
	}
	public void setOrderItemid(int orderItemid) {
		this.orderItemid = orderItemid;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getVendorProductId() {
		return VendorProductId;
	}
	public void setVendorProductId(int vendorProductId) {
		VendorProductId = vendorProductId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}
	public double getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getApprovedDateTime() {
		return approvedDateTime;
	}
	public void setApprovedDateTime(Date approvedDateTime) {
		this.approvedDateTime = approvedDateTime;
	}
	public int getBuyUserId() {
		return buyUserId;
	}
	public void setBuyUserId(int buyUserId) {
		this.buyUserId = buyUserId;
	}
	public Date getRejectDateTime() {
		return rejectDateTime;
	}
	public void setRejectDateTime(Date rejectDateTime) {
		this.rejectDateTime = rejectDateTime;
	}
	public Date getDeliveryDateTime() {
		return deliveryDateTime;
	}
	public void setDeliveryDateTime(Date deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}
	public Date getDispacheDateTime() {
		return DispacheDateTime;
	}
	public void setDispacheDateTime(Date dispacheDateTime) {
		DispacheDateTime = dispacheDateTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
		@Override
		public String toString() {
			return "OrderList [orderItemid=" + orderItemid + ", orderId=" + orderId + ", VendorProductId=" + VendorProductId
					+ ", quantity=" + quantity + ", priceTotal=" + priceTotal + ", priceEach=" + priceEach + ", productId="
					+ productId + ", status=" + status + ", approvedDateTime=" + approvedDateTime + ", buyUserId="
					+ buyUserId + ", rejectDateTime=" + rejectDateTime + ", deliveryDateTime=" + deliveryDateTime
					+ ", DispacheDateTime=" + DispacheDateTime + ", reason=" + reason + "]";
		}
	}
