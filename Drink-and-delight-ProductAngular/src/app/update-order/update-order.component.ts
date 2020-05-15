import { Component, OnInit } from '@angular/core';
import { ProductDetailsDto } from '../Model/ProductDetailsDto';
import { ProjectService } from '../Project.Service';
import { errorDto } from '../Model/error';


@Component({
  selector: 'app-update-order',
  templateUrl: './update-order.component.html',
  styleUrls: ['./update-order.component.css']
})
export class UpdateOrderComponent implements OnInit {

  

  

  

  expectedDeliveryDate:Date;
  orderId:string;
  location:string;
  deliveryStatus:String="picked";
  orders:any=null;
  errorinfo:errorDto;
  

  order:any;
  constructor(private productService:ProjectService) { }

  
  ngOnInit(): void {


    
   
  }
    updateOrder()
    {



      if(window.confirm('track details are updating'))
      {
      this.productService. updateOrder(this.orderId,this.location,this.expectedDeliveryDate,this.deliveryStatus).subscribe((data)=>{
        this.orders=data;
        this.errorinfo=undefined;
        },
        error=>{
          
          console.log("Exception");
          this.errorinfo=error.error;
          console.log(this.errorinfo);
         
        });
      }
    }

}
