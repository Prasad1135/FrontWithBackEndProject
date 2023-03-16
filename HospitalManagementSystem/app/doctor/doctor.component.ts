import { Component, OnInit } from '@angular/core';
import { Doctor } from 'model/doctor';
import { DoctorService } from 'service/doctor.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {
  doctors!: Doctor[];

  constructor(private doctorService: DoctorService) {
  }

  ngOnInit() {
    this.doctorService.findAll().subscribe(data => {
      this.doctors = data;
    });
  }
}
