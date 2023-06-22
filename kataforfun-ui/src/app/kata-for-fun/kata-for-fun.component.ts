import { Component, EventEmitter, Output } from '@angular/core';
import { KataForFunService } from '../kata-for-fun.service';
import { Result } from '../model/result';
import { Subscription } from 'rxjs';



@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent {

    convertedValues: string[] = [];
    convertedValue: string;
    constructor(private kataForFunService: KataForFunService) { }


  convertNumber(inputNumber: number): void {
    this.kataForFunService.convertNumber(inputNumber)
    .subscribe(
      (response: Result)=> {
        this.convertedValue= response.result;
        this.convertedValues.push(inputNumber+" and the result is "+this.convertedValue);
      }
    );  }

}

