package liuwabackend.datamodels;

import java.util.List;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.IgnoreSave;
import com.googlecode.objectify.annotation.Parent;
import com.googlecode.objectify.condition.IfEmpty;

import liuwabackend.datamodels.common.Address;

@Entity
public class Event {
	private @Parent Ref<Member> poster;
	private @Id Long eventId;
	private String title;
	private Long startDate;
	@IgnoreSave(IfEmpty.class)
	private Long endDate;
	private Address address;
	
	// TODO(bopan) explore richtext
	private String descriptionText;
	
	private List<String> images;
	private String wechatGroupLink;
	private Integer attendeeNum;
	private Long enrollmentEndDate;
	private boolean needApproval;
	private List<EventTags> tags;
	private EventType eventType;
	private Integer minAge;
	private Integer maxAge;
	
	private EventState eventState;
	
	private Long publishedAt;
	private Long closedAt;
	
	private List<Ref<EventApplication>> applications;
	/**
	 * System timestamp for auditing/debugging purposes
	 */
	private Long createdAt;
	private Long lastModifiedAt;
	
	public static enum EventState {
		DRAFT,
		PUBLISHED,
		CLOSED
	}
	
	public static enum EventTags {
		FOODIE,
		OUTDOOR,
		EDUCATION
	} 
	
	public static enum EventType {
		PARTY_EVENT,
		CLASS,
		DISCOUNT_EVENT
	}

	public long getEventId() {
		return eventId;
	}

	public String getTitle() {
		return title;
	}

	public Long getStartDate() {
		return startDate;
	}

	public Long getEndDate() {
		return endDate;
	}

	public Address getAddress() {
		return address;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public List<String> getImages() {
		return images;
	}

	public String getWechatGroupLink() {
		return wechatGroupLink;
	}

	public Integer getAttendeeNum() {
		return attendeeNum;
	}

	public Long getEnrollmentEndDate() {
		return enrollmentEndDate;
	}

	public boolean isNeedApproval() {
		return needApproval;
	}

	public List<EventTags> getTags() {
		return tags;
	}

	public EventType getEventType() {
		return eventType;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public EventState getEventState() {
		return eventState;
	}

	public Long getPublishedAt() {
		return publishedAt;
	}

	public Long getClosedAt() {
		return closedAt;
	}

	public List<Ref<EventApplication>> getApplications() {
		return this.applications;
	}

	public Ref<Member> getPoster() {
		return poster;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public Long getLastModifiedAt() {
		return lastModifiedAt;
	}

	public Event setEventId(long eventId) {
		this.eventId = eventId;
		return this;
	}

	public Event setTitle(String title) {
		this.title = title;
		return this;
	}

	public Event setStartDate(Long startDate) {
		this.startDate = startDate;
		return this;
	}

	public Event setEndDate(Long endDate) {
		this.endDate = endDate;
		return this;
	}

	public Event setAddress(Address address) {
		this.address = address;
		return this;
	}

	public Event setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
		return this;
	}

	public Event setImages(List<String> images) {
		this.images = images;
		return this;
	}

	public Event setWechatGroupLink(String wechatGroupLink) {
		this.wechatGroupLink = wechatGroupLink;
		return this;
	}

	public Event setAttendeeNum(Integer attendeeNum) {
		this.attendeeNum = attendeeNum;
		return this;
	}

	public Event setEnrollmentEndDate(Long enrollmentEndDate) {
		this.enrollmentEndDate = enrollmentEndDate;
		return this;
	}

	public Event setNeedApproval(boolean needApproval) {
		this.needApproval = needApproval;
		return this;
	}

	public Event setTags(List<EventTags> tags) {
		this.tags = tags;
		return this;
	}

	public Event setEventType(EventType eventType) {
		this.eventType = eventType;
		return this;
	}

	public Event setMinAge(Integer minAge) {
		this.minAge = minAge;
		return this;
	}

	public Event setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
		return this;
	}

	public Event setEventState(EventState eventState) {
		this.eventState = eventState;
		return this;
	}

	public Event setPublishedAt(Long publishedAt) {
		this.publishedAt = publishedAt;
		return this;
	}

	public Event setClosedAt(Long closedAt) {
		this.closedAt = closedAt;
		return this;
	}

	public Event setApplicants(List<Ref<EventApplication>> applications) {
		this.applications = applications;
		return this;
	}

	public Event setPoster(Key<Member> poster) {
		this.poster = Ref.create(poster);
		return this;
	}

	public Event setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public Event setLastModifiedAt(Long lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
		return this;
	}
}
