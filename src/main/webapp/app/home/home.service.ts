import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  url: any;
  urladd: any;

  constructor(private httpClient: HttpClient) {
    this.url = 'http://localhost:8080/etudiant';
    this.urladd = 'http://localhost:8080/etudiant';
  }

  getEtudiant(): Observable<object | null> {
    return this.httpClient.get(this.url);
  }

  addEtudiant(): Observable<Object | null> {
    return this.httpClient.get(this.urladd);
  }
}
