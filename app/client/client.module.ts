import { NgModule } from "@angular/core";
import { ClientComponent } from "./client.component";
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from "@angular/common";
import { AppRoutingModule } from "./client-routing.module";
import { PlayerComponent } from "./players/player.component";
import { HttpClientModule } from "@angular/common/http"
import { PlayerService } from "./players/player.service";
import { MatButtonModule } from "@angular/material/button";
import { MatIconModule } from "@angular/material/icon";
import { MatDividerModule } from '@angular/material/divider';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';

@NgModule({
    imports: [BrowserModule, AppRoutingModule, CommonModule, HttpClientModule, MatButtonModule, MatIconModule, MatDividerModule],
    providers: [PlayerService, provideAnimationsAsync()],
    declarations: [ClientComponent, PlayerComponent],
    bootstrap: [ClientComponent]
})
export class ClientModule{}