import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
     title = 'BOOK';
  // name : String;
  // age: number;
  // email:String;
  // txtcolor:String;
  // imgsrc :String;

  // fname : String;

  // constructor(){
  //   this.name="kirthi";
  //   this.age=21;
  //   this.email="kirthi@gmail.com";
  //   this.txtcolor="red";
  //   this.imgsrc ="./Assets/logo.png";
  //   this.fname="";
  // changeName(){
  //   this.name="kabi";
  // }
  // changeage(){
  //   this.age=20;
  // }
  // changemail(){
  //   this.email="kumar@gmail.com";
  // }
  // changeimg(){
  //   this.imgsrc="./Assets/logo2.png";
  // }
//

sum : number;
constructor(private calc : CalculatorService){
  this.sum=calc.getAddition(10,20);
}





}
