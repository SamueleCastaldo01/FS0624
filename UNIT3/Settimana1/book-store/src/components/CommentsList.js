import { Component } from "react";
import SingleComment from "./SingleComment";
import { Alert } from "react-bootstrap";
import CircularProgress from '@mui/material/CircularProgress';

class CommentList extends Component {



    render() {

        console.log(this.props.asin)
        return(
            <>
            <h5>Commenti</h5>
            {this.props.isLoading &&
            <CircularProgress /> 
            }
            {this.props.isError && (
                <Alert variant="danger">
                  Oops! Qualcosa è andato storto 😱
                </Alert>     
            )}

                {this.props.comments.map((comment)=> {
                    return(
                        <SingleComment comment={comment.comment} rate={comment.rate}/>
                    )
                })}
                
            </>
        )
    }
}

export default CommentList;