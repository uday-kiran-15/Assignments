class Account{
    constructor (public id: number , public name:string ,  public balance:number){

    }
    totalBalance(){
         return this.balance;

    }

}
class SavingsAccount extends Account{
    constructor(id: number , name:string , balance:number, interest: number){
        super(id ,name ,balance= balance+(balance*interest)/100);
    }
}
class CurrentAccount extends Account{
    constructor(id: number , name:string , balance:number , cash_credit: number){
        super(id ,name ,balance= balance+cash_credit);

    }

}
let savingsAccount =new SavingsAccount(9,"uday",250000,10);
let currentAccount =new CurrentAccount(27,"uday",250000,1000);

console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());