


export function Prevent(){



function handleClick(e)
{
	e.preventDefault();
	console.log('clicked',  e);
}





    return(


        <div>

            <a href="http://www.google.com" onClick={handleClick }>clickme</a>


        </div>


    )


}