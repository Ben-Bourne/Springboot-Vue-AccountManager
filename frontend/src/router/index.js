import Vue from 'vue'
import Router from 'vue-router'
import AddDelete from '@/components/AddDelete'
import Update from '@/components/Update'
import Search from '@/components/Search'
import ViewAll from '@/components/ViewAll'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/addordelete',
      name: 'AddDelete',
      component: AddDelete
    },
    {
      path: '/update',
      name: 'Update',
      component: Update
    },
    {
      path: '/search',
      name: 'Search',
      component: Search
    },
    {
      path: '/viewall',
      name: 'ViewAll',
      component: ViewAll
    },
    {
      path: '/',
      name: 'ViewAll',
      component: ViewAll
    }
  ]
})
