package com.example.auctionhousespringmvc.controller.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




public record CreateOrganizationRequest (
        @NotBlank
        @Pattern(regexp = "^[A-Za-z0-9.]+$")
        @Size(max = 4)
        String name
) {

}
