import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { ModalComponent } from '../components/modal/modal.component';

export const routes: Routes = [
  // { path: '', redirectTo: 'main', pathMatch: 'full' },
  { path: 'modal/:functionId',  component: ModalComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
  declarations: []
})
export class AppRoutingModule { }
