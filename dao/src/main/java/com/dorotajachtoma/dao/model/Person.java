package com.dorotajachtoma.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    @PrimaryKey
    private String id;

    private String username;

    private String firstName;

    private String lastName;

    private String password;

    private LocalDateTime hiringDate;
}
