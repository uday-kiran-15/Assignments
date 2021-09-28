"use strict";
var add = function () { return 21; };
//5.b question
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("username: ", username);
    console.log("friends: ", friends);
}
userFriends('hello', 'friend1', 'friend2', 'friend3', 'friend4', 'friend5');
//5.c
function capitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    console.log();
    for (var i in names)
        console.log(names[i].toUpperCase());
}
capitalNames('friend1', 'friend2', 'friend3', 'friend4', 'friend5');
//# sourceMappingURL=ass1_5.js.map