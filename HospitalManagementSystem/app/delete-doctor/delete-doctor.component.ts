import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from 'model/doctor';
import { DoctorService } from 'service/doctor.service';

@Component({
  selector: 'app-delete-doctor',
  templateUrl: './delete-doctor.component.html',
  styleUrls: ['./delete-doctor.component.css']
})
export class DeleteDoctorComponent implements OnInit {

  doctor: Doctor ;
  

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private doctorService: DoctorService) {
    this.doctor = new Doctor();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  deleteDoctor(id1:string){
    let id = parseInt(id1);
    this.doctorService.delete(id).subscribe(result => this.gotoDoctor());
  }
  
    gotoDoctor() {
      this.router.navigate(['../']);
    }


}
