import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  id: number;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.id = +this.route.snapshot.paramMap.get('functionId');
  }

  // tslint:disable-next-line:use-life-cycle-interface
  ngDoCheck() {
    this.id = +this.route.snapshot.paramMap.get('functionId');
  }

}
