package com.hiring.hk.backend.service;

import com.hiring.hk.backend.model.Level;
import com.hiring.hk.backend.model.Sectors;
import com.hiring.hk.backend.model.SubLevel;
import com.hiring.hk.backend.model.SubSubLevel;

import java.util.List;

public interface SectorService {

    List<Sectors> getAll();

    Sectors add(Sectors sectors);

    void deleteById(Long id);

    Sectors getById(Long id);

    List<Level> getAllLevel();

    List<SubLevel> getByLevelId(Long id);

    List<SubSubLevel> getBySubLevelId(Long id);

}
