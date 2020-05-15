import { Component, OnInit } from '@angular/core';
import { ProductDetailsDto } from '../Model/ProductDetailsDto';
import { Router } from '@angular/router';
import { errorDto } from '../Model/error';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  productdetails;
  constructor() {

    this.productdetails=new ProductDetailsDto();
    this.productdetails.orderId="102";
    this.productdetails.name="Laddoo";
    this.productdetails.distributorId=123;
    this.productdetails.quantityValue=400;
    this.productdetails.quantityUnit=6;
    this.productdetails.pricePerUnit=700;
    this.productdetails.expectedDeliveryDate="17/7/2020";
    this.productdetails.totalPrice=15000;
    this.productdetails.location="Kanpur";
    this.productdetails.deliveryStatus="On the Way";
     

  }

  ngOnInit(): void {
  }

}
