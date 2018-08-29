package liuwabackend.datamodels;

import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import liuwabackend.datamodels.common.Address;
import liuwabackend.datamodels.common.Baby;

@Entity
public class Member {
	private @Id Long memberId;
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String occupation;
	private String profileImageUrl;
	List<Ref<Baby>> babies;
	private Address address;
	
	/**
	 * System time stamps for auditing/debugging purposes
	 */
	private Long createdAt;
	private Long lastModifiedAt;
	
	public long getMemberId() {
		return memberId;
	}
	public Member setMemberId(long memberId) {
		this.memberId = memberId;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Member setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Member setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Member setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public Member setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public Address getAddress() {
		return address;
	}
	public Member setAddress(Address address) {
		this.address = address;
		return this;
	}
	public String getOccupation() {
		return occupation;
	}
	public Member setOccupation(String occupation) {
		this.occupation = occupation;
		return this;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public Member setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
		return this;
	}
	public List<Ref<Baby>> getBabies() {
		return babies;
	}
	public Member setBabies(List<Ref<Baby>> babies) {
		this.babies = babies;
		return this;
	}
	
	
}
