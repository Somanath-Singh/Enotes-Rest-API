package com.som.entity;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@MappedSuperclass  			//jpa recognised this class as extended property
public class BaseModel {
	
private Boolean isActive;
	
	private Boolean isDelete;
	
	private Integer createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdOn;
	
	private Integer updatedBy;
	
	
	private LocalDateTime updatedOn;

}
