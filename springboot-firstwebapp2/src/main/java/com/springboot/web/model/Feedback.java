package com.springboot.web.model;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	private int id;
	private String FirstName;
	private String LastName;
	private String MailId;
	private String ThirdPartyApp;
	private String Country;
	private String Feedback_Description;

	public Feedback(int id, String firstName, String lastName, String mailId, String thirdPartyApp, String country,
			String feedback_Description) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		MailId = mailId;
		ThirdPartyApp = thirdPartyApp;
		Country = country;
		Feedback_Description = feedback_Description;
	}
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public String getThirdPartyApp() {
		return ThirdPartyApp;
	}
	public void setThirdPartyApp(String thirdPartyApp) {
		ThirdPartyApp = thirdPartyApp;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getFeedback_Description() {
		return Feedback_Description;
	}
	public void setFeedback_Description(String feedback_Description) {
		Feedback_Description = feedback_Description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + ((Feedback_Description == null) ? 0 : Feedback_Description.hashCode());
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((MailId == null) ? 0 : MailId.hashCode());
		result = prime * result + ((ThirdPartyApp == null) ? 0 : ThirdPartyApp.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (Feedback_Description == null) {
			if (other.Feedback_Description != null)
				return false;
		} else if (!Feedback_Description.equals(other.Feedback_Description))
			return false;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (MailId == null) {
			if (other.MailId != null)
				return false;
		} else if (!MailId.equals(other.MailId))
			return false;
		if (ThirdPartyApp == null) {
			if (other.ThirdPartyApp != null)
				return false;
		} else if (!ThirdPartyApp.equals(other.ThirdPartyApp))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", MailId=" + MailId
				+ ", ThirdPartyApp=" + ThirdPartyApp + ", Country=" + Country + ", Feedback_Description="
				+ Feedback_Description + "]";
	}
	
}