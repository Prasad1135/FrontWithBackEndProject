import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DoctorComponent } from './doctor/doctor.component';
import { DoctorFormComponent } from './doctor-Form/doctor-form.component';
import { DoctorService } from 'service/doctor.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { DeleteDoctorComponent } from './delete-doctor/delete-doctor.component';
import { UpdateDoctorComponent } from './update-doctor/update-doctor.component';

@NgModule({
  declarations: [
    AppComponent,
    DoctorComponent,
    DoctorFormComponent,
    DeleteDoctorComponent,
    UpdateDoctorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [DoctorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
