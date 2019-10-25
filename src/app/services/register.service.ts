import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Petsitter} from '../model/petsitter';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  private baseUrl = 'http://localhost:8080/petsitters';

  constructor(private httpclient: HttpClient) {
  }

  public getPetsitter(): Observable<Petsitter[]> {
    return this.httpclient.get<Petsitter[]>(this.baseUrl);
  }

  // tslint:disable-next-line:ban-types
  public createPetsitter(petsitter: Object): Observable<Object> {
    return this.httpclient.post(`${this.baseUrl}`, petsitter);
  }

  /*
  list(): Observable<Petsitter[]> {
    const url = `${this.baseUrl}/`;
    return this.httpclient.get(url).pipe(map((data: any[]) => data.map(item => this.adapter.adapt(item))),
    );
  }
*/
}
