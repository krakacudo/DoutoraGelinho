import { ClientComponent } from './client/client.component';
import { appConfig } from './client/client.config';
import { bootstrapApplication } from '@angular/platform-browser';
import 'zone.js';

bootstrapApplication(ClientComponent, appConfig)
  .catch(err => console.error(err));