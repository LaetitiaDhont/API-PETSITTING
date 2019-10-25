import {Component, OnInit} from '@angular/core';
import {Petsitter} from '../model/petsitter';
import {RegisterService} from '../services/register.service';

@Component({
  selector: 'app-petsitters-list',
  templateUrl: './petsitters-list.component.html',
  styleUrls: ['./petsitters-list.component.scss']
})
export class PetsittersListComponent implements OnInit {
  petsitterList: Petsitter[];

  constructor(private registerService: RegisterService) {
  }

  ngOnInit() {
    this.registerService.getPetsitter().subscribe(petsitter => this.petsitterList = petsitter);
  }

}
