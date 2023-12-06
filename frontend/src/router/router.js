import { defineComponent } from 'vue'

const NotFound = defineComponent({
    template: '<div>Not Found</div>',
})

const routes = [
    { path: '/', redirect: '/'},
]

export default routes