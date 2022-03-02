package com.example.auctionhousespringmvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Set;

import static java.util.stream.Collectors.joining;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "organization_table",
        uniqueConstraints =
        @UniqueConstraint(
                name = "name_unique",
                columnNames = "name"
        )
)
public class Organization {
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Id
    @SequenceGenerator(
            name = "organization_sequence",
            sequenceName = "organization_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "organization_sequence"
    )
    private Long id;

/*    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn (
            name = "",
            referencedColumnName = ""
    )
    private Set<User> users;*/
}
