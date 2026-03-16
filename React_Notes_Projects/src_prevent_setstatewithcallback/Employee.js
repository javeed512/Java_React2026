



export function  Employee(props){

        const  eventHandler  = () => {

                console.log('click event occur eventHandler() called...')
        }




        return (


                <div>
                        <h1> Name : {props.ename}</h1>
                    <button   onClick={ eventHandler } >Click</button>


                </div>


        )

}