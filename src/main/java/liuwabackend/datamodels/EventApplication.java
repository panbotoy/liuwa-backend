package liuwabackend.datamodels;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class EventApplication {
	@Parent Ref<Member> member;
	private @Id Long applicationId;
	private Ref<Event> event;
	private ApplicationStatus applicationStatus;
	
	/**
	 * System audit timestamps
	 */
	private Long createdAt;
	private Long lastModifiedAt;
	
	public Ref<Member> getMember() {
		return member;
	}



	public Long getApplicationId() {
		return applicationId;
	}



	public Ref<Event> getEvent() {
		return event;
	}



	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}



	public Long getCreatedAt() {
		return createdAt;
	}



	public Long getLastModifiedAt() {
		return lastModifiedAt;
	}



	public EventApplication setMember(Ref<Member> member) {
		this.member = member;
		return this;
	}



	public EventApplication setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
		return this;
	}



	public EventApplication setEvent(Ref<Event> event) {
		this.event = event;
		return this;
	}



	public EventApplication setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
		return this;
	}



	public EventApplication setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
		return this;
	}



	public EventApplication setLastModifiedAt(Long lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
		return this;
	}



	public static enum ApplicationStatus {
		PENDING,
		APPROVED,
		REJECTED,
		WITHDRAWED,
		DELETED
	}
}
