package main.java.com.whenufree.model;

import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="user")
public class User{
    private long userId;
    private String email;
    private String firstname;
    private String lastname;
    private String phone;
    private String passwordHash;
    
    //no args constructor
    public User() {}
    
    /**
     * Gets the value of id
     *
     * @return the value of id
     */
    @Id
    @Column(name="userid")
    public long getUserId() {
	return this.userId;
    }

    /**
     * Sets the value of id
     *
     * @param argId Value to assign to this.id
     */
    public void setuserId(final long argId) {
	this.userId = argId;
    }

    /**
     * Gets the value of email
     *
     * @return the value of email
     */
    @Column(name="email")
    public String getEmail() {
	return this.email;
    }

    /**
     * Sets the value of email
     *
     * @param argEmail Value to assign to this.email
     */
    public void setEmail(final String argEmail) {
	this.email = argEmail;
    }

    /**
     * Gets the value of firstname
     *
     * @return the value of firstname
     */
    @Column(name="firstname")
    public String getFirstname() {
	return this.firstname;
    }

    /**
     * Sets the value of firstname
     *
     * @param argFirstname Value to assign to this.firstname
     */
    public void setFirstname(final String argFirstname) {
	this.firstname = argFirstname;
    }

    /**
     * Gets the value of lastname
     *
     * @return the value of lastname
     */
    @Column(name="lastname")
    public String getLastname() {
	return this.lastname;
    }

    /**
     * Sets the value of lastname
     *
     * @param argLastname Value to assign to this.lastname
     */
    public void setLastname(final String argLastname) {
	this.lastname = argLastname;
    }

    /**
     * Gets the value of phone
     *
     * @return the value of phone
     */
    @Column(name="phone")
    public String getPhone() {
	return this.phone;
    }

    /**
     * Sets the value of phone
     *
     * @param argPhone Value to assign to this.phone
     */
    public void setPhone(final String argPhone) {
	this.phone = argPhone;
    }

    /**
     * Gets the value of passwordHash
     *
     * @return the value of passwordHash
     */
    @Column(name="password_hash")
    public String getPasswordHash() {
	return this.passwordHash;
    }

    /**
     * Sets the value of passwordHash
     *
     * @param argPasswordHash Value to assign to this.passwordHash
     */
    public void setPasswordHash(final String argPasswordHash) {
	this.passwordHash = argPasswordHash;
    }

    //To String Method
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", phone=" + phone + ", passwordHash=" + passwordHash + "]";
	}

    
    
}
