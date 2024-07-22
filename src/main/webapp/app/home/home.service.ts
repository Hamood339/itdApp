import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  url: any;

  constructor(private httpClient: HttpClient) {
    this.url = 'http://localhost:8080/etudiant';
  }

  etudiant(): Observable<object | null> {
    return this.httpClient.get(this.url);
  }
}
