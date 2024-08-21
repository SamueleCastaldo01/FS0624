import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

export function BookList(props) {

    return(
        <>
        {
            props.arrayBooks.map((book) => {
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

        </>
    )
}