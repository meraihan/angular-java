import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Level } from 'src/app/_model/Level';
import { Sector } from 'src/app/_model/Sector';
import { SubLevel } from 'src/app/_model/SubLevel';
import { SubSubLevel } from 'src/app/_model/SubSubLevel';
import { SectorService } from 'src/app/_services/sector.service';

@Component({
  selector: 'app-sector-create',
  templateUrl: './sector-create.component.html',
  styleUrls: ['./sector-create.component.css']
})
export class SectorCreateComponent implements OnInit {
  sector: Sector = new Sector();
  levels!: any[]; 
  subLevels!:any[];
  subSubLevels!:any[];

  constructor(private sectorService: SectorService,
    private router: Router) { }

  ngOnInit(): void {
    this.reloadLevel();
  }

  saveSector(){
    this.sectorService.createSector(this.sector).subscribe( data =>{
      console.log(data);
      this.goToSectorList();
    },
    error => console.log(error));
  }

  goToSectorList(){
    this.router.navigate(['sectors']);
  }

  createSector(){
    this.router.navigate(['create-sector']);
  }
  
  onSubmit(){
    console.log(this.sector);
    this.saveSector();
  }

  reloadLevel(){
    this.sectorService.getLevels().subscribe(data => {
      this.levels = data;
    });
  }

  updateUser(id: number){
    this.router.navigate(['update-user', id]);
  }

  reloadSubLevel(subLevel: any){
    let getValue = subLevel.target.value;
    this.sectorService.getSubLevels(getValue).subscribe(data => {
      this.subLevels = data;
      console.log(this.subLevels);
    });
  }
  

  reloadSubSubLevel(subSubLevel: any){
    let getValue = subSubLevel.target.value;
    this.sectorService.getSubSubLevels(getValue).subscribe(data => {
      this.subSubLevels = data;
      console.log(this.subSubLevels);
    });
  }

}
