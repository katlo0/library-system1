import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import VaultView from '../views/VaultView.vue'
import detailBookView from '../views/detailBookView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/vault',
    name: 'vault',
    component: VaultView
  },
  {
    path: '/detailBookView/:id',
    name: 'detailBookView',
    component: detailBookView,
    props: true
  },

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
