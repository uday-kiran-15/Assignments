"use strict";
var p1 = new Promise(function (resolve, reject) {
    console.log('The first promise has resolved');
    resolve(10);
});
var p2 = new Promise(function (resolve, reject) {
    console.log('The second promise has resolved');
    resolve(20);
});
Promise.all([p1, p2])
    .then(function (results) {
    var total = results.reduce(function (p, c) { return p + c; });
    console.log("Results: " + results);
    console.log("Total: " + total);
});
// function sum(sum: any) {
//     throw new Error("Function not implemented.");
// }
//# sourceMappingURL=ass3_1.js.map