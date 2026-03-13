

function add(  ...n){

    console.log("size of args " , n.length);

    console.log(n[0])

}

add();

add(2,4,6,8);

function  test(name , ... hobbies){

    console.log("HI ",name)

    hobbies.forEach( (h1)=>{ console.log(h1)} )

}

test("javeed", 'Playing','Reading','Driving');


