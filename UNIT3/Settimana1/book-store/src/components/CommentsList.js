import { Component } from "react";
import SingleComment from "./SingleComment";

class CommentList extends Component {



    render() {

        console.log(this.props.asin)
        return(
            <>
            <h5>Commenti</h5>
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