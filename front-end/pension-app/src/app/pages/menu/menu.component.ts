import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private router: Router) { }
  routerUrl = this.router.url;

  ngOnInit(): void {
  }

  onRedirectClick(path: string) {
    this.router.navigate([`${path}`]);
  }

}
