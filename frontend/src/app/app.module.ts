import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SectorCreateComponent } from './_components/sector-create/sector-create.component';
import { SectorListComponent } from './_components/sector-list/sector-list.component';
import { HomeComponent } from './_components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SectorUpdateComponent } from './_components/sector-update/sector-update.component';

@NgModule({
  declarations: [
    AppComponent,
    SectorCreateComponent,
    SectorListComponent,
    HomeComponent,
    SectorUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
