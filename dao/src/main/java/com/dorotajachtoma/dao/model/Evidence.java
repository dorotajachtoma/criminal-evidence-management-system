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
public class Evidence {

    @PrimaryKey
    private String id;

    private CriminalCase criminalCase;

    private Storage storage;

    private String number;

    private String itemName;

    private String notes;

    private Boolean archived;

    private Set<TrackEntry> trackEntries;

}
