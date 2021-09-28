let emp=["marvel","characters","are","marvelous"];
let [item1,item2,item3,item4]= emp;
console.log("the third item is "+item3);

//7.b
var organization = {
    Orgname: "ABC",
    address: { country: "America", pincode: 102345}
}
let {Orgname, address: a} = organization;
console.log("matched pincode: ",a.pincode);
