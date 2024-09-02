import { useSelector } from "react-redux"
import { Link } from 'react-router-dom'

function Favorites() {

    const arrayOfBooksInTheCart = useSelector((store) => store.favorites.content)



    return (
        <>
           <h2>Ciao</h2>
           {arrayOfBooksInTheCart.map((fav, i) => {
            return(
                <div key={i}>
                    <Link to={`/${fav.company_name}`}>{fav.company_name}</Link>
                </div>
            )
           })}
        </>
    )
}
export default Favorites