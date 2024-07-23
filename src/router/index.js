import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AwardView from '../views/AwardView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/awards',
      name: 'awards',
      component: HomeView
    },
    {
      path: '/award/:id',
      name: 'award',
      component: AwardView,
      props: true,
    }
  ]
})

export default router
