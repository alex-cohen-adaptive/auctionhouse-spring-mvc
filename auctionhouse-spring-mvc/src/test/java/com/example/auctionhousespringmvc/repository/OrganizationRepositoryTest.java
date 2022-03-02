package com.example.auctionhousespringmvc.repository;

import com.example.auctionhousespringmvc.model.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrganizationRepositoryTest {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Test
    public void saveOrganization() {
        Organization organization = Organization
                .builder()
                .name("S&P500")
                .build();
        organizationRepository.save(organization);
        System.out.println(organizationRepository.findAll().stream().toList());

    }

    @Test
    public void displayAllOrganizations() {
        organizationRepository.findAll()
                .stream()
                .map(Organization::toString)
                .forEach(System.out::println);
        System.out.println(organizationRepository.findAll().stream().toList());
    }


}