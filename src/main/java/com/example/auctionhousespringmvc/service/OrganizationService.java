package com.example.auctionhousespringmvc.service;

import com.example.auctionhousespringmvc.exception.BadRequestException;
import com.example.auctionhousespringmvc.exception.NotFoundException;
import com.example.auctionhousespringmvc.model.Organization;
import com.example.auctionhousespringmvc.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class OrganizationService {
    @Autowired
    OrganizationRepository organizationRepository;

    public Organization create(String name) {
        try {
            Organization organization = Organization.builder()
                    .name(name).build();
            organizationRepository.save(organization);
            return organization;

        } catch (Exception e) {
            throw new BadRequestException("Error Creating Organization! Organization already created!");
        }
    }
    public Organization getOrganization(Long id) {
             Optional<Organization> result = organizationRepository.findById(id);
             if (result.isEmpty()) {
                 throw new NotFoundException("Error retrieving organization! Does not exist!");
             }
             return result.get();
    }
    public Organization getOrganizationByName(String name) {
             Optional<Organization> result = organizationRepository.findByName(name);
             if (result.isEmpty()) {
                 throw new NotFoundException("Error retrieving organization! Does not exist!");
             }
             return result.get();
    }



}
