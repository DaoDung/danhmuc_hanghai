import Vue from 'vue'
import Router from 'vue-router'

const routerOptions = [
  { path: '/payment/:id/:documentname/:documentyear/:maritimecode', component: 'Landing', props: true },
  { path: '/payment/:id/:documentname/:documentyear/:maritimecode/success', component: 'LandingSuccess', props: true },
  { path: '/payment/:id/:documentname/:documentyear/:maritimecode/upload', component: 'Upload', props: true },
  { path: '*', component: 'NotFound' }
]

const routes = routerOptions.map(route => {
  return {
    ...route,
    component: () => import(`@/components/${route.component}.vue`)
  }
})

Vue.use(Router)

const router = new Router({
  // mode: 'history',
  routes
})

export default router
