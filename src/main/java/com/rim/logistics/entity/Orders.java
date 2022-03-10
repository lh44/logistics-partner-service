package com.rim.logistics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Orders {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false, updatable = false)
  @CreationTimestamp
  private Date createdOn;

  @UpdateTimestamp
  private Date updatedOn;

  @ManyToOne
  @JoinColumn(name = "account_id")
  private LogisticsPartnerAccount partnerAccount;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Status status;

  private String externalId;
}
