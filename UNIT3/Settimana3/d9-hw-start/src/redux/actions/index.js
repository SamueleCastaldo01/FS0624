export const REMOVE_FAVORITES = "REMOVE_FAVORITES"
export const ADD_FAVORITES = "ADD_FAVORITES"


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