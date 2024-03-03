import { NgModule } from "@angular/core";
import { ClientComponent } from "./client.component";
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from "@angular/common";
import { AppRoutingModule } from "./client-routing.module";
import { PlayerComponent } from "./players/player.component";
import { HttpClientModule } from "@angular/common/http"
import { PlayerService } from "./players/player.service";

@NgModule({
    imports: [BrowserModule, AppRoutingModule, CommonModule, HttpClientModule],
    providers: [PlayerService],
    declarations: [ClientComponent, PlayerComponent],
    bootstrap: [ClientComponent]
})
export class ClientModule{}