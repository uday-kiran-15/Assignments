"use strict";
var Obj = /** @class */ (function () {
    function Obj(names1) {
        this.names1 = names1;
        this.length1 = names1.length;
    }
    return Obj;
}());
var displayArray = function () {
    var objects = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        objects[_i] = arguments[_i];
    }
    //console.log("objects array: ",objects);
    for (var i in objects)
        console.log(objects[i]);
};
var names = ['uday', 'kiran', 'kondamudi'];
var names1 = names[0], names2 = names[1], names3 = names[2];
var obj1 = new Obj(names1);
var obj2 = new Obj(names2);
var obj3 = new Obj(names3);
displayArray(obj1, obj2, obj3);
//# sourceMappingURL=ass1_4.js.map