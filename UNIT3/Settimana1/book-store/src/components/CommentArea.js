import { Component } from "react";
import CommentList from "./CommentsList";
import AddComment from "./AddComment";

class CommentArea extends Component {
    state = {
        comments: [], // so già che recupererò dalle API un array di prenotazioni
        // per questo motivo inizializzo la proprietà dello stato in cui le salverò
        // come un ARRAY VUOTO
        isLoading: true,
        isError: false,
      }


      componentDidMount() {
        this.fetchComments();
      }


      fetchComments = () => {
        // recuperiamo tramite una chiamata API le nostre prenotazioni
        fetch("https://striveschool-api.herokuapp.com/api/comments/" + this.props.asin, {
            headers: {
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MmZhZTQzYTU2ODAwMTU4ZWMzZDMiLCJpYXQiOjE3MjQzMjk5MDMsImV4cCI6MTcyNTUzOTUwM30.s1jeWc-FEqZ5QaFDvzmqrtKBMPEXKi8Lmut4MZbfvV4"
            }
            })
          .then((response) => {
            // finale buono :)
            if (response.ok) {
              // la chiamata ha tornato 200
              return response.json()
            } else {
              // la chiamata ha tornato 400, 401, 403, 404, 500
              throw new Error('La chiamata non è andata a buon fine')
            }
          })
          .then((arrayOfComments) => {
            console.log('PRENOTAZIONI RECUPERATE DAL SERVER', arrayOfComments)
            this.setState({
              comments: arrayOfComments,
              isLoading: false,
            })
          })
          .catch((err) => {
            // finale cattivo :( problema di rete?
            console.log('ERRORE NEL RECUPERO DATI (internet)?', err)
            // spegniamo lo spinner anche qua!
            this.setState({
              isLoading: false, // spegniamo lo spinner
              isError: true, // accendiamo l'errore
            })
          })
      }

    render() {
        return(
            <>
                <CommentList comments={this.state.comments} isLoading={this.state.isLoading} isError={this.state.isError} asin={this.props.asin}/>
                <AddComment asin={this.props.asin} onCommentAdded={this.fetchComments}/>
             
            </>
        )
    }
}

export default CommentArea;