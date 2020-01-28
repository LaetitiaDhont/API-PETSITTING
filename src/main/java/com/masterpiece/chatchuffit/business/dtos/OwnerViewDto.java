package com.masterpiece.chatchuffit.business.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.masterpiece.chatchuffit.business.Environment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.time.LocalDate;
import java.time.LocalDateTime;

@EntityListeners(value = AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public interface OwnerViewDto {

    Long getId();

    String getfirstname();

    String getlastname();

    String getMail();

    Integer getPhone();

    LocalDate getStartDate();

    LocalDate getEndDate();



}
