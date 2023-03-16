import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeleteDoctorComponent } from './delete-doctor/delete-doctor.component';
import { DoctorFormComponent } from './doctor-Form/doctor-form.component';
import { DoctorComponent } from './doctor/doctor.component';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';

const routes: Routes = [
  { path: 'doctor', component: DoctorComponent },
  { path: 'adddoctor', component: DoctorFormComponent },
  { path: 'deletedoctor', component:DeleteDoctorComponent },
  {path:"updatedoctor", component:UpdateDoctorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
