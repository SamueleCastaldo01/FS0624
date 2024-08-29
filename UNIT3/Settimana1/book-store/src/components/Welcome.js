import Alert from 'react-bootstrap/Alert';

export function Welcome() {
    return(
        <>
<Alert variant="secondary">
      <Alert.Heading>Benvenuto in negozio</Alert.Heading>
      <p data-testid="welcome-message">
        Aww yeah, you successfully read this important alert message. This
        example text is going to run a bit longer so that you can see how
        spacing within an alert works with this kind of content.
      </p>
      <hr />
      <p className="mb-0">
        Questo è il sottotitolo
      </p>
    </Alert>
        </>
    )
}