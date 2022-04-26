import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Sector } from 'src/app/_model/Sector';
import { SectorService } from 'src/app/_services/sector.service';

@Component({
  selector: 'app-sector-update',
  templateUrl: './sector-update.component.html',
  styleUrls: ['./sector-update.component.css']
})
export class SectorUpdateComponent implements OnInit {

  id!: number;
  sector: Sector = new Sector();

  levels!: any[]; 
  subLevels!:any[];
  subSubLevels!:any[];


  constructor(private sectorService: SectorService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.reloadLevel();
    this.sectorService.getSectorById(this.id).subscribe(data => {
      this.sector = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.sectorService.updateSector(this.id, this.sector).subscribe( data =>{
      this.goToSectorList();
    }
    , error => console.log(error));
  }

  goToSectorList(){
    this.router.navigate(['sectors']);
  }

  reloadLevel(){
    this.sectorService.getLevels().subscribe(data => {
      this.levels = data;
    });
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
