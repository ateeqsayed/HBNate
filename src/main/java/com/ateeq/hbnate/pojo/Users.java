/**
 * 
 */
package com.ateeq.hbnate.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sayed
 *
 */
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String userId;
	private String firstName;
	private String lastName;
	private Date createDate;
	private UserContactDetails userContactDetails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public UserContactDetails getUserContactDetails() {
		return userContactDetails;
	}
	public void setUserContactDetails(UserContactDetails userContactDetails) {
		this.userContactDetails = userContactDetails;
	}
	
	

}
