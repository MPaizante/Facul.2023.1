let n1 = 13;
let n2 =  14;
let res = n1 ^ n2;
console.log(res);

let a1 = [10 ,20, 30];
let a2 = [11, 22 , 33];
let a3 = [...a1] ;
console.log(a1);
console.log(a2);
console.log(a3);

const soma = (v1,v2,v3) => {
    return v1 + v2 + v3;
};
console.log(soma(1,5,4))
console.log(soma)

let valores = [1,5,10];
console.log(soma(...valores));


const objs = document.getElementsByTagName("div");
console.log(objs);
const objs2 = [...document.getElementsByTagName("div")];
console.log(objs2);

objs2.forEach(element =>{
    console.log(element)
});
console.log(objs2)
