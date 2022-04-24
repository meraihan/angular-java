package com.hiring.hk.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sub_sub_level")
@NoArgsConstructor
@AllArgsConstructor
public class SubSubLevel implements Serializable {

    private static final long serialVersionUID = 2314151453437311818L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String subSubLevelName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sub_level_id")
    private SubLevel subLevel;
}
