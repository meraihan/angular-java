package com.hiring.hk.backend.controller;

import com.hiring.hk.backend.model.Level;
import com.hiring.hk.backend.model.Sectors;
import com.hiring.hk.backend.model.SubLevel;
import com.hiring.hk.backend.model.SubSubLevel;
import com.hiring.hk.backend.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/sector")
public class SectorController {

    private @Resource SectorService sectorService;

    @GetMapping("/home")
    public String allAccess() {
        return "Hello! Sayed Mahmud Raihan welcomes you!!!";
    }

    @GetMapping
    public List<Sectors> getAllSectors() {
        return sectorService.getAll();
    }

    @PostMapping
    public Sectors create(@RequestBody Sectors sector) {
        return sectorService.add(sector);
    }

    @GetMapping("/level")
    public List<Level> getAll() {
        return sectorService.getAllLevel();
    }

    @GetMapping("/sub-level")
    public List<SubLevel> getSubLevelByLevelId(@RequestParam Long id) {
        return sectorService.getByLevelId(id);
    }

    @GetMapping("/sub-sub-level")
    public List<SubSubLevel> getSubSubLevelBySubLevelId(@RequestParam Long id) {
        return sectorService.getBySubLevelId(id);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        sectorService.deleteById(id);
    }
}
