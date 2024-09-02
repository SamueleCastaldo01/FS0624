const initialState = {
  favorites: {
    content: [],
  },
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD_FAVORITES":
      return {
        ...state,
        favorites: {
          ...state.favorites,
          content: [...state.favorites.content, action.payload],
        },
      }

    default: {
      return state;
    }
  }
};

export default mainReducer;
