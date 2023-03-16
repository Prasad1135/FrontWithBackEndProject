import { Injectable } from '@angular/core';
import { Doctor } from 'model/doctor';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private doctorUrl: string;
  constructor(private http:HttpClient) {
    this.doctorUrl = 'http://localhost:2001/doctor';
   }
   public findAll(): Observable<Doctor[]> {
    return this.http.get<Doctor[]>(this.doctorUrl);
  }

  public save(doctor: Doctor) {
    return this.http.post<Doctor>(this.doctorUrl, doctor);
  }
  public delete(id:number):Observable<Object>{
    return this.http.delete(`${this.doctorUrl}/${id}`);
  }
  public update(doctor: Doctor,id:number):Observable<Object>{
    // return this.http.put<Patient>(this.usersUrl/{pid}, patient);
     return this.http.put(`${this.doctorUrl}/${id}`,doctor);
   }
}
