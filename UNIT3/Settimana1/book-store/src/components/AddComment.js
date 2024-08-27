import { Component, useState } from "react";
import { Container, Row, Col, Form, Alert } from 'react-bootstrap'
import { TextField,Button } from "@mui/material";

function AddComment(props) {    
    const [comments, setComments] = useState({
      comment: "",
      rate: "",
      elementId: props.asin,
    })
    


      const handleChange = (e, property) => {   //questo è per i campi di input
        setComments({
          ...comments,
          [property]: e.target.value,
        })
      }



      const handleSubmit = (e) => {   //questo sarebbe il post
        e.preventDefault()
        // ora inviamo i dati alle API di EPICODE per salvare la prenotazione
        // inviamo i dati tramite una chiamata con metodo 'POST'
        fetch("https://striveschool-api.herokuapp.com/api/comments/", {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MmZhZTQzYTU2ODAwMTU4ZWMzZDMiLCJpYXQiOjE3MjQzMjk5MDMsImV4cCI6MTcyNTUzOTUwM30.s1jeWc-FEqZ5QaFDvzmqrtKBMPEXKi8Lmut4MZbfvV4"
          },
          body: JSON.stringify(comments),
        })
          .then((response) => {
            if (response.ok) {
              // svuota i campi
              setComments({
                comment: "",
                rate: "",
                elementId: ""
              })

              props.onCommentAdded(); //ricarica i commenti subito dopo aver inserito
            } else {
              alert('riprova più tardi')
              throw new Error('errore!')
            }
          })
          .catch((err) => {
            alert(err)
          })
      }
    



        return(
            <>
                <h5>Inserisci un Commento</h5>
                <form onSubmit={handleSubmit}>
                    <div>
                        <TextField className="w-100" id="outlined-basic" label="Commento" variant="outlined" required
                            onChange={(e) => {
                            handleChange(e, 'comment')}}
                            value={comments.comment}
                        />
                    </div>
                    <div>
                        <TextField className="w-100 mb-2" id="outlined-basic" label="Rate" type="number" variant="outlined" required
                            onChange={(e) => {
                            handleChange(e, 'rate')}}
                            value={comments.rate}
                        />
                    </div>

                    <Button type="submit" variant="inserisci">Invia</Button>
                </form>
             
            </>
        )
}

export default AddComment;