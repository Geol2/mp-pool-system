import MainComponent from "/@components/MainComponent.vue";
import LoginComponent from "/@components/LoginComponent.vue";
import { defineComponent } from "vue";

const NotFound = defineComponent({
  template: "<div>Not Found</div>",
});

const routes = [
  { path: "/", component: MainComponent, alias: "/" },
  { path: "/login", component: LoginComponent, alias: "/login" },
  { path: "/main", component: MainComponent, alias: "/main" },
];

export default routes;
