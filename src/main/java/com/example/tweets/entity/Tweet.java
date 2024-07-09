package com.example.tweets.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Table("tweets")
public class Tweet {

    @PrimaryKey
    @CassandraType(type = CassandraType.Name.UUID)
    @Column("id")
    private UUID id;

    @Column("content")
    private String content;

    @Column("user_id")
    private UUID userId;

    @Column("media_links")
    private List<String> mediaLinks;

    @Column("created_at")
    private LocalDateTime createdAt;

    @Column("updated_at")
    private LocalDateTime updatedAt;
}
