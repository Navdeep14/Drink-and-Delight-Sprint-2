import { Component, OnInit } from '@angular/core';
import { Distributor } from '../model/distributor';
import { DistributorService } from '../services/distributorservice';

@Component({
  selector: 'app-add-distributor',
  templateUrl: './add-distributor.component.html',
  styleUrls: ['./add-distributor.component.css']
})
export class AddDistributorComponent implements OnInit {
  service:DistributorService;
  constructor(service:DistributorService) {
    this.service=service;
   }

  ngOnInit(): void {
  }
  
  addedDistributor:Distributor=null;

  addDistributor(form:any){
    let details=form.value;
    let id=details.id;
    let name=details.name;
    let address=details.address;
    let phone=details.phone;
    this.addedDistributor = new Distributor();
    this.addedDistributor.distributorId=id;
    this.addedDistributor.distributorName=name;
    this.addedDistributor.distributorAddress=address;
    this.addedDistributor.distributorPhoneNo=phone;

    let result = this.service.addDistributor(this.addedDistributor);
    result.subscribe((distributor:Distributor)=>{
      this.addedDistributor=distributor;
    },
    err=>{
      console.log("error:"+err);
    }
    );
    form.reset();
  }

}
