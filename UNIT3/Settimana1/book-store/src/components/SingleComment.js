import { Component } from "react";

class SingleComment extends Component {

    render() {
        return(
        <>
                 <div className="d-flex justify-content-between">
                            <p>{this.props.comment}</p>
                            <p>{this.props.rate}</p>
                            
                        </div>
        </>
        )
    }
}

export default SingleComment;