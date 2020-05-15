import { Component, OnInit } from '@angular/core';
import { ProjectService } from '../Project.Service';
import { Router } from '@angular/router';
import { errorDto } from '../Model/error';

@Component({
  selector: 'app-track-order',
  templateUrl: './track-order.component.html',
  styleUrls: ['./track-order.component.css']
})
export class TrackOrderComponent implements OnInit {

  orderId:string;
  getOrderIdTable:boolean=false;
  errorinfo:errorDto;
  orders:any;

  constructor(private productService:ProjectService,private route:Router) { }

  ngOnInit(): void {
  }
 getProductOrderIdDetails()
 {
  this.getOrderIdTable=true;
  this.productService.trackOrder(this.orderId).subscribe((data)=>{
  this.orders=data;
  this.errorinfo=undefined;
  },
  error=>{
    
    this.getOrderIdTable=false;
    console.log("Exception");
    this.errorinfo=error.error;
    console.log(this.errorinfo);
   
  }
  );
  }

}
