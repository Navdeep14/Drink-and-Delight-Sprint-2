import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Distributor } from '../model/distributor';
import { Observable } from 'rxjs';

@Injectable()
export class DistributorService{
    client:HttpClient;
    constructor(client:HttpClient){
        this.client=client;
    }


    baseUrl = "http://localhost:8086/products";

    addDistributor(distributor:Distributor):Observable<Distributor>{
        let url = this.baseUrl+"/adddistributor";
        let result :Observable<Distributor> = this.client.post<Distributor>(url,distributor);
        return result;
    }

    fetchDistributorById(id:number):Observable<Distributor>{
        let url = this.baseUrl+'/getD/'+id;
        let result:Observable<Distributor> = this.client.get<Distributor>(url);
        return result;
    }

    fetchAllDistributors():Observable<Distributor[]>{
        let url = this.baseUrl+"/getDistributor";
        let result:Observable<Distributor[]> = this.client.get<Distributor[]>(url);
        return result;
    }
}