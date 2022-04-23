package com.hiring.hk.backend.service.impl;

import com.hiring.hk.backend.model.Level;
import com.hiring.hk.backend.model.Sectors;
import com.hiring.hk.backend.model.SubLevel;
import com.hiring.hk.backend.model.SubSubLevel;
import com.hiring.hk.backend.repository.LevelRepo;
import com.hiring.hk.backend.repository.SectorRepo;
import com.hiring.hk.backend.repository.SubLevelRepo;
import com.hiring.hk.backend.repository.SubSubLevelRepo;
import com.hiring.hk.backend.service.SectorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SectorServiceImpl implements SectorService {

    private @Resource SectorRepo sectorRepo;
    private @Resource LevelRepo levelRepo;
    private @Resource SubLevelRepo subLevelRepo;
    private @Resource SubSubLevelRepo subSubLevelRepo;

    @Override
    public List<Sectors> getAll() {
        return sectorRepo.findAll();
    }

    @Override
    public Sectors add(Sectors sector) {
        return sectorRepo.save(sector);
    }

    @Override
    public void deleteById(Long id) {
        sectorRepo.deleteById(id);
    }

    @Override
    public Sectors getById(Long id) {
        return sectorRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Level> getAllLevel() {
        return levelRepo.findAll();
    }

    @Override
    public List<SubLevel> getByLevelId(Long id) {
        return subLevelRepo.findAllByLevelId(id);
    }

    @Override
    public List<SubSubLevel> getBySubLevelId(Long id) {
        return subSubLevelRepo.findAllBySubLevelId(id);
    }
}
