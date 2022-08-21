package com.dorotajachtoma.dao.model;

import com.dorotajachtoma.dao.model.constant.TrackAction;
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
public class TrackEntry {

    @PrimaryKey
    private String id;

    private LocalDateTime data;

    private Evidence evidence;

    private Detective detective;

    private TrackAction trackAction;

    private String reason;

}
