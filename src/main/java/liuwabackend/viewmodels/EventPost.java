package liuwabackend.viewmodels;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import liuwabackend.datamodels.Event.EventTags;
import liuwabackend.datamodels.Event.EventType;

@XmlRootElement
public class EventPost {
	private String title;
	private Long startDate;
	private Long endDate;
	private String address;
	
	// TODO(bopan) explore richtext
	private String descriptionText;
	
	private List<String> images;
	private String wechatGroupLink;
	private Integer attendeeNum;
	private Long enrollmentEndDate;
	// for now always needApproval = false
	//private boolean needApproval;
	private List<EventTags> tags;
	private EventType eventType;
	private Integer minAge;
	private Integer maxAge;
	
	public String getTitle() {
		return title;
	}
	public Long getStartDate() {
		return startDate;
	}
	public Long getEndDate() {
		return endDate;
	}
	public String getAddress() {
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
	public void setTitle(String title) {
		this.title = title;
	}
	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public void setWechatGroupLink(String wechatGroupLink) {
		this.wechatGroupLink = wechatGroupLink;
	}
	public void setAttendeeNum(Integer attendeeNum) {
		this.attendeeNum = attendeeNum;
	}
	public void setEnrollmentEndDate(Long enrollmentEndDate) {
		this.enrollmentEndDate = enrollmentEndDate;
	}
	public void setTags(List<EventTags> tags) {
		this.tags = tags;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
}
