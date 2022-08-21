package com.dorotajachtoma.dao.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {


    @Override
    protected String getKeyspaceName() {
        return "cassandra-cluster";
    }

    @Bean
    public CassandraMappingContext cassandraMappingContext() {
        return new BasicCassandraMappingContext();
    }

}
