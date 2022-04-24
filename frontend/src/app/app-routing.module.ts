import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './_components/home/home.component';
import { SectorCreateComponent } from './_components/sector-create/sector-create.component';
import { SectorListComponent } from './_components/sector-list/sector-list.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'sectors', component: SectorListComponent },
  { path: 'create-sector', component: SectorCreateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
