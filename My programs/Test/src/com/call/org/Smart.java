package com.call.org;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Smart {

	  @Id  
private int smart_id;
	  
	  private int pan_id;
	  @OneToOne
	  private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getSmart_id() {
		return smart_id;
	}
	public void setSmart_id(int smart_id) {
		this.smart_id = smart_id;
	}
	public int getPan_id() {
		return pan_id;
	}
	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}
}


