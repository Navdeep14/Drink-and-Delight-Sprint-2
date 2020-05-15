import { Component, OnInit } from '@angular/core';
import { DistributorDetailsDto } from '../Model/DistributorDetailsDto';

import { Router } from '@angular/router';
import { ProjectService } from '../Project.Service';

@Component({
  selector: 'app-distributor-details',
  templateUrl: './distributor-details.component.html',
  styleUrls: ['./distributor-details.component.css']
})
export class DistributorDetailsComponent implements OnInit {


  distributordetails ;

  constructor() {

       this.distributordetails=new DistributorDetailsDto();
       this.distributordetails.distributor_Id=102
       this.distributordetails.distributor_Name="NAVDEEP TRIPATHI"
       this.distributordetails.distributor_Address="KANPUR NAGAR"
       this.distributordetails.distributor_Phn=8319559672
   }

  

  ngOnInit(): void {


  }

}
