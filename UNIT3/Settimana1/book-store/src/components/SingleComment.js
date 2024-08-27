function SingleComment(props) {

  const handleDelete = (commentId) => {
    fetch(`https://striveschool-api.herokuapp.com/api/comments/${commentId}`, {
      method: 'DELETE',
      headers: {
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MmZhZTQzYTU2ODAwMTU4ZWMzZDMiLCJpYXQiOjE3MjQzMjk5MDMsImV4cCI6MTcyNTUzOTUwM30.s1jeWc-FEqZ5QaFDvzmqrtKBMPEXKi8Lmut4MZbfvV4",
      }
    })
      .then((response) => {
        if (response.ok) {
          //eliminato con sucesso
          props.onCommentDeleted(); // aggiorna la lista dei commenti
        } else {
          alert('Errore nella cancellazione del commento, riprova più tardi.');
          throw new Error('Errore durante la cancellazione');
        }
      })
      .catch((err) => {
        alert('Errore di rete: ' + err.message);
      });
  }


    return (
      <>
        <div className="d-flex justify-content-between" key={props._id}>
          <p>{props.comment}</p>
          <p>{props.rate}</p>
          <button onClick={() => handleDelete(props._id)}>delete</button>
        </div>
      </>
    );
}

export default SingleComment;
