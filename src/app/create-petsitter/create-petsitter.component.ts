import {Component, OnInit} from '@angular/core';
import {Petsitter} from '../model/petsitter';
import {RegisterService} from '../services/register.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-petsitter',
  templateUrl: './create-petsitter.component.html',
  styleUrls: ['./create-petsitter.component.scss']
})
export class CreatePetsitterComponent implements OnInit {
  petsitter: Petsitter = new Petsitter();
  submitted = false;


  constructor(private registerService: RegisterService) {
  }

  ngOnInit() {}



  newPetsitter(): void {
    this.submitted = false;
    this.petsitter = new Petsitter();
  }

  save() {
    this.registerService.createPetsitter(this.petsitter)
      .subscribe(data => console.log(data), error => console.log(error));
    this.petsitter = new Petsitter();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }





}
