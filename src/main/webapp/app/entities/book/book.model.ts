export interface IBook {
  id?: number;
  name?: string;
  author?: string;
  publisher?: string;
  publishVerion?: string;
  price?: number;
  isbn?: string;
  remark?: string | null;
}

export class Book implements IBook {
  constructor(
    public id?: number,
    public name?: string,
    public author?: string,
    public publisher?: string,
    public publishVerion?: string,
    public price?: number,
    public isbn?: string,
    public remark?: string | null
  ) {}
}

export function getBookIdentifier(book: IBook): number | undefined {
  return book.id;
}
