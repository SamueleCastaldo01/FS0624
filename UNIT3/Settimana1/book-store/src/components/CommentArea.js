import { Component } from "react";
import CommentList from "./CommentsList";

class CommentArea extends Component {

    render() {
        return(
            <>
                <h5>Commenti</h5>
                <CommentList asin={this.props.asin}/>

            </>
        )
    }
}

export default CommentArea;