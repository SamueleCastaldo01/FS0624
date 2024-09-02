const initialState = {
  favorites: {
    content: [],
  },
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD_FAVORITES":
      const newState = {
        ...state,
        favorites: {
          ...state.favorites,
          content: [...state.favorites.content, action.payload],
        },
      };
      // Aggiungi il console.log per verificare lo stato
      console.log("Azione:", action);
      console.log("Stato precedente:", state);
      console.log("Nuovo stato:", newState);
      return newState;

    default: {
      return state;
    }
  }
};

export default mainReducer;
