"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const stringType = "Welcome to Typescript";
const numberType = 12323;
const booleanType = true;
const anyType = [48, 3249, 2423];
const stringArray = ["a", "b", "c", "d", "e", "f", "....", "z"];
const numberArray = [1, 2, 3, 4, 5, 6, 7, 8];
const booleanArray = [true, false, true, true, false, true];
console.log(stringType);
console.log(numberType);
console.log(booleanType);
console.log(anyType);
console.log(stringArray);
console.log(booleanArray);
console.log(numberArray);
// Arrays and Tuples;
const myData = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const myTuple = ["harish", 12, true];
const myFunction = (a, b) => {
    return `${a + b}`;
};
const genericFunction = (v1, v2) => {
    return v1 - v2;
};
const stringGenericFunction = (s1, s2) => {
    return `${s1} and ${s2}`;
};
genericFunction(12, 12);
stringGenericFunction("Harish", "Puri");
const newUser = {
    userName: "Harish",
    age: 21,
    otherDetails: { hobbies: ["games", "love", "code"], isMarried: true },
};
console.log(newUser);
//# sourceMappingURL=index.js.map