import { Component, OnInit } from '@angular/core';
import { ProductStock } from '../model/productstock';
import { ProductStockService } from '../services/productstockservice';


@Component({
  selector: 'app-add-stock',
  templateUrl: './add-stock.component.html',
  styleUrls: ['./add-stock.component.css']
})
export class AddStockComponent implements OnInit {
  service:ProductStockService;
  constructor(service:ProductStockService) {
    this.service=service;
   }

  ngOnInit(): void {
  }
  addedStock: ProductStock=null;

  addStock(stockForm:any){
    let details = stockForm.value;
    let sid = details.sid;
    let oid = details.oid;
    let name = details.name;
    let price_unit = details.price_unit;
    let quantityValue = details.quantityValue;
    let quantityUnit = details.quantityUnit;
    let price = details.price;
    let wid = details.wid;
    let delivery = details.delivery;
    let manu = details.manu;
    let exp = details.exp;
    let check = details.check;
    let procs = details.procs;
    this.addedStock=new ProductStock();
    this.addedStock.stockId=sid;
    this.addedStock.orderId=oid;
    this.addedStock.name=name;
    this.addedStock.price_per_unit=price_unit;
    this.addedStock.quantityValue=quantityValue;
    this.addedStock.quantityUnit=quantityUnit;
    this.addedStock.price=price;
    this.addedStock.warehouseId=wid;
    this.addedStock.deliveryDate=delivery;
    this.addedStock.manuDate=manu;
    this.addedStock.expiryDate=exp;
    this.addedStock.qualityCheck=check;
    this.addedStock.processDate=procs;

    let result = this.service.addStock(this.addedStock);
    result.subscribe((stock:ProductStock)=>{
      this.addedStock=stock;
    },
    err=>{
      console.log("error:"+err);
    }
    );
    stockForm.reset();
  }

}
