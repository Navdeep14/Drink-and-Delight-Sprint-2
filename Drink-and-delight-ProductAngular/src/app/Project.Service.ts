import { DistributorDetailsDto } from './Model/DistributorDetailsDto';
import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http'

import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { ProductDetailsDto } from './Model/ProductDetailsDto';
@Injectable({

    providedIn: 'root'
})

export class ProjectService
{


    url: string = "http://localhost:9090/";
    constructor(private httpClient: HttpClient) { }
  


    getDistributorDetails()
    {
      return this.httpClient.get<DistributorDetailsDto>(this.url+"DistributorDetails");
    }

    
    
    trackOrder(orderId:string)
    {
      return this.httpClient.get<ProductDetailsDto>(this.url+"trackOrder/"+orderId);
    }


    updateOrder(orderID:String,location:string,date:Date,deliveryStatus:String)
    {

      let para1=orderID;
      let para2=location;
      let para3=date;
      let para4=deliveryStatus;
      return this.httpClient.put<ProductDetailsDto>(this.url+"update/"+para1+"/"+para2+"/"+para3+"/"+para4,ProductDetailsDto);
    }

    


}



