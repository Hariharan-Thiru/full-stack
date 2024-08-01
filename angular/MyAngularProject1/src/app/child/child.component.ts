import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  sum : number;
  sub : number;
  mul : number;
  div : number;

  constructor(private calc : CalculatorService){
    this.sum= calc.getAddition(20,2);
    this.sub= calc.getSubtraction(10,5);
    this.mul= calc.getMultiplication(3,6);
    this.div= calc.getDivision(5,2);
  }

}
