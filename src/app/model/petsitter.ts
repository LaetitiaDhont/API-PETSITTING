export class Petsitter {

  public id: number;

  public firstName: string;

  public lastName: string;

  public animalAllowed: string;

  public price: number;

  public environment: object;

  public mail: string;

  public phone: string;


}

/*
/*
@Injectable({
  providedIn: 'root'
})

export class PetsitterAdapter implements Adapter<Petsitter> {

  adapt(item: any): Petsitter {
    return new Petsitter(
      item.id,
      item.firstName,
      item.lastName,
      item.animalAllowed,
      item.environment,
      item.price,
      item.mail,
      item.phone,
    );
  }
  */

