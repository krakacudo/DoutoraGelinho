import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import 'zone.js';
import { ClientModule } from './client/client.module';

platformBrowserDynamic().bootstrapModule(ClientModule)
  .catch(err => console.error(err))