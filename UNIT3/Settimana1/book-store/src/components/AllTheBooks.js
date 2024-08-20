import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

export function AllTheBooks(props) {

    return(
        <>
            <Card className='mt-4' style={{ width: '18rem' }}>
            <Card.Img variant="top" src={props.img} />
            <Card.Body>
                <Card.Title>{props.title}</Card.Title>
                <Card.Text>
                ${props.price}
                </Card.Text>
                <Button variant="primary">Compra</Button>
            </Card.Body>
            </Card>
        </>
    )
}