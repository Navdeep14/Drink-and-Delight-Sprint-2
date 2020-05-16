import { Component, OnInit } from '@angular/core';
import { Distributor } from '../model/distributor';
import { DistributorService } from '../services/distributorservice';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-list-distributor',
  templateUrl: './list-distributor.component.html',
  styleUrls: ['./list-distributor.component.css']
})
export class ListDistributorComponent implements OnInit {
  distributorArray:Distributor[]=[];
  service:DistributorService;
  
  constructor(service:DistributorService) {
    this.service=service;
    let observable:Observable<Distributor[]> = this.service.fetchAllDistributors();
    observable.subscribe(
      distributors=>{
        this.distributorArray=distributors;
        console.log("length :"+this.distributorArray.length);
      },
      err=>console.log(err)
    );
  }

  ngOnInit(): void {
  }

  foundStatus=null;
  fetchedDistributor:Distributor=null;
  fetchDistributorById(form:any){
    let details=form.value;
    let id = details.id;
    let fetched:Observable<Distributor> = this.service.fetchDistributorById(id);
    fetched.subscribe(
      distributor=>{
        this.fetchedDistributor=distributor;
        this.foundStatus="found";
      },
      err=>{
        this.foundStatus="notfound";
        console.log("Unable to fetch distributor");
      }
    );
  }

}
