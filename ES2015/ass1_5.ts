var add = () => 21; 

//5.b question
function userFriends(username: string, ...friends: Array<string>){
    console.log("username: ",username);
    console.log("friends: ",friends);
}

userFriends('hello','friend1','friend2','friend3','friend4','friend5');
//5.c
function capitalNames(...names: Array<string>){
    console.log();
    for(let i in names)
        console.log(names[i].toUpperCase());
}

capitalNames('friend1','friend2','friend3','friend4','friend5');