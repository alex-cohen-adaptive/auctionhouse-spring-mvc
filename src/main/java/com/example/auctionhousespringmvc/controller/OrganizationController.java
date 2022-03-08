package com.example.auctionhousespringmvc.controller;

import com.example.auctionhousespringmvc.controller.dto.CreateOrganizationRequest;
import com.example.auctionhousespringmvc.controller.dto.OrganizationResponse;
import com.example.auctionhousespringmvc.controller.mapper.Mapper;
import com.example.auctionhousespringmvc.model.Organization;
import com.example.auctionhousespringmvc.service.OrganizationService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import static com.example.auctionhousespringmvc.controller.mapper.Mapper.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    @Autowired
    private final OrganizationService organizationService;

    public OrganizationController() {
        this.organizationService =new OrganizationService();
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationResponse create(@RequestBody @Valid CreateOrganizationRequest organization) {
       return map(
               organizationService.create(organization.name())
       );
    }

    @GetMapping("get/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationResponse get(@PathVariable("id") @Valid long id) {
       return map(
               organizationService.getOrganization(id)
       );
    }

/*

    @GetMapping("get/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationResponse get(@PathVariable("name") @Valid String name) {
       return map(
               organizationService.getOrganization(name);
       );
    }
*/





   /* @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@RequestBody @Valid CreateUserRequest user) {
        User newUser = userService.create(user.username(), user.password(),
                user.firstName(), user.lastName(), user.organisation());
        return map(newUser);
    }*/
}
