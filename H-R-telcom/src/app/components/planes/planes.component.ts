import { Component, OnInit } from '@angular/core';
import { Plan } from 'src/app/models/Plan';
import { PlansService } from 'src/app/plans.service';

@Component({
  selector: 'app-planes',
  templateUrl: './planes.component.html',
  styleUrls: ['./planes.component.css']
})
export class PlanesComponent implements OnInit {
  planList!:Plan[];

  constructor(private planService:PlansService) { }

  ngOnInit(): void {

    this.planService.getAllPlans().subscribe(result =>{
      this.planList = result;
    })
  }

}
