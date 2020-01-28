package com.masterpiece.chatchuffit.business.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.masterpiece.chatchuffit.business.Environment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

@EntityListeners(value = AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public interface PetsitterViewDto {

    Long getId();

    String getFirstName();

    String getLastName();

    String getAnimalAllowed();

    Double getPrice();

    Environment getEnvironment();

    String getMail();

    Integer getPhone();


}
