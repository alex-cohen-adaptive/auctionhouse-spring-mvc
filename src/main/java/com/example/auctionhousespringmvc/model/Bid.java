package com.example.auctionhousespringmvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


enum State {
    WON,LOST,PENDING;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bid_table")
public class Bid {

  @Id
  @SequenceGenerator(
      name = "bid_sequence",
      sequenceName = "bid_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "bid_sequence"
  )
  private Long idId;

  @Column(nullable = false)
  private int quantity;

  @Column(nullable = false)
  private double price;

  @Column(nullable = false)
  private State state;

  @Column(
      name = "win_quantity",
      nullable = false
  )
  private int winQuantity;

  @ManyToOne
  @JoinColumn(
      name = "user_id",
      nullable = false
  )
  private User user;

}
