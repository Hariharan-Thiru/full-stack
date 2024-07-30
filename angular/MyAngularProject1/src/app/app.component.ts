import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyAngularProject1';
  name : string;
  age : number;
  email : string;
  txtColor : string;

  constructor(){
    this.name="hari";
    this.age=20;
    this.email="hariharanthiru2004@gmal.com"
    this.txtColor="green";
  }

  getAddition(a:number, b:number){
    let sum=a+b;
    return sum;
  }
  changeName(){
    this.name="kabi";
  }
  changeAge(){
    this.age=25;
  }
  changeEmail(){
    this.email="gyj@gmail.com";
  }
}
