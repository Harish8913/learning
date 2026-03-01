const stringType: string = "Welcome to Typescript";
const numberType: number = 12323;
const booleanType: boolean = true;
const anyType: any = [48, 3249, 2423];
const stringArray: string[] = ["a", "b", "c", "d", "e", "f", "....", "z"];
const numberArray: number[] = [1, 2, 3, 4, 5, 6, 7, 8];
const booleanArray: boolean[] = [true, false, true, true, false, true];

console.log(stringType);
console.log(numberType);
console.log(booleanType);
console.log(anyType);
console.log(stringArray);
console.log(booleanArray);
console.log(numberArray);

// Arrays and Tuples;

const myData: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const myTuple: [string, number, boolean] = ["harish", 12, true];

const myFunction = (a: number, b: number): string => {
  return `${a + b}`;
};

const genericFunction = <T extends number, K extends number>(
  v1: T,
  v2: K,
): number => {
  return v1 - v2;
};

const stringGenericFunction = <T, K>(s1: T, s2: K): string => {
  return `${s1} and ${s2}`;
};

genericFunction<number, number>(12, 12);
stringGenericFunction<string, string>("Harish", "Puri");

interface userInnerDetails {
  hobbies: string[];
  isMarried: boolean;
}

interface genericInterface<T extends userInnerDetails> {
  userName: string;
  age: number;
  otherDetails: T;
}

const newUser: genericInterface<userInnerDetails> = {
  userName: "Harish",
  age: 21,
  otherDetails: { hobbies: ["games", "love", "code"], isMarried: true },
};

console.log(newUser)
