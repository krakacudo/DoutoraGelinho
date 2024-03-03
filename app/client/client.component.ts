import { Component } from '@angular/core';
import { Player } from './players/player';
import { PlayerService } from './players/player.service';

@Component({
  selector: 'app-root',
  templateUrl: './client.component.html'
})
export class ClientComponent {
  players: Player[] = [];

  constructor(private playerService: PlayerService){}

  ngOnInit(){
    this.playerService.getPlayers().subscribe(players => this.players = players);
  }
}

