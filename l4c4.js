const Eventemitter=require("events");
const e1=new Eventemitter();
e1.once("start",()=>{
    console.log("Application strated");
});
e1.emit("start");
e1.emit("start");