package in.anand.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_master")
public class ContactsEntity {
	
	@Id
	@Column(name="contact_id")
	private Integer contactId;
	@Column(name="contact_name")
	private String contactName;
	@Column(name="contact_loc")
	private String contactLoc;
	
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactLoc() {
		return contactLoc;
	}
	public void setContactLoc(String contactLoc) {
		this.contactLoc = contactLoc;
	}
	@Override
	public String toString() {
		return "ContactsEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactLoc=" + contactLoc
				+ "]";
	}
	
	

}
