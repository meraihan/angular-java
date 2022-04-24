package com.hiring.hk.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sectors")
@NoArgsConstructor
@AllArgsConstructor
public class Sectors implements Serializable {

    private static final long serialVersionUID = -2498687244160128876L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sectorName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "level_id")
    private Level level;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sub_level_id")
    private SubLevel subLevel;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sub_sub_level_id")
    private SubSubLevel subSubLevel;

    private Boolean isCheckedTerms;
}
