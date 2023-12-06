import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import {Vue3ProgressPlugin} from '@marcoschulte/vue3-progress';
import router from './router/router.js';

createApp(App)
    .use(Vue3ProgressPlugin)
    .use(router)
    .mount('#app')
// console.log(__APP_ENV__)
// console.log(__SERVER_ROOT__)