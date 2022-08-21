package com.dorotajachtoma.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Storage {

    @PrimaryKey
    private String name;

    private String location;

    private Set<Evidence> evidences;
}
