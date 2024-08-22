import { Component } from "react";

class SingleComment extends Component {

  handleDelete = (commentId) => {
    fetch(`https://striveschool-api.herokuapp.com/api/comments/${commentId}`, {
      method: 'DELETE',
      headers: {
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MmZhZTQzYTU2ODAwMTU4ZWMzZDMiLCJpYXQiOjE3MjQzMjk5MDMsImV4cCI6MTcyNTUzOTUwM30.s1jeWc-FEqZ5QaFDvzmqrtKBMPEXKi8Lmut4MZbfvV4",
      }
    })
      .then((response) => {
        if (response.ok) {
          //eliminato con sucesso
          this.props.onCommentDeleted(); // aggiorna la lista dei commenti
        } else {
          alert('Errore nella cancellazione del commento, riprova più tardi.');
          throw new Error('Errore durante la cancellazione');
        }
      })
      .catch((err) => {
        alert('Errore di rete: ' + err.message);
      });
  }

  render() {
    return (
      <>
        <div className="d-flex justify-content-between" key={this.props._id}>
          <p>{this.props.comment}</p>
          <p>{this.props.rate}</p>
          <button onClick={() => this.handleDelete(this.props._id)}>delete</button>
        </div>
      </>
    );
  }
}

export default SingleComment;
