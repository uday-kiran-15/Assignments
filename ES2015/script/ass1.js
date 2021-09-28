"use strict";
var cities = ['Delhi', 'Mumbai', 'Chennai'];
//here const is not allowed ie You cannot assign a new array
//cities= ['New york','London','Sydney']       //Error here
//But you can change the items of the array.
cities.splice(0, 3); //allowed
cities.push('New york', 'London', 'Sydney'); //allowed
console.log(cities);
//# sourceMappingURL=ass1.js.map