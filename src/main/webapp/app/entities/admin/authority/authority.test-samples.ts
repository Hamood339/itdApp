import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '6e318952-ade4-4e8e-9506-7a32c87741e0',
};

export const sampleWithPartialData: IAuthority = {
  name: '554604e3-8431-48b7-bcdf-8e7508aa6ea1',
};

export const sampleWithFullData: IAuthority = {
  name: '029dd7f2-7d30-4da3-b214-d98dda0594d9',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
