package com.Z_India.realty.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EnquieryUsers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(unique = true)
    private String username;

    private String firstname;

    private String lastname;

    @Transient
    private String password;

    @Column(unique = true)
    private String primaryEmail;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<String> otherEmails;

    @Column(unique = true)
    private String primaryMobileNumber;

    private String countryCode;


    @JdbcTypeCode(SqlTypes.JSON)
    private List<String> otherMobileNumbers;

    private Boolean isActive;
    private Boolean isEmailVerified;
    private Boolean isPhoneVerified;
}
