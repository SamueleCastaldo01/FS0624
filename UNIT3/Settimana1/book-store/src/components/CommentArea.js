import { Component } from "react";
import CommentList from "./CommentsList";
import AddComment from "./AddComment";

class CommentArea extends Component {

    render() {
        return(
            <>
                <CommentList asin={this.props.asin}/>
                <AddComment asin={this.props.asin}/>
             
            </>
        )
    }
}

export default CommentArea;