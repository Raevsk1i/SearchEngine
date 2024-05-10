package com.searchEngine.model;

import com.searchEngine.enums.StatusSite;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status", columnDefinition = "enum('INDEXING', 'INDEXED', 'FAILED')", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private StatusSite statusSite;

    @Column(name = "status_time", nullable = false)
    private LocalDateTime statusTime;

    @Column(name = "last_error")
    private String lastError;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "name", nullable = false)
    private String name;
}
