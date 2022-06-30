import { Component, Input, OnInit } from '@angular/core';


@Component({
  selector: 'app-typescrip-practicing',
  templateUrl: './typescrip-practicing.component.html',
  styleUrls: ['./typescrip-practicing.component.scss']
})
export class TypescripPracticingComponent implements OnInit {

  constructor() { }

  ngOnInit() { }

  name = "Gilberto Domingos"


  sair(){
    "Texto ou função : SAINDO FORA";
  }
  




  @Input() private firstName: string
  @Input() private lastName: string

    get nomeCompleto() {
      return `${this.firstName} ${this.lastName}`
  }











   /*
  function myfuc(any:x, any:y) {
    return x + y;
  }

  let num = 2;
 
  let number = 4;
  number.map(valor => valor * 2);
*/
}
