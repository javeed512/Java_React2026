

class Demo{


          sid:number = 101;
          sname:string = "Tommy";


          public constructor(){

                console.log("Demo() is called.");
          }

        m1(){

                console.log("m1() is called")

                console.log(this.sid)

                console.log(this.sname)

                return 99;

        }



}

 let  d =  new Demo();

 d.m1();