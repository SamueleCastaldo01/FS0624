import { GET_JOB_LIST } from "../actions";

const initialState = {
    content: []
}

const JobsList = (state = initialState, action) => {
    switch (action.type) {
        case GET_JOB_LIST:
            return {
              ...state,
              content: action.payload, // cioè l'array di libri
            }

    
        
        default: {
          return state;
        }
      }
}

export default JobsList