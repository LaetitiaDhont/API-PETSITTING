package com.masterpiece.chatchuffit.business.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.masterpiece.chatchuffit.business.Environment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@EntityListeners(value = AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Petsitter extends AbstractEntity {


    @Column(length = 20, nullable = false)
    private String firstName;
    @Column(length = 20, nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String animalAllowed;
    @Column(nullable = false)
    private Double price;
    @Column(length = 11, nullable = false)
    @Enumerated(EnumType.STRING)
    private Environment environment;
    @Column(length = 40, nullable = false)
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid syntax")
    @Email
    private String mail;
    @Column(nullable = false)
    @Pattern(regexp = "(0|(\\+33)|(0033))[1-9][0-9]{8}")
    private String phone;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;


    /*
    @ManyToOne
    @JoinColumn(nullable = false)
    private Address address;

    @Column
    private String description;
    @Column
    private boolean garden;
    @Column
    private boolean balcony;
    @Column
    private boolean secure;
    @Column
    private boolean smoking;
    @Column
    private boolean shut;
    @Column
    private double size;
     */

    public Petsitter() {
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

    public String getAnimalAllowed() {
        return animalAllowed;
    }

    public void setAnimalAllowed(String animalAllowed) {
        this.animalAllowed = animalAllowed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
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
