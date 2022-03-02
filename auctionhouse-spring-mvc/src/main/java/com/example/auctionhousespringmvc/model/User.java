package com.example.auctionhousespringmvc.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "user_table",
        uniqueConstraints =
        @UniqueConstraint(
                name = "username_unique",
                columnNames = "username"
        )
)
public class User {
    @Column(
            name = "username",
            nullable = false
    )
    private String username;

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "organization_sequence"
    )
    private int userid;
    @Column (
          nullable = false
    )
    private String firstName;
    @Column(nullable = false)
    private  String lastName;
    @Column(nullable = false)
    private  String password;
    @Column(nullable = false)
    private  String organization;


//    todo come back to this later
//    boolean isAdmin;
//    boolean blocked;

}
