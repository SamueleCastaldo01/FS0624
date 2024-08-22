import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import CommentArea from './CommentArea';
import { useState } from 'react';

export function SingleBook(props) {

    const [selected, setSelected] = useState(false);

    const handlerSelected = () => {
        setSelected(!selected)
    }

    return(
        <>
        <div>
            <Card
                key={props.asin}
                className="mt-4"
                style={{
                    width: '18rem',
                    border: selected ? '2px solid red' : '1px solid #ddd',
                }}
                onClick={handlerSelected}
            >
                <Card.Img variant="top" src={props.img} />
                <Card.Body>
                    <Card.Title>{props.title}</Card.Title>
                    <Card.Text>${props.price}</Card.Text>
                    <Button variant="primary">Compra</Button>
                </Card.Body>
            </Card>

            { selected &&
                <CommentArea />
            }
        </div>
        </>
    )
}