import { Component, OnInit } from '@angular/core';
import { SectorService } from 'src/app/_services/sector.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  content!: string;
  
  constructor(private sectorService: SectorService) { }

  ngOnInit() {
    this.sectorService.getHome().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }

}
