// Modules
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModalComponent } from './components/modal/modal.component';

// Components

export const routes: Routes = [
  // { path: '', redirectTo: 'main', pathMatch: 'full' },
  // { path: 'modal/:functionId',  component: ModalComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
