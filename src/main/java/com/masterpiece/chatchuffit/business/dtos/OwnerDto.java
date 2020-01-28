package com.masterpiece.chatchuffit.business.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@CrossOrigin(value = "http://localhost:4200")
@EntityListeners(value = AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class OwnerDto {

    @NotBlank
    @Size(min = 1, max = 20)
    private String firstName;
    @NotBlank
    @Size(min = 1, max = 20)
    private String lastName;
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid mail syntax")
    @Email
    private String mail;
    @Column(nullable = false)
    @Pattern(regexp = "(0|(\\+33)|(0033))[1-9][0-9]{8}", message = "Invalid phone syntax")
    private String phone;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


    public OwnerDto() {
    }

    public OwnerDto(@NotBlank @Size(min = 1, max = 20) String firstName, @NotBlank @Size(min = 1, max = 20) String lastName, @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid mail syntax") @Email String mail, @Pattern(regexp = "(0|(\\+33)|(0033))[1-9][0-9]{8}", message = "Invalid phone syntax") String phone, LocalDate startDate, LocalDate endDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.phone = phone;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
