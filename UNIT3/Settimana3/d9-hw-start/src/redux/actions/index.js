export const REMOVE_FAVORITES = "REMOVE_FAVORITES"
export const ADD_FAVORITES = "ADD_FAVORITES"
export const GET_JOB_LIST = "GET_JOB_LIST"


export const RemoveFav = (sel) => {
    return {
    type: REMOVE_FAVORITES,
    payload: sel
    }
}

export const AddFav = (sel) => {
    return {
        type: ADD_FAVORITES,
        payload: sel
    }
}

export const getJobList = (query) => {
    return async (dispatch) => {
      const baseEndpoint = "https://strive-benchmark.herokuapp.com/api/jobs?search=";
  
      try {
        const response = await fetch(baseEndpoint + query + "&limit=20");
        if (response.ok) {
          const { data } = await response.json();
          dispatch({
            type: GET_JOB_LIST,
            payload: data,
          });
        } else {
          alert("Error fetching results");
        }
      } catch (error) {
        console.log(error);
      }
    };
  };