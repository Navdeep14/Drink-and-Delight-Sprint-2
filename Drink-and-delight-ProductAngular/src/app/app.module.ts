import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddStockComponent } from './add-stock/add-stock.component';
import { AddDistributorComponent } from './add-distributor/add-distributor.component';
import { ListStockComponent } from './list-stock/list-stock.component';
import { ListDistributorComponent } from './list-distributor/list-distributor.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { StockMgtComponent } from './stock-mgt/stock-mgt.component';
import { ProductStockService } from './services/productstockservice';
import { DistributorService } from './services/distributorservice';

@NgModule({
  declarations: [
    AppComponent,
    AddStockComponent,
    AddDistributorComponent,
    ListStockComponent,
    ListDistributorComponent,
    StockMgtComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ProductStockService, DistributorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
