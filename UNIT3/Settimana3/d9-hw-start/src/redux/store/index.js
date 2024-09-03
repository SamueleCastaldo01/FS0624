import { configureStore, combineReducers } from '@reduxjs/toolkit';
import FavoritesRed from '../reducers/favorites';
import JobsList from '../reducers/jobsList';

const bigReducer = combineReducers({
  favorites: FavoritesRed, 
  jobs: JobsList,
});

const store = configureStore({
  reducer: bigReducer, 
});

export default store;
