import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
// import EventView from '../views/EventView.vue'
// import HoFView from '../views/HoFView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/#awards',
      name: 'awards',
      component: HomeView
    },
    // {
    //   path: '/#events',
    //   name: 'events',
    //   component: EventView
    // },
    // {
    //   path: '/#hof',
    //   name: 'hof',
    //   component: HoFView
    // }

  ]
})

export default router
