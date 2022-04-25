package com.hiring.hk.backend.service;

import com.hiring.hk.backend.model.Level;
import com.hiring.hk.backend.model.Sectors;
import com.hiring.hk.backend.model.SubLevel;
import com.hiring.hk.backend.model.SubSubLevel;
import com.hiring.hk.backend.repository.LevelRepo;
import com.hiring.hk.backend.repository.SectorRepo;
import com.hiring.hk.backend.repository.SubLevelRepo;
import com.hiring.hk.backend.repository.SubSubLevelRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InitDataService {

    private @Resource LevelRepo levelRepo;
    private @Resource SubLevelRepo subLevelRepo;
    private @Resource SubSubLevelRepo subSubLevelRepo;
    private @Resource SectorRepo sectorRepo;

    public void init() {
        if (sectorRepo.count() == 0 && levelRepo.count() == 0 && subLevelRepo.count() == 0) {

            // save levels start
            Level level1 = new Level();
            level1.setLevelName("Manufacturing");
            Level saveLevel1 = levelRepo.save(level1);

            Level level2 = new Level();
            level2.setLevelName("Service");
            Level saveLevel2 = levelRepo.save(level2);

            Level level3 = new Level();
            level3.setLevelName("Other");
            Level saveLevel3 = levelRepo.save(level3);
            // save levels end

            // Level 1 start
            SubLevel subLevel1 = new SubLevel();
            subLevel1.setLevel(saveLevel1);
            subLevel1.setSubLevelName("Construction materials");
            subLevelRepo.save(subLevel1);

            SubLevel subLevel2 = new SubLevel();
            subLevel2.setLevel(saveLevel1);
            subLevel2.setSubLevelName("Electronics and Optics");
            subLevelRepo.save(subLevel2);

            SubLevel subLevel3 = new SubLevel();
            subLevel3.setLevel(saveLevel1);
            subLevel3.setSubLevelName("Food and Beverage");
            SubLevel saveSubLevel3 = subLevelRepo.save(subLevel3);

            SubLevel subLevel4 = new SubLevel();
            subLevel4.setLevel(saveLevel1);
            subLevel4.setSubLevelName("Furniture");
            SubLevel saveSubLevel4 = subLevelRepo.save(subLevel4);

            SubLevel subLevel5 = new SubLevel();
            subLevel5.setLevel(saveLevel1);
            subLevel5.setSubLevelName("Machinery");
            SubLevel saveSubLevel5 = subLevelRepo.save(subLevel5);

            SubLevel subLevel6 = new SubLevel();
            subLevel6.setLevel(saveLevel1);
            subLevel6.setSubLevelName("Metalworking");
            SubLevel saveSubLevel6 = subLevelRepo.save(subLevel6);

            SubLevel subLevel7 = new SubLevel();
            subLevel7.setLevel(saveLevel1);
            subLevel7.setSubLevelName("Plastic and Rubber");
            SubLevel saveSubLevel7 = subLevelRepo.save(subLevel7);

            SubLevel subLevel8 = new SubLevel();
            subLevel8.setLevel(saveLevel1);
            subLevel8.setSubLevelName("Printing");
            SubLevel saveSubLevel8 = subLevelRepo.save(subLevel8);

            SubLevel subLevel9 = new SubLevel();
            subLevel9.setLevel(saveLevel1);
            subLevel9.setSubLevelName("Textile and Clothing");
            SubLevel saveSubLevel9 = subLevelRepo.save(subLevel9);

            SubLevel subLevel10 = new SubLevel();
            subLevel10.setLevel(saveLevel1);
            subLevel10.setSubLevelName("Wood");
            SubLevel saveSubLevel10 = subLevelRepo.save(subLevel10);
            // Level 1 end

            // Level 3 start
            SubLevel subLevel11 = new SubLevel();
            subLevel11.setLevel(saveLevel3);
            subLevel11.setSubLevelName("Creative industries");
            subLevelRepo.save(subLevel11);

            SubLevel subLevel12 = new SubLevel();
            subLevel12.setLevel(saveLevel3);
            subLevel12.setSubLevelName("Energy technology");
            subLevelRepo.save(subLevel12);

            SubLevel subLevel13 = new SubLevel();
            subLevel13.setLevel(saveLevel3);
            subLevel13.setSubLevelName("Environment");
            subLevelRepo.save(subLevel13);
            // Level 3 end

            // Level 2 start
            SubLevel subLevel14 = new SubLevel();
            subLevel14.setLevel(saveLevel2);
            subLevel14.setSubLevelName("Business services");
            subLevelRepo.save(subLevel14);

            SubLevel subLevel15 = new SubLevel();
            subLevel15.setLevel(saveLevel2);
            subLevel15.setSubLevelName("Engineering");
            subLevelRepo.save(subLevel15);

            SubLevel subLevel16 = new SubLevel();
            subLevel16.setLevel(saveLevel2);
            subLevel16.setSubLevelName("Information Technology and Telecommunications");
            SubLevel saveSubLevel16 = subLevelRepo.save(subLevel16);

            SubLevel subLevel17 = new SubLevel();
            subLevel17.setLevel(saveLevel2);
            subLevel17.setSubLevelName("Tourism");
            subLevelRepo.save(subLevel17);

            SubLevel subLevel18 = new SubLevel();
            subLevel18.setLevel(saveLevel2);
            subLevel18.setSubLevelName("Translation services");
            subLevelRepo.save(subLevel18);

            SubLevel subLevel19 = new SubLevel();
            subLevel19.setLevel(saveLevel2);
            subLevel19.setSubLevelName("Transport and Logistics");
            SubLevel saveSubLevel19 = subLevelRepo.save(subLevel19);
            //Level 2 end


            // Sub level saveSubLevel3 start
            SubSubLevel subSubLevel20 = new SubSubLevel();
            subSubLevel20.setSubLevel(saveSubLevel3);
            subSubLevel20.setSubSubLevelName("Bakery &amp; confectionery products");
            subSubLevelRepo.save(subSubLevel20);

            SubSubLevel subSubLevel21 = new SubSubLevel();
            subSubLevel21.setSubLevel(saveSubLevel3);
            subSubLevel21.setSubSubLevelName("Beverages");
            subSubLevelRepo.save(subSubLevel21);

            SubSubLevel subSubLevel22 = new SubSubLevel();
            subSubLevel22.setSubLevel(saveSubLevel3);
            subSubLevel22.setSubSubLevelName("Fish &amp; fish products");
            subSubLevelRepo.save(subSubLevel22);

            SubSubLevel subSubLevel23 = new SubSubLevel();
            subSubLevel23.setSubLevel(saveSubLevel3);
            subSubLevel23.setSubSubLevelName("Meat &amp; meat products");
            subSubLevelRepo.save(subSubLevel23);

            SubSubLevel subSubLevel24 = new SubSubLevel();
            subSubLevel24.setSubLevel(saveSubLevel3);
            subSubLevel24.setSubSubLevelName("Milk &amp; dairy products");
            subSubLevelRepo.save(subSubLevel24);

            SubSubLevel subSubLevel25 = new SubSubLevel();
            subSubLevel25.setSubLevel(saveSubLevel3);
            subSubLevel25.setSubSubLevelName("Sweets &amp; snack food");
            subSubLevelRepo.save(subSubLevel25);

            SubSubLevel subSubLevel26 = new SubSubLevel();
            subSubLevel26.setSubLevel(saveSubLevel3);
            subSubLevel26.setSubSubLevelName("Other");
            subSubLevelRepo.save(subSubLevel26);

            // Sub level saveSubLevel3 end

            // Sub level saveSubLevel4 start
            SubSubLevel subSubLevel27 = new SubSubLevel();
            subSubLevel27.setSubLevel(saveSubLevel4);
            subSubLevel27.setSubSubLevelName("Bathroom/sauna");
            subSubLevelRepo.save(subSubLevel27);

            SubSubLevel subSubLevel28 = new SubSubLevel();
            subSubLevel28.setSubLevel(saveSubLevel4);
            subSubLevel28.setSubSubLevelName("Bedroom");
            subSubLevelRepo.save(subSubLevel28);

            SubSubLevel subSubLevel29 = new SubSubLevel();
            subSubLevel29.setSubLevel(saveSubLevel4);
            subSubLevel29.setSubSubLevelName("Childrenâ€™s room");
            subSubLevelRepo.save(subSubLevel29);

            SubSubLevel subSubLevel30 = new SubSubLevel();
            subSubLevel30.setSubLevel(saveSubLevel4);
            subSubLevel30.setSubSubLevelName("Kitchen");
            subSubLevelRepo.save(subSubLevel30);

            SubSubLevel subSubLevel31 = new SubSubLevel();
            subSubLevel31.setSubLevel(saveSubLevel4);
            subSubLevel31.setSubSubLevelName("Living room");
            subSubLevelRepo.save(subSubLevel31);

            SubSubLevel subSubLevel32 = new SubSubLevel();
            subSubLevel32.setSubLevel(saveSubLevel4);
            subSubLevel32.setSubSubLevelName("Office");
            subSubLevelRepo.save(subSubLevel32);

            SubSubLevel subSubLevel33 = new SubSubLevel();
            subSubLevel33.setSubLevel(saveSubLevel4);
            subSubLevel33.setSubSubLevelName("Other (Furniture)");
            subSubLevelRepo.save(subSubLevel33);

            SubSubLevel subSubLevel34 = new SubSubLevel();
            subSubLevel34.setSubLevel(saveSubLevel4);
            subSubLevel34.setSubSubLevelName("Outdoor");
            subSubLevelRepo.save(subSubLevel34);

            SubSubLevel subSubLevel35 = new SubSubLevel();
            subSubLevel35.setSubLevel(saveSubLevel4);
            subSubLevel35.setSubSubLevelName("Project furniture");
            subSubLevelRepo.save(subSubLevel35);

            // Sub level saveSubLevel4 end


            // Sub level saveSubLevel5 start
            SubSubLevel subSubLevel36 = new SubSubLevel();
            subSubLevel36.setSubLevel(saveSubLevel5);
            subSubLevel36.setSubSubLevelName("Machinery components");
            subSubLevelRepo.save(subSubLevel36);

            SubSubLevel subSubLevel37 = new SubSubLevel();
            subSubLevel37.setSubLevel(saveSubLevel5);
            subSubLevel37.setSubSubLevelName("Machinery equipment");
            subSubLevelRepo.save(subSubLevel37);

            SubSubLevel subSubLevel38 = new SubSubLevel();
            subSubLevel38.setSubLevel(saveSubLevel5);
            subSubLevel38.setSubSubLevelName("Manufacture of machinery");
            subSubLevelRepo.save(subSubLevel38);

            SubSubLevel subSubLevel39 = new SubSubLevel();
            subSubLevel39.setSubLevel(saveSubLevel5);
            subSubLevel39.setSubSubLevelName("Maritime");
            subSubLevelRepo.save(subSubLevel39);

            SubSubLevel subSubLevel40 = new SubSubLevel();
            subSubLevel40.setSubLevel(saveSubLevel5);
            subSubLevel40.setSubSubLevelName("Metal structures");
            subSubLevelRepo.save(subSubLevel40);

            SubSubLevel subSubLevel41 = new SubSubLevel();
            subSubLevel41.setSubLevel(saveSubLevel5);
            subSubLevel41.setSubSubLevelName("Other");
            subSubLevelRepo.save(subSubLevel41);

            SubSubLevel subSubLevel42 = new SubSubLevel();
            subSubLevel42.setSubLevel(saveSubLevel5);
            subSubLevel42.setSubSubLevelName("Repair and maintenance service");
            subSubLevelRepo.save(subSubLevel42);
            // Sub level saveSubLevel5 end

            // Sub level saveSubLevel6 start
            SubSubLevel subSubLevel43 = new SubSubLevel();
            subSubLevel43.setSubLevel(saveSubLevel6);
            subSubLevel43.setSubSubLevelName("Construction of metal structures");
            subSubLevelRepo.save(subSubLevel43);

            SubSubLevel subSubLevel44 = new SubSubLevel();
            subSubLevel44.setSubLevel(saveSubLevel6);
            subSubLevel44.setSubSubLevelName("Houses and buildings");
            subSubLevelRepo.save(subSubLevel44);

            SubSubLevel subSubLevel45 = new SubSubLevel();
            subSubLevel45.setSubLevel(saveSubLevel6);
            subSubLevel45.setSubSubLevelName("Metal products");
            subSubLevelRepo.save(subSubLevel45);

            SubSubLevel subSubLevel46 = new SubSubLevel();
            subSubLevel46.setSubLevel(saveSubLevel6);
            subSubLevel46.setSubSubLevelName("Metal works");
            subSubLevelRepo.save(subSubLevel46);
            // Sub level saveSubLevel6 end


            // Sub level saveSubLevel7 start
            SubSubLevel subSubLevel47 = new SubSubLevel();
            subSubLevel47.setSubLevel(saveSubLevel7);
            subSubLevel47.setSubSubLevelName("Packaging");
            subSubLevelRepo.save(subSubLevel47);

            SubSubLevel subSubLevel48 = new SubSubLevel();
            subSubLevel48.setSubLevel(saveSubLevel7);
            subSubLevel48.setSubSubLevelName("Plastic goods");
            subSubLevelRepo.save(subSubLevel48);

            SubSubLevel subSubLevel49 = new SubSubLevel();
            subSubLevel49.setSubLevel(saveSubLevel7);
            subSubLevel49.setSubSubLevelName("Plastic processing technology");
            subSubLevelRepo.save(subSubLevel49);

            SubSubLevel subSubLevel50 = new SubSubLevel();
            subSubLevel50.setSubLevel(saveSubLevel7);
            subSubLevel50.setSubSubLevelName("Plastic profiles");
            subSubLevelRepo.save(subSubLevel50);
            // Sub level saveSubLevel7 end

            // Sub level saveSubLevel8 start
            SubSubLevel subSubLevel51 = new SubSubLevel();
            subSubLevel51.setSubLevel(saveSubLevel8);
            subSubLevel51.setSubSubLevelName("Advertising");
            subSubLevelRepo.save(subSubLevel51);

            SubSubLevel subSubLevel52 = new SubSubLevel();
            subSubLevel52.setSubLevel(saveSubLevel8);
            subSubLevel52.setSubSubLevelName("Book/Periodicals printing");
            subSubLevelRepo.save(subSubLevel52);

            SubSubLevel subSubLevel53 = new SubSubLevel();
            subSubLevel53.setSubLevel(saveSubLevel8);
            subSubLevel53.setSubSubLevelName("Labelling and packaging printing");
            subSubLevelRepo.save(subSubLevel53);
            // Sub level saveSubLevel8 end

            // Sub level saveSubLevel9 start
            SubSubLevel subSubLevel54 = new SubSubLevel();
            subSubLevel54.setSubLevel(saveSubLevel9);
            subSubLevel54.setSubSubLevelName("Clothing");
            subSubLevelRepo.save(subSubLevel54);

            SubSubLevel subSubLevel55 = new SubSubLevel();
            subSubLevel55.setSubLevel(saveSubLevel9);
            subSubLevel55.setSubSubLevelName("Textile");
            subSubLevelRepo.save(subSubLevel55);
            // Sub level saveSubLevel9 end

            // Sub level saveSubLevel10 start
            SubSubLevel subSubLevel56 = new SubSubLevel();
            subSubLevel56.setSubLevel(saveSubLevel10);
            subSubLevel56.setSubSubLevelName("Other (Wood)");
            subSubLevelRepo.save(subSubLevel56);

            SubSubLevel subSubLevel57 = new SubSubLevel();
            subSubLevel57.setSubLevel(saveSubLevel10);
            subSubLevel57.setSubSubLevelName("Wooden building materials");
            subSubLevelRepo.save(subSubLevel57);

            SubSubLevel subSubLevel58 = new SubSubLevel();
            subSubLevel58.setSubLevel(saveSubLevel10);
            subSubLevel58.setSubSubLevelName("Wooden houses");
            subSubLevelRepo.save(subSubLevel58);

            // Sub level saveSubLevel10 end


            // Sub level saveSubLevel16 start
            SubSubLevel subSubLevel59 = new SubSubLevel();
            subSubLevel59.setSubLevel(saveSubLevel16);
            subSubLevel59.setSubSubLevelName("Data processing, Web portals, E-marketing");
            subSubLevelRepo.save(subSubLevel59);

            SubSubLevel subSubLevel60 = new SubSubLevel();
            subSubLevel60.setSubLevel(saveSubLevel16);
            subSubLevel60.setSubSubLevelName("Programming, Consultancy");
            subSubLevelRepo.save(subSubLevel60);

            SubSubLevel subSubLevel61 = new SubSubLevel();
            subSubLevel61.setSubLevel(saveSubLevel16);
            subSubLevel61.setSubSubLevelName("Software, Hardware");
            subSubLevelRepo.save(subSubLevel61);

            SubSubLevel subSubLevel62 = new SubSubLevel();
            subSubLevel62.setSubLevel(saveSubLevel16);
            subSubLevel62.setSubSubLevelName("Telecommunications");
            subSubLevelRepo.save(subSubLevel62);

            // Sub level saveSubLevel16 end

            // Sub level saveSubLevel19 start
            SubSubLevel subSubLevel63 = new SubSubLevel();
            subSubLevel63.setSubLevel(saveSubLevel19);
            subSubLevel63.setSubSubLevelName("Air");
            subSubLevelRepo.save(subSubLevel63);

            SubSubLevel subSubLevel64 = new SubSubLevel();
            subSubLevel64.setSubLevel(saveSubLevel19);
            subSubLevel64.setSubSubLevelName("Rail");
            subSubLevelRepo.save(subSubLevel64);

            SubSubLevel subSubLevel65 = new SubSubLevel();
            subSubLevel65.setSubLevel(saveSubLevel19);
            subSubLevel65.setSubSubLevelName("Road");
            subSubLevelRepo.save(subSubLevel65);

            SubSubLevel subSubLevel66 = new SubSubLevel();
            subSubLevel66.setSubLevel(saveSubLevel19);
            subSubLevel66.setSubSubLevelName("Water");
            SubSubLevel saveSubSubLevel = subSubLevelRepo.save(subSubLevel66);


            Sectors sectors = new Sectors();
            sectors.setSectorName("Test");
            sectors.setLevel(saveLevel1);
            sectors.setSubLevel(saveSubLevel3);
            sectors.setSubSubLevel(saveSubSubLevel);
            sectors.setIsCheckedTerms(Boolean.TRUE);
            sectorRepo.save(sectors);
        }

    }
}
