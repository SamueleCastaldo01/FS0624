import { Component } from "react";
import { Container, Row, Col, Form, Alert } from 'react-bootstrap'
import { TextField,Button } from "@mui/material";

class AddComment extends Component {
    state = {
        comments: {
          // lo stato iniziale del componente
          // che in questo rappresenta anche lo stato iniziale del form
          comment: "",
          rate: "",
          elementId: this.props.asin,
        },
      }


      handleChange = (e, property) => {   //questo è per i campi di input
        this.setState({
          comments: {
            ...this.state.comments,
            [property]: e.target.value,
          },
        })
      }



      handleSubmit = (e) => {   //questo sarebbe il post
        e.preventDefault()
        // ora inviamo i dati alle API di EPICODE per salvare la prenotazione
        // inviamo i dati tramite una chiamata con metodo 'POST'
        fetch("https://striveschool-api.herokuapp.com/api/comments/", {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MmZhZTQzYTU2ODAwMTU4ZWMzZDMiLCJpYXQiOjE3MjQzMjk5MDMsImV4cCI6MTcyNTUzOTUwM30.s1jeWc-FEqZ5QaFDvzmqrtKBMPEXKi8Lmut4MZbfvV4"
          },
          body: JSON.stringify(this.state.comments),
        })
          .then((response) => {
            if (response.ok) {
              // svuota i campi
              this.setState({
                comments: {
                  // lo stato iniziale del componente
                  comment: "",
                  rate: "",
                  elementId: ""
                },
              })
              this.props.onCommentAdded(); //ricarica i commenti subito dopo aver inserito
            } else {
              alert('riprova più tardi')
              throw new Error('errore!')
            }
          })
          .catch((err) => {
            alert(err)
          })
      }
    


    render() {
        return(
            <>
                <h5>Inserisci un Commento</h5>
                <form onSubmit={this.handleSubmit}>
                    <div>
                        <TextField className="w-100" id="outlined-basic" label="Commento" variant="outlined" required
                            onChange={(e) => {
                            this.handleChange(e, 'comment')}}
                            value={this.state.comments.comment}
                        />
                    </div>
                    <div>
                        <TextField className="w-100 mb-2" id="outlined-basic" label="Rate" type="number" variant="outlined" required
                            onChange={(e) => {
                            this.handleChange(e, 'rate')}}
                            value={this.state.comments.rate}
                        />
                    </div>


                    
                    <Button type="submit" variant="inserisci">Invia</Button>
                </form>
             
            </>
        )
    }
}

export default AddComment;