import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from 'model/doctor';
import { DoctorService } from 'service/doctor.service';

@Component({
  selector: 'app-doctor-form',
  templateUrl: './doctor-form.component.html',
  styleUrls: ['./doctor-form.component.css']
})
export class DoctorFormComponent implements OnInit {
  doctor: Doctor ;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private doctorService: DoctorService){
    this.doctor = new Doctor();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  onSubmit() {
    this.doctorService.save(this.doctor).subscribe((result: any) => this.gotoDoctor());
  }
  gotoDoctor() {
    this.router.navigate(['../']);
  }

 

}
