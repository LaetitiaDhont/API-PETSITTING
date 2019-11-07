import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {AppComponent} from './app.component';

import {MDBBootstrapModule} from 'angular-bootstrap-md';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NavbarComponent} from './navbar/navbar.component';
import {RouterModule, Routes} from '@angular/router';
import {HomepageComponent} from './homepage/homepage.component';
import {RegisterComponent} from './register/register.component';
import {APP_BASE_HREF} from '@angular/common';
import {SeemoreComponent} from './seemore/seemore.component';
import {SearchboxComponent} from './searchbox/searchbox.component';
import {PetsittersListComponent} from './petsitters-list/petsitters-list.component';
import {HttpClientModule} from '@angular/common/http';
import {CreatePetsitterComponent} from './create-petsitter/create-petsitter.component';

const routes: Routes = [
  {path: '', component: HomepageComponent},
  {path: 'register', component: CreatePetsitterComponent},
  {path: 'petsitters', component: PetsittersListComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent,
    RegisterComponent,
    SeemoreComponent,
    SearchboxComponent,
    PetsittersListComponent,
    CreatePetsitterComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MDBBootstrapModule.forRoot(),
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [{provide: APP_BASE_HREF, useValue: '/'}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
