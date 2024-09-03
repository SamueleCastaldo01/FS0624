import { configureStore, combineReducers } from '@reduxjs/toolkit';
import FavoritesRed from '../reducers/favorites'; // Importa automaticamente l'index.js
import JobsList from '../reducers/jobsList';

const bigReducer = combineReducers({
  favorites: FavoritesRed, // Combina i reducer sotto la chiave 'favorites'
  jobs: JobsList,
});

const store = configureStore({
  reducer: bigReducer, // Usa bigReducer come reducer principale
});

export default store;
