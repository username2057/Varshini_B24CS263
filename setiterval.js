function sayHello(){
    console.log("Hello");
}
let id=setInterval(sayHello,2000);
setTimeout(()=>{
    clearInterval(id);
},7000);