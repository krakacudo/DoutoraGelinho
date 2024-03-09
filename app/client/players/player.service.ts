import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http"
import { Player } from "./player";
import { Observable } from "rxjs";
import { environment } from "../../environments/environment";

@Injectable({
    providedIn:'root'
})
export class PlayerService{
    constructor(private http: HttpClient){}

    getPlayers() : Observable<Player[]> {
        return this.http.get<Player[]>(environment.apiUrl);
    }

}