import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { DistributorDetailsComponent } from './distributor-details/distributor-details.component';
import { TrackOrderComponent } from './track-order/track-order.component';
import { UpdateOrderComponent } from './update-order/update-order.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { ProductDetailsComponent } from './product-details/product-details.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DistributorDetailsComponent,
    TrackOrderComponent,
    UpdateOrderComponent,
    HomeComponent,
    ProductDetailsComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
