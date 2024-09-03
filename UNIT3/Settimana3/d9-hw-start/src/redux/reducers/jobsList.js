import { GET_JOB_LIST, GET_JOB_LIST_ERROR } from "../actions";

const initialState = {
    content: []
}

const JobsList = (state = initialState, action) => {
    switch (action.type) {
      case GET_JOB_LIST:
        return {
          ...state,
          jobs: action.payload,
          error: null,
        };
      case GET_JOB_LIST_ERROR:
        return {
          ...state,
          error: "Errore nel recupero dei dati",
        };
      default:
        return state;
    }
  };

export default JobsList