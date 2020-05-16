import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddStockComponent } from './add-stock/add-stock.component';
import { ListStockComponent } from './list-stock/list-stock.component';
import { AddDistributorComponent } from './add-distributor/add-distributor.component';
import { ListDistributorComponent } from './list-distributor/list-distributor.component';
import { StockMgtComponent } from './stock-mgt/stock-mgt.component';


const routes: Routes = [
  {
    path:'stock-mgt',
    component:StockMgtComponent
  }
  ,
  {
    path:'add-stock',
    component: AddStockComponent
  }
  ,
  {
    path:'list-stock',
    component:ListStockComponent
  }
  ,
  {
    path:'add-distributor',
    component:AddDistributorComponent
  }
  ,
  {
    path:"list-distributor",
    component:ListDistributorComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
