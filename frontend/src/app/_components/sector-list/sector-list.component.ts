import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Sector } from 'src/app/_model/Sector';
import { SectorService } from 'src/app/_services/sector.service';

@Component({
  selector: 'app-sector-list',
  templateUrl: './sector-list.component.html',
  styleUrls: ['./sector-list.component.css']
})
export class SectorListComponent implements OnInit {
  sectors: Sector[] = [];


  constructor(private sectorService: SectorService,
    private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  getSectors(){
    this.sectorService.getSectors().subscribe(data => {
      this.sectors = data;
    });
  }

  createSector(){
    this.router.navigate(['create-sector']);
  }

  updateSector(id: number){
    this.router.navigate(['update-sector', id]);
  }

  deleteSector(id: number){
    this.sectorService.deleteSector(id).subscribe( data => {
      console.log(data);
      this.reloadData();
    })
  }

  reloadData() {
    this.getSectors();
  }

}
