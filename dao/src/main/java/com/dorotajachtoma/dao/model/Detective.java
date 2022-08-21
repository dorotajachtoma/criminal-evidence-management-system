package com.dorotajachtoma.dao.model;

import com.dorotajachtoma.dao.model.constant.EmploymentStatus;
import com.dorotajachtoma.dao.model.constant.Rank;
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
public class Detective {

    @PrimaryKey
    private String id;

    private Person person;

    private String badgeNumber;

    private Rank rank;

    private Boolean armed;

    private EmploymentStatus employmentStatus;

    private Set<CriminalCase> criminalCases;

    private Set<TrackEntry> trackEntries;
}
