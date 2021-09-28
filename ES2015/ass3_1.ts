const p1 = new Promise((resolve, reject) => {
    
        console.log('The first promise has resolved');

        resolve(10);
    

});
const p2 = new Promise((resolve, reject) => {
   
        console.log('The second promise has resolved');
        resolve(20);
    
});

Promise.all([p1, p2])
    .then(results => {
        const total = results.reduce((p, c) => p + c);

        console.log(`Results: ${results}`);
        console.log(`Total: ${total}`);
    });

// function sum(sum: any) {
//     throw new Error("Function not implemented.");
// }
