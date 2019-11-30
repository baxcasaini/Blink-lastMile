package com.aws.codestar.projecttemplates.dto;

import com.aws.codestar.projecttemplates.model.Customer;
import com.aws.codestar.projecttemplates.model.Parcel;
import com.aws.codestar.projecttemplates.model.Receiver;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "delivery")
public class DeliveryDTO {
	@Id
	private String id;
	private DeliveryStatus status;
	private Customer customer;
	private Receiver receiver;
	private List<Parcel> packages;
	private Date createdAt;
	private Date lastUpdateAt;
	
	public DeliveryDTO(Customer customer, Receiver receiver, List<Parcel> packages) {
		super();
		this.status = DeliveryStatus.created;
		this.customer = customer;
		this.receiver = receiver;
		this.packages = packages;
		this.createdAt = new Date();
		this.lastUpdateAt = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DeliveryStatus getStatus() {
		return status;
	}

	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	

	public Date getLastUpdateAt() {
		return lastUpdateAt;
	}

	public void setLastUpdateAt(Date lastUpdateAt) {
		this.lastUpdateAt = lastUpdateAt;
	}

	public List<Parcel> getPackages() {
		return packages;
	}

	public void setPackages(List<Parcel> packagesInfo) {
		this.packages = packagesInfo;
	}

}
