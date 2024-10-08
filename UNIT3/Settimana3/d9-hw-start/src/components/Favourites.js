import { useSelector, useDispatch } from "react-redux"
import { Link } from 'react-router-dom'
import { RemoveFav } from "../redux/actions";

function Favorites() {
    const dispatch = useDispatch();
    const arrayOfBooksInTheCart = useSelector((store) => store.favorites.content)



    return (
        <>
           <h2>Ciao</h2>
           {arrayOfBooksInTheCart.map((fav, i) => {
            return(
                <div key={i}>
                    <Link to={`/${fav.company_name}`}>{fav.company_name}</Link>
                    <button onClick={() => {
                        dispatch(RemoveFav(fav._id))
                    }}>Remove</button>
                </div>
            )
           })}
        </>
    )
}
export default Favorites