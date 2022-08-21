package com.dorotajachtoma.dao.model;

import com.dorotajachtoma.dao.model.constant.CaseStatus;
import com.dorotajachtoma.dao.model.constant.CaseType;
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
public class CriminalCase {

    @PrimaryKey
    private String id;

    private CaseType caseType;

    private String shortDescription;

    private String detailedDescription;

    private CaseStatus caseStatus;

    private String notes;

    private Set<Evidence> evidences;

    private Detective leadInvestigator;

    private Set<Detective> assignedDetectives;

}
