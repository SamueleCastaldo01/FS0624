import TextField from '@mui/material/TextField';
import { SingleBook } from './singleBook';
import CommentArea from './CommentArea';
import { useState } from 'react';

export function BookList(props) {
    const [inpRicerca, setInpRicerca] = useState("")
    const [selectedAsin, setSelectedAsin] = useState(null);

    // Funzione per filtrare i libri in base al campo di ricerca
    const filteredBooks = props.arrayBooks.filter((book) =>
        book.title.toLowerCase().includes(inpRicerca.toLowerCase()) ||
        book.category.toLowerCase().includes(inpRicerca.toLowerCase())

    );

    // Funzione per gestire la selezione del libro. Viene richiamata da singleBook
    const handleBookSelect = (asin) => {
        setSelectedAsin(asin === selectedAsin ? null : asin); // Deseleziona se clicchi sullo stesso libro
    };

    return(
        <>
        <div className='row'>
            <div className='col-6'>
            <div>
            <TextField id="outlined-basic" label="Ricerca" variant="outlined" onChange={(e) => {setInpRicerca(e.target.value)}}/>
        </div>
        <div className='d-flex flex-wrap justify-content-between p-5'>
        {
            filteredBooks.map((book) => {
                return(
                    <>
                        <SingleBook title={book.title}
                        img={book.img}
                        price={book.price} asin={book.asin} onSelect={handleBookSelect} isSelected={book.asin === selectedAsin}/>              
                     </>
                )
            })
        }
        </div>
            </div>

            {/*****************Colonna di destra */}
            <div className='col-6'>
                {selectedAsin && <CommentArea asin={selectedAsin} />} {/* Mostra CommentArea solo se un libro è selezionato */}
            </div>


        </div>

        </>
    )
}