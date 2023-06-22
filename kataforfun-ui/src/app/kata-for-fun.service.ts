import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Result } from './model/result';
import { Inject } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {


    constructor(private http: HttpClient, @Inject('SERVER_URL') private serverUrl: string) { }


    convertNumber(inputNumber: number): Observable<Result> {
      const url = `${this.serverUrl}${inputNumber}`;
      var result =this.http.get<Result>(url);
      return result;
    }

}
