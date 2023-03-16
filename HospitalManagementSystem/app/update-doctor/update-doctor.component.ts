import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from 'model/doctor';
import { DoctorService } from 'service/doctor.service';

@Component({
  selector: 'app-update-doctor',
  templateUrl: './update-doctor.component.html',
  styleUrls: ['./update-doctor.component.css']
})
export class UpdateDoctorComponent implements OnInit {

  doctor: Doctor ;
 
  id:any;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private doctorService: DoctorService) {
    this.doctor = new Doctor();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  updateDoctor(doctor:Doctor){
    let id = parseInt(doctor.id);
    this.doctorService.update(this.doctor,id).subscribe(result => {
      console.log("Update doctor"+result);
      this.gotoDoctor()});
  }

  gotoDoctor() {
    this.router.navigate(['../']);
  }

}
