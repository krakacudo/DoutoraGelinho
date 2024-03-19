import { Component, ElementRef, Renderer2, ViewChild, ViewEncapsulation } from '@angular/core';
import { Player } from './players/player';
import { PlayerService } from './players/player.service';
import { MatMenu } from '@angular/material/menu';


@Component({
  selector: 'app-root',
  templateUrl: './client.component.html',
  encapsulation: ViewEncapsulation.None
})
export class ClientComponent {
  players: Player[] = [];

  constructor(){
    //private playerService: PlayerService
  }

  ngOnInit(){
    
    //this.playerService.getPlayers().subscribe(players => this.players = players);
  }
}

