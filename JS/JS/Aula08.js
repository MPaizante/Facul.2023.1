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

let num = 10;
if (num >10){
    console.log("Maior que 10");
}else{
    console.log("Menor ou igual a dez.")
}

console.log("Fim do programa");


let energia = 100;
let clima = 'Sol';

if(energia > 70 && clima == 'Sol'){
    console.log('Vou a praia.');
}else{
    console.log('Vou ao cinema.');
};



let colocacao = 3;

switch(colocacao){
    case 1:
        console.log('Primeiro lugar ouro');
        break;
    case 2:
        console.log('Segundo lugar prata.');
        break;
    case 3:
        console.log('Terceiro lugar bronze.');
        break;
    default:
        console.log('Não foi classificado.');
        break;
}

for(let i = 0; i <= 10; i = i + 1/*i++*/ ){
    console.log("Valor do i = "+i)
    if(i % 2 == 0){
        console.log(i + ' é par')

    }else{
        console.log(i +' é impar.')
    }
}

let n = [10,20,30,40,50];

for(let p = 0; p< n.length ; p++){
    console.log(n[p]);
};

console.log("");
for(a in n){
    console.log(n[a]);
};
console.log('');
for(a of n){
    console.log(n);
};

for(o of objs){
    console.log(o.innerHTML='Curso');
};

console.log('');

for(o in objs){
    console.log(objs[o].innerHTML);
    console.log(o);
};