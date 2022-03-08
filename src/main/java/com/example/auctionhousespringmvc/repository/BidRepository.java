package com.example.auctionhousespringmvc.repository;

import com.example.auctionhousespringmvc.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BidRepository extends JpaRepository<Bid,Long> {
}
