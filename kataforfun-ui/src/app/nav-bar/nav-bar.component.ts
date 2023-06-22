import { Component } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})
export class NavBarComponent {

  navItems: ItemWithPath[] = [{text: 'Accueil', path: 'home'}, {text: 'Kata For Fun', path: 'kata-for-fun'}];

}
