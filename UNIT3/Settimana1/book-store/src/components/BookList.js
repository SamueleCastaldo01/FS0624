import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import TextField from '@mui/material/TextField';
import { SingleBook } from './singleBook';
import { useState } from 'react';

export function BookList(props) {
    const [inpRicerca, setInpRicerca] = useState("")

        // Funzione per filtrare i libri in base al campo di ricerca
        const filteredBooks = props.arrayBooks.filter((book) =>
            book.title.toLowerCase().includes(inpRicerca.toLowerCase())
        );

    return(
        <>
        <div>
            <TextField id="outlined-basic" label="Ricerca" variant="outlined" onChange={(e) => {setInpRicerca(e.target.value)}}/>
        </div>
        <div className='d-flex flex-wrap justify-content-between p-5'>
        {
            filteredBooks.map((book) => {
                return(
                    <SingleBook title={book.title}
                    img={book.img}
                     price={book.price} asin={book.asin}/>

                )
            })
        }
        </div>
        </>
    )
}