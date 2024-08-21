import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import TextField from '@mui/material/TextField';
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
                    <Card key={book.asin} className='mt-4' style={{ width: '18rem' }}>
                    <Card.Img variant="top" src={book.img} />
                    <Card.Body>
                        <Card.Title>{book.title}</Card.Title>
                        <Card.Text>
                        ${book.price}
                        </Card.Text>
                        <Button variant="primary">Compra</Button>
                    </Card.Body>
                    </Card>
                )
            })
        }
        </div>
        </>
    )
}