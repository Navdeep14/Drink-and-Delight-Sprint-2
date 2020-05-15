import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DistributorDetailsComponent } from './distributor-details/distributor-details.component';
import { UpdateOrderComponent } from './update-order/update-order.component';
import { TrackOrderComponent } from './track-order/track-order.component';
import { HomeComponent } from './home/home.component';
import { ProductDetailsComponent } from './product-details/product-details.component';











const routes: Routes = [
  { path: 'distributorDetails', component: DistributorDetailsComponent },
  { path: "updateOrder", component: UpdateOrderComponent  },
  {path:"trackOrder",component:TrackOrderComponent},
  {  path :'home',component:HomeComponent},
  { path : "productdetails",component: ProductDetailsComponent}

  
  
];




@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
