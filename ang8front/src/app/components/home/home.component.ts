import { Component, OnInit } from '@angular/core';
import { Tutorial } from 'src/app/models/tutorial.model';
import { TutorialService } from 'src/app/services/tutorial.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  public tutorial: Tutorial = new Tutorial();
  public tutorials: Tutorial[] = new Array();

  constructor(public tutorialService: TutorialService) { }

  ngOnInit(): void {
    this.findAll();
  }

  findAll():void{
    this.tutorialService.getAll().subscribe(res => {
      console.log(res);
      this.tutorials = res;
    })
  } 


  create(): void {
    if(this.tutorial.id){
        this.tutorialService.update(this.tutorial.id, this.tutorial).subscribe(res => { 
        this.tutorial = new Tutorial();
        this.findAll();
      })
   }else{
      this.tutorialService
        .create(this.tutorial)
        .subscribe(response => {
          this.tutorial = new Tutorial();
          return this.findAll(); 
        })
     }
   
} 

delete(id:any): void {      
this.tutorialService.delete(id).subscribe(response => {
return this.findAll(); 
   });
}


update(tutorial:any): void {
this.tutorial = tutorial;      
}


}
