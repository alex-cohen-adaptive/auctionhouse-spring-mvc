package com.example.auctionhousespringmvc.controller.mapper;

import com.example.auctionhousespringmvc.controller.dto.OrganizationResponse;
import com.example.auctionhousespringmvc.model.Organization;

/*public class UserMapper {
    private UserMapper() {
    }

    public static UserResponse map(User user) {
        return new UserResponse(user.getId(), user.getUsername(), user.getFirstName(), user.getLastName(), user.getOrganisation());
    }

}*/
public class Mapper {
    private Mapper() {

    }
    public static OrganizationResponse map(Organization organization) {
        return new OrganizationResponse(organization.getId(), organization.getName());
    }
}
