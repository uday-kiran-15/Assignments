class Obj{
    names1;
    length1;
    constructor(names1:string){
        this.names1 = names1;
        this.length1 = names1.length;
    }
}

let displayArray = (...objects: Array<object>) =>{
    //console.log("objects array: ",objects);
    for(let i in objects)
    console.log(objects[i]);
}

let names = ['uday', 'kiran', 'kondamudi'];
let [names1, names2, names3] = names;
const obj1 = new Obj(names1);
const obj2 = new Obj(names2);
const obj3 = new Obj(names3);

displayArray(obj1,obj2,obj3);