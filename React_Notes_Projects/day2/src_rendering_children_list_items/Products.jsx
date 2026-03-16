import Electronics from "./Electronics";




export default function Products(props) {

    const products = [

            {id:101,name:"Mobile",price:12000},
            {id:102,name:"Laptop",price:42000},
            {id:103,name:"Charger",price:1000},
            {id:104,name:"PowerBank",price:3000},
            {id:105,name:"Keyboard",price:9000}


    ];



return (


        <>
        
            <h1>Prop City : {props.city}</h1>

          
            <ul>{
                
                
                    products.map( (item)=>{

                            return <li key={item.id} >{item.name}</li>


                    })
                
                
                
                
                
                }</ul>




                <br />


                <ol>
                    {

                            products.map(

                                    (item)=>{

                             return <Electronics  key={item.id}   pname={item.name}   rate={item.price} ></Electronics>

                                    }


                            )



                    }




                </ol>


                <h1>Product component render Address Child: {props.children}</h1>


        
        </>





)



}