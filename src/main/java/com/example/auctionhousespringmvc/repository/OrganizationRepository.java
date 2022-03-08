package com.example.auctionhousespringmvc.repository;

import com.example.auctionhousespringmvc.model.Organization;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
  Optional<Organization> findByName(String name);
}
