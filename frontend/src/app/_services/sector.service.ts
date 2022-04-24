import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Sector } from '../_model/Sector';
import { Level } from '../_model/Level';
import { SubLevel } from '../_model/SubLevel';
import { SubSubLevel } from '../_model/SubSubLevel';

const API_URL = 'http://localhost:8085/api/sector/';

@Injectable({
  providedIn: 'root'
})
export class SectorService {

  constructor(private http: HttpClient) { }

  getHome() {
    return this.http.get(API_URL + 'home', { responseType: 'text' });
  }

  getSectors(): Observable<Sector[]>{
    return this.http.get<Sector[]>(API_URL);
  }

  getLevels(): Observable<Level[]>{
    return this.http.get<Level[]>(API_URL + 'level');
  }

  getSubLevels(id: number): Observable<SubLevel[]>{
    return this.http.get<SubLevel[]>(API_URL + 'sub-level?id='+`${id}`);
  }

  getSubSubLevels(id: number): Observable<SubSubLevel[]>{
    return this.http.get<SubSubLevel[]>(API_URL + 'sub-sub-level?id='+`${id}`);
  }

  createSector(sector: Sector): Observable<Object>{
    return this.http.post(API_URL, sector);
  }

  getSectorById(id: number): Observable<Sector>{
    return this.http.get<Sector>(API_URL+`${id}`);
  }

  updateSector(id: number, sector: Sector): Observable<Object>{
    return this.http.put(API_URL+`${id}`, sector);
  }

  deleteSector(id: number): Observable<Object>{
    return this.http.delete(API_URL+`${id}`);
  }

}
