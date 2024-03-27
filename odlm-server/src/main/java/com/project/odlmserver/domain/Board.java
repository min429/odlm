package com.project.odlmserver.domain;

import jakarta.persistence.*;

import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;


@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Users user;

    @Lob
    private String content;
    private LocalDateTime postTime;

}
