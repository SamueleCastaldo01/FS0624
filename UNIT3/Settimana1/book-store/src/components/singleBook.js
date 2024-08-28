import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";

export function SingleBook({ title, img, price, asin, onSelect, isSelected }) {
  return (
    <div>
      <Card
        key={asin}
        className="mt-4"
        style={{
          width: "18rem",
          border: isSelected ? "2px solid red" : "1px solid #ddd",
        }}
        onClick={() => onSelect(asin)} // Notifica la selezione al componente padre
      >
        <Card.Img variant="top" src={img} />
        <Card.Body>
          <Card.Title>{title}</Card.Title>
          <Card.Text>${price}</Card.Text>
          <Button variant="primary">Compra</Button>
        </Card.Body>
      </Card>
    </div>
  );
}
