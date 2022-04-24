package com.hiring.hk.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sub_level")
@NoArgsConstructor
@AllArgsConstructor
public class SubLevel implements Serializable {

    private static final long serialVersionUID = 2435647398607239989L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String subLevelName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "level_id")
    private Level level;
}
